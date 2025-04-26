package topicos1.br.model.garrafa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import topicos1.br.model.DefaultEntity;

@Entity
public class Marca extends DefaultEntity {

    @Column(length = 60, nullable = false)
    private String nome;

    @Column(length = 18, nullable = false)
    private String CNPJ;

    public Marca() {
    }

    public Marca(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

}
