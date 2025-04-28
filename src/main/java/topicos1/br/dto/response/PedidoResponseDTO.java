package topicos1.br.dto.response;

import java.time.LocalDateTime;
import java.util.List;

public record PedidoResponseDTO(
    Long id,
    Long clienteId,
    LocalDateTime data,
    Double total,
    List <ItemPedidoResponseDTO> itens
) {
    public record ItemPedidoResponseDTO(
        String nomeVela,
        int quantidade,
        Double precoUnitario
    ) {}
}


