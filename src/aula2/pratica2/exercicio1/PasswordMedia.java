package aula2.pratica2.exercicio1;

import java.util.regex.Pattern;

public class PasswordMedia extends Password{
    public PasswordMedia() {
        setRegex (
                Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?:([0-9a-zA-Z@])(?!\\1)){7,}$"));
    }
}
