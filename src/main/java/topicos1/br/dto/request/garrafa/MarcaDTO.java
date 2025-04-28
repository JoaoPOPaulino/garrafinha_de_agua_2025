package topicos1.br.dto.request.garrafa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record MarcaDTO(
        @NotBlank(message = "O nome da marca não pode ser vazio ou nulo")
        @Size(min = 4, max = 60, message = "O nome da marca deve ter no máximo 60 caracteres")
        String nome,
        @NotBlank(message = "O CNPJ da marca não pode ser vazio ou nulo")
        @Size(min = 14, max = 18, message = "O CNPJ da marca deve ter entre 14 e 18 caracteres")
        String CNPJ) {

}
