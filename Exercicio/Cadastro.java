package Exercicio;

import java.util.ArrayList;

public class Cadastro {

    public ArrayList cadastros = new ArrayList();


    public void cadastrar(Funcionario f1){
        cadastros.add(f1);
    }
    public void cadastrar(Cliente c1){
        cadastros.add(c1);
    }
}
