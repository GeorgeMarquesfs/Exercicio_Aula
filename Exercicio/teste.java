package Exercicio;

import java.time.LocalDate;

public class teste {

    public static void main(String[] args) {


        Funcionario f1 = new Funcionario("George",LocalDate.parse("1999-07-29"),"João Pessoa", "Roger", "Rua",786,889877,Cargo.GERENTE,1234,1000.00,LocalDate.parse("1998-05-24"));
        Cliente bia = new Cliente("Maria Beatriz",LocalDate.parse("1999-03-04"),"Joãõ Pessoa", "Bessa", "Rua fulano", 87,89876387,Cargo.CHEFE,"1234","Engenheira Civil");

        System.out.println(f1.toString());
        System.out.println(bia.toString());
        f1.promover(Cargo.CHEFE);
        System.out.println(f1.reajustarSalario(20));
        System.out.println(f1.toString());




    }
}
