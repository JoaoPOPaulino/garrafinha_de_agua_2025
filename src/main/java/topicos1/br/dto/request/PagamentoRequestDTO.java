package topicos1.br.dto.request;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PagamentoRequestDTO(
    @NotNull Long pedidoId,
    @NotBlank String metodo,  // "PIX", "CARTão", "Boleto",etc.
    @Positive BigDecimal valor) {
}
