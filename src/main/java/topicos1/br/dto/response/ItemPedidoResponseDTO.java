package topicos1.br.dto.response;

import topicos1.br.model.pedido.ItemPedido;

public record ItemPedidoResponseDTO(
    Long id,
    String nomeGarrafinha,
    TipoVela tipoGarrafinha,
    int quantidade,
    Double precoUnitario,
    Double subtotal // quantidade * precoUnitario (opcional)
) {
public ItemPedidoResponseDTO(Long id, String nomeGarrafinha,TipoGarrafinha tipoGarrafinha,  int quantidade, Double precoUnitario) {
        this(id, nomeGarrafinha, tipoGarrafinha,quantidade, precoUnitario, quantidade * precoUnitario);
    }
}

public record ItemPedidoResponseDTO() {

}
