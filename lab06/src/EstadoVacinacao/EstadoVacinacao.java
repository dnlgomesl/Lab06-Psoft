package EstadoVacinacao;

import Pessoa.Pessoa;

public abstract class EstadoVacinacao {

    Pessoa pessoa;

    public EstadoVacinacao(Pessoa p){
        this.pessoa = p;
    }

    public abstract void vacinacao();
}
