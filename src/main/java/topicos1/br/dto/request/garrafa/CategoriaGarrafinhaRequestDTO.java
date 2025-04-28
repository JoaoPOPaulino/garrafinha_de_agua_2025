package topicos1.br.dto.request.categoria;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoriaGarrafinhaRequestDTO(
    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 3, max=50, message= "Nome deve ter entre 3 a 50 caracteres")
    String nome,

    @Size(max = 200, message = "Descricao muito longa")
    String descricao
) {
}