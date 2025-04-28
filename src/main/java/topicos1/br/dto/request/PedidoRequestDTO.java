package topicos1.br.dto.request;

import jakarta.validation.constraints.NotNull;

public record PedidoRequestDTO(
    @NotNull(message = "ID do cliente é obrigatório")
    Long clienteId
) {

}
