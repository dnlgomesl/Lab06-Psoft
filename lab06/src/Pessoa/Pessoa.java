package Pessoa;

import EstadoVacinacao.EstadoVacinacao;
import EstadoVacinacao.NaoHabilitada;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String carSus;
    private String email;
    private boolean profissao;
    private boolean comorbidade;
    private EstadoVacinacao est;
    private int idade;

    public Pessoa(String nome, String cpf, String endereco, String carSus, String email, boolean profissao, boolean comorbidade, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.carSus = carSus;
        this.email = email;
        this.profissao = profissao;
        this.comorbidade = comorbidade;
        this.est = new NaoHabilitada(this);
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa.Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", carSus='" + carSus + '\'' +
                ", email='" + email + '\'' +
                ", profissao='" + profissao + '\'' +
                ", comorbidade=" + comorbidade +
                '}';
    }

    public void getSituacao(){
        System.out.println("Olá " + nome + " - " + cpf);
        System.out.println("Sua situação é: ");
        this.est.vacinacao();
        System.out.println("Seu processo foi finalizado, " + nome + " - " + cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCarSus() {
        return carSus;
    }

    public void setCarSus(String carSus) {
        this.carSus = carSus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isProfissao() {
        return profissao;
    }

    public void setProfissao(boolean profissao) {
        this.profissao = profissao;
    }

    public boolean isComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(boolean comorbidade) {
        this.comorbidade = comorbidade;
    }

    public EstadoVacinacao getEst() {
        return est;
    }

    public int getIdade() {
        return idade;
    }

    public void setEst(EstadoVacinacao est) {
        this.est = est;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
