package topicos1.br.model.Admin;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AdminResponseDTO(
    @NotBlank @Email
    String email,
    @NotBlank @Size(min=8)
    String senha,
    @NotBlank String departamento
) {


}