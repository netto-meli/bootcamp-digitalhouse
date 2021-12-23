package aula2.pratica2.exercicio1;

/*
regex =
/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])(?:([0-9a-zA-Z$*&@#])(?!\1)){8,}$/i;


console.log(r.test('a12B@cde')); // true
console.log(r.test('a12B@cce')); // false
console.log(r.test('a22B@cde')); // false
console.log(r.test('a12@@cde')); // false
console.log(r.test('a12B@cCe')); // false

    Explicando em mais detalhes:

/^
  (?=.*\d)              // deve conter ao menos um dígito
  (?=.*[a-z])           // deve conter ao menos uma letra minúscula
  (?=.*[A-Z])           // deve conter ao menos uma letra maiúscula
  (?=.*[$*&@#])         // deve conter ao menos um caractere especial
  [0-9a-zA-Z$*&@#]{8,}  // deve conter ao menos 8 dos caracteres mencionados
$/
nao aceita caracteres em sequencia (\1 lookahead) e /i para aA Bb

*/

/*
^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$
Explicação:

^                 # start-of-string
(?=.*[0-9])       # a digit must occur at least once
(?=.*[a-z])       # a lower case letter must occur at least once
(?=.*[A-Z])       # an upper case letter must occur at least once
(?=.*[@#$%^&+=])  # a special character must occur at least once
(?=\S+$)          # no whitespace allowed in the entire string
.{8,}             # anything, at least eight places though
$                 # end-of-string
 */

import java.util.regex.Pattern;

public class Senha {
    private final Pattern regex;

    public Senha(Pattern regex) { this.regex=regex; }

    public void setValue(String senha) throws SenhaException {
        if ( ! regex.matcher(senha).find() ){
            String mensagem = "A senha \"" +senha+ "\" não esta no padrão.";
            throw new SenhaException(mensagem);
        }
    }

    /*
    classe exception
     */
    public static class SenhaException extends Exception{
        public SenhaException(String senha) { super(senha);}
    }
}
