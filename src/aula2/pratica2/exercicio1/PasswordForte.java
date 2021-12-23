package aula2.pratica2.exercicio1;

import java.util.regex.Pattern;

public class PasswordForte extends Password {
    public PasswordForte() {
        setRegex (
                Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])(?:([0-9a-zA-Z$*&@#])(?!\\1)){8,}$"));
    }
}
