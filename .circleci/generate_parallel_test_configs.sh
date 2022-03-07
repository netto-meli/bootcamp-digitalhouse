#!/bin/bash

# see https://medium.com/@edwardawebb/parallel-testing-in-circleci-with-maven-and-spring-boot-f47266884706

# find all test files for this stage (Surefire test stage), translating files to classnames
circleci tests glob src/test/java/**/*Test*.java |\
            sed -e 's#^src/test/java/\(.*\)\.java#\1#' | tr "/" "." > surefire_classnames

# split the classnames by timing to get those assigned to this node
cat surefire_classnames | circleci tests split --split-by=timings --timings-type=classname > /tmp/this_node_tests 

# use grep to invert the include list to an exclude list
cat surefire_classnames | grep -xvf /tmp/this_node_tests > $1
