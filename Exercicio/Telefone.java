package Exercicio;

public class Telefone {

    private Long numero;


    public Telefone(Long numero) {
        this.numero = numero;
    }

    public Telefone() {
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "numero=" + numero +
                '}';
    }
}
