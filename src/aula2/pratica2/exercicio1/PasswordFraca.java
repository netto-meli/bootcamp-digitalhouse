package aula2.pratica2.exercicio1;

import java.util.regex.Pattern;

public class PasswordFraca extends Password {
    public PasswordFraca() {
        setRegex (
                Pattern.compile(".{8,}"));
    }
}
