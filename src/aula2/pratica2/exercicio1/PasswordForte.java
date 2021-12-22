package aula2.pratica2.exercicio1;

public class PasswordForte extends Password {
    public PasswordForte() {
        setRegex ("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])(?:([0-9a-zA-Z$*&@#])(?!\\1)){8,}$");
    }
}
