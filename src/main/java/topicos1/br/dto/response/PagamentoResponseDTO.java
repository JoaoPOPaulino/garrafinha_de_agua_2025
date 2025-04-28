package topicos1.br.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import topicos1.br.model.pagamento.Pagamento;

public record PagamentoResponseDTO(Long id,
    Long pedidoId,
    String metodo,
    BigDecimal valor,
    String status,
    LocalDateTime dataPagamento) {

public static PagamentoResponseDTO fromEntity(Pagamento pagamento) {
    return new PagamentoResponseDTO(
        pagamento.getId(),
        pagamento.getPedido().getId(),
        pagamento.getMetodo(),
        pagamento.getValor(),
        pagamento.getStatus(),
        pagamento.getDataPagamento()
    );
}
public record PagamentoResponseDTO() {

}
    }