package Exercicio;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private int telefone;

    private Cargo cargo;


    public Pessoa(String nome, LocalDate dataNascimento, String cidade, String bairro, String rua, int numero , int telefone, Cargo cargo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = new Endereco(cidade,bairro,rua,numero);
        this.telefone = telefone;
        this.cargo = cargo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void Cadastrar(){
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Long obterIdade(){
        LocalDate dataAtual = LocalDate.now();
        Long idade = getDataNascimento().until(dataAtual , ChronoUnit.YEARS);
        return idade;
    }



}
