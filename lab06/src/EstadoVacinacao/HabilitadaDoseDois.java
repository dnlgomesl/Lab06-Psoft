package EstadoVacinacao;

import Pessoa.Pessoa;

public class HabilitadaDoseDois extends EstadoVacinacao {

    public HabilitadaDoseDois(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public void vacinacao() {
        System.out.println("20 dias passados");
        System.out.println("Habilitada para a segunda dose");
        System.out.println("Vacinado segunda dose");
        pessoa.setEst(new Finalizado(pessoa));
        this.pessoa.getEst().vacinacao();
    }
}
