package EstadoVacinacao;

import Pessoa.Pessoa;

public class HabilitadaDoseUm extends EstadoVacinacao {

    public HabilitadaDoseUm(Pessoa p) {
        super(p);
    }

    @Override
    public void vacinacao() {
        System.out.println("Habilitada para a primeira dose");
        System.out.println("Vacinado primeira dose");
        System.out.println("Aguarde 20 dias para a segunda dose...");
        pessoa.setEst(new HabilitadaDoseDois(pessoa));
        this.pessoa.getEst().vacinacao();
    }
}
