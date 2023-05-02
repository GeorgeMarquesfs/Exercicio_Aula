package Exercicio;

import java.time.LocalDate;

public class Cliente extends Pessoa {

    private String codigo;
    private Profissao profissao;

    public Cliente(String nome, LocalDate dataNascimento, String cidade, String bairro, String rua, int numero, int telefone, Cargo cargo, String codigo, String profissao) {
        super(nome, dataNascimento, cidade, bairro, rua, numero, telefone, cargo);
        this.codigo = codigo;
        this.profissao = new Profissao(profissao);
    }

    public void Cadastrar(Cliente c1) {
        Cadastro cadas = new Cadastro();
        cadas.cadastrar(c1);
    }

    @Override
    public Long obterIdade() {
        return super.obterIdade();
    }

    @Override
    public String toString() {
        return "***************************************************************************"+ "\n" +
                "Cliente :" + "\n" +
                "Nome : " + getNome() + "\n" +
                "Data de Nascimento : " + getDataNascimento() + ", ele possui " + obterIdade() + " anos de idade" +  "\n"+
                "Endereco : " + "\n" +
                getEndereco() + "\n" +
                "Telefone : " + getTelefone() + "\n"+
                "Cargo : " + getCargo() + "\n" +
                "Codigo : " + this.codigo + "\n" +
                "Profissao: " + profissao.getNomeProfissao() + "\n" +
                "***************************************************************************";
    }

}
