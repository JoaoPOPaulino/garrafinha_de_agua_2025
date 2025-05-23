package topicos1.br.model.usuario;

import jakarta.persistence.Embeddable; // Importe Embeddable

@Embeddable  // Adicione isto
public class Telefone {

    private String ddd;
    private String numero;

    public Telefone() {
    }

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}