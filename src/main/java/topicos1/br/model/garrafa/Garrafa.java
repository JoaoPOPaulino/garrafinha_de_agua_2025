package topicos1.br.model.garrafa;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne; // Importe ManyToOne
import topicos1.br.model.DefaultEntity;

@Entity
public class Garrafa extends DefaultEntity {

    private String cor;
    private String material;
    private String tamanho;
    private BigDecimal preco;
    private Categoria categoria;
    private Integer quantidadeEstoque;
    private String imagemUrl;

    @ManyToOne  // Adicione esta anotação
    private Marca marca;

    public Garrafa() {
    }

    public Garrafa(String cor, String material, String tamanho, BigDecimal preco, Categoria categoria,
            Integer quantidadeEstoque, String imagemUrl, Marca marca) {

        this.cor = cor;
        this.material = material;
        this.tamanho = tamanho;
        this.preco = preco;
        this.categoria = categoria;
        this.quantidadeEstoque = quantidadeEstoque;
        this.imagemUrl = imagemUrl;
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}