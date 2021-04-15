package EstadoVacinacao;

import Pessoa.Pessoa;

public class Finalizado extends EstadoVacinacao {
    public Finalizado(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public void vacinacao() {
        System.out.println("A sua vacinação está finalizada");
    }
}
