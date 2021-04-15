import Pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
         Pessoa daniel = new Pessoa("Daniel", "000999888-77", "Rua tal",
                 "284824682", "daniel@gmail.com", false, false, 59);
         daniel.getSituacao();
         daniel.setProfissao(true);
         daniel.getSituacao();
    }
}
