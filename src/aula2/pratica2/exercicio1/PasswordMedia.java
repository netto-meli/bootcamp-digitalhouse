package aula2.pratica2.exercicio1;

public class PasswordMedia extends Password{
    public PasswordMedia() {
        setRegex ("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?:([0-9a-zA-Z@])(?!\\1)){7,}$");
    }
}
