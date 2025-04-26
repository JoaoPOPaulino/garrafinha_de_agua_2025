package topicos1.br.dto.response.garrafa;

import topicos1.br.model.garrafa.Marca;

public record MarcaResponseDTO(
        Long id,
        String nome,
        String CNPJ
        ) {

    public static MarcaResponseDTO valueOf(Marca marca) {
        if (marca == null) {
            return null;
        }
        return new MarcaResponseDTO(
                marca.getId(),
                marca.getNome(),
                marca.getCNPJ());
    }
}
