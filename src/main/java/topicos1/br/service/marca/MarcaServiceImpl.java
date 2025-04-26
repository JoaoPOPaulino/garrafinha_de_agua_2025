package topicos1.br.service.marca;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import topicos1.br.dto.request.garrafa.MarcaDTO;
import topicos1.br.dto.response.garrafa.MarcaResponseDTO;
import topicos1.br.model.garrafa.Marca;
import topicos1.br.repository.MarcaRepository;

@ApplicationScoped
public class MarcaServiceImpl implements MarcaService {

    @Inject
    MarcaRepository marcaRepository;

    @Override
    @Transactional
    public MarcaResponseDTO create(MarcaDTO dto) {
        Marca novaMarca = new Marca();
        novaMarca.setNome(dto.nome());
        novaMarca.setCNPJ(dto.CNPJ());
        marcaRepository.persist(novaMarca);
        return MarcaResponseDTO.valueOf(novaMarca);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Marca marca = marcaRepository.findById(id);
        if (marca != null) {
            marcaRepository.delete(marca);
        }
    }

    @Override
    @Transactional
    public MarcaResponseDTO update(Long id, MarcaDTO dto) {
        Marca marca = marcaRepository.findById(id);
        if (marca != null) {
            marca.setNome(dto.nome());
            marca.setCNPJ(dto.CNPJ());
            return MarcaResponseDTO.valueOf(marca);
        }
        return null;
    }

    @Override
    public MarcaResponseDTO findById(Long id) {
        return MarcaResponseDTO.valueOf(marcaRepository.findById(id));
    }

    @Override
    public List<MarcaResponseDTO> findAll() {
        return marcaRepository.findAll().stream()
                .map(e -> MarcaResponseDTO.valueOf(e)).toList();
    }

}
