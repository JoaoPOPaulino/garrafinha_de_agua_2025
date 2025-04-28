package topicos1.br.dto.request;

import com.iaramartins.model.TipoGarrafinha;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record GarrafinhaRequestDTO(
    @NotBlank(message = "O nome não pode ser vazio!")
    @Size(min=3, max = 100, message = "Nome deve ter 3-100 caracteres")
    String nome,

    @Positive(message = "O preço deve ser positivo")
    double preco,

    TipoGarrafinha tipo,  // Campo opcional (se você quiser manter a informação)

    @NotBlank(message = "O item não pode ser vazio!")
    String itemGarrafinha,

    String Marca,  // Sem validação (opcional)

    String PedidoGarrafinha // Sem validação (opcional)
) {
}
