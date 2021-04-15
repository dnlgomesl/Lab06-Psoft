package EstadoVacinacao;

import Pessoa.Pessoa;

public class NaoHabilitada extends EstadoVacinacao {

    public NaoHabilitada(Pessoa p) {
        super(p);
    }

    @Override
    public void vacinacao() {
        if(pessoa.isComorbidade() || pessoa.isProfissao() || pessoa.getIdade() >= 60){
            pessoa.setEst(new HabilitadaDoseUm(pessoa));
            this.pessoa.getEst().vacinacao();
        }
        else {
            System.out.println("Não habilitada");
        }
    }

}
