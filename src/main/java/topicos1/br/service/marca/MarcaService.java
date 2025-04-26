package topicos1.br.service.marca;

import java.util.List;

import topicos1.br.dto.request.garrafa.MarcaDTO;
import topicos1.br.dto.response.garrafa.MarcaResponseDTO;

public interface MarcaService {

    MarcaResponseDTO create(MarcaDTO dto);

    void delete(Long id);

    MarcaResponseDTO update(Long id, MarcaDTO dto);

    MarcaResponseDTO findById(Long id);

    List<MarcaResponseDTO> findAll();
}
