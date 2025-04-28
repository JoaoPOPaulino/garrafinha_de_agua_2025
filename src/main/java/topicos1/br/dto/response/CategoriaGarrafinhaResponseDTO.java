package topicos1.br.dto.response;

public class CategoriaGarrafinhaResponseDTO {

}
public record CategoriaGarrafinhaResponseDTO(
    Long id,
    String nome,
    String descricao
) {
    public static CategoriaGarrafinhaResponseDTO fromEntity(CategoriaGarrafinha categoria){
        return new CategoriaGarrafinhaResponseDTO(
            categoria.getId(),
            categoria.getNome(),
            categoria.getDescricao()
        );
    }
}