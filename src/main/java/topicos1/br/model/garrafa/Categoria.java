package topicos1.br.model.garrafa;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Categoria {
    ESPORTIVA(1, "Esportiva"),
    INFANTIL(2, "Infantil"),
    PERSONALIZADA(3, "Personalizada"),
    TERMICA(4, "Térmica");

    private final Integer id;
    private final String label;

    private Categoria(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static Categoria fromId(Integer id) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.getId().equals(id)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Categoria com ID " + id + " não encontrada.");
    }
}
