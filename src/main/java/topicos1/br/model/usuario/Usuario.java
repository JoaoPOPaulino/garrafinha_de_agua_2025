package topicos1.br.model.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Embedded; // Importe Embedded
import topicos1.br.model.DefaultEntity;

@Entity
public class Usuario extends DefaultEntity {

    private String nome;
    private String email;
    private String senha;

    @Embedded  // Adicione isto
    private Telefone telefone;

    private Endereco endereco;

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, Telefone telefone, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}