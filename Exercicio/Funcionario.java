package Exercicio;

import java.time.LocalDate;


public class Funcionario extends Pessoa {

    private Integer matricula;
    private double salario;
    private LocalDate dataAdmissao;


    public Funcionario(String nome, LocalDate dataNascimento, String cidade, String bairro, String rua, int numero, int telefone, Cargo cargo, Integer matricula, double salario, LocalDate dataAdmissao) {
        super(nome, dataNascimento, cidade, bairro, rua, numero, telefone, cargo);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }


    public void Cadastrar(Funcionario f1) {
        Cadastro cadas = new Cadastro();
        cadas.cadastrar(f1);
        System.out.println("Funcionário Cadastradi cin Sucesso!");
    }

    @Override
    public Long obterIdade() {
        return super.obterIdade();
    }

    public String reajustarSalario(int porcentagem){
        double salarioReajustado = this.salario + (this.salario * ((double) porcentagem / 100.0));
        setSalario(salarioReajustado);
        return "O seu salario reajustado ficou: R$" + String.format("%.2f", salarioReajustado);
    }

    public void promover(Cargo cargoNovo){
        setCargo(cargoNovo);
    }

    @Override
    public String toString() {
        return "***************************************************************************" + "\n" +
                "Funcionario :" + "\n" +
                "Nome : " + getNome() + "\n" +
                "Data de Nascimento : " + getDataNascimento() + ", ele possui " + obterIdade() + " anos de idade" + "\n"+
                "Endereco : " + "\n" +
                        getEndereco() + "\n" +
                "Telefone : " + getTelefone() + "\n"+
                "Matricula : " + getMatricula() + "\n" +
                "Cargo : " + getCargo() + "\n" +
                "Salario : " + getSalario() + "\n" +
                "Data de Admissao : " + getDataAdmissao() + "\n"+
                "***************************************************************************";
    }
}
