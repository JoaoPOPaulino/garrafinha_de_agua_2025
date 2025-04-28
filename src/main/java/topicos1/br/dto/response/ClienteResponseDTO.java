package topicos1.br.dto.response;

import topicos1.br.model.garrafa.Cliente;

public record ClienteResponseDTO(
Long id,
String nome,
String email,
String telefone) {
    public static ClienteResponseDTO valueOf(Cliente cliente) {
        if (cliente == null)
            return null;
        return new ClienteResponseDTO(
            cliente.getId(),
            cliente.getNome(),
            cliente.getEmail(),
            cliente.getTelefone());
    }
}


