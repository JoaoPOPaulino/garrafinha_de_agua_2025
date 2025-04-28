package topicos1.br.model.converterjpa;

import jakarta.persistence.AttributeConverter;
import topicos1.br.model.usuario.Perfil;

public class PerfilConverter implements AttributeConverter<Perfil, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Perfil perfil) {
        if (perfil == null) {
            return null;
        }
        return perfil.getId();
    }

    @Override
    public Perfil convertToEntityAttribute(Integer id) {
        if (id == null) {
            return null;
        }
        return Perfil.valueOf(id);

    }
}
