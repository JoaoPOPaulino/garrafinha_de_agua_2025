package topicos1.br.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import topicos1.br.model.garrafa.Categoria;

@ApplicationScoped
public class CategoriaRepository implements PanacheRepository<Categoria>{
    public class CategoriaVelaRepository implements PanacheRepository<CategoriaVela> {
    public List<CategoriaRepository> findByNome(String nome){
        return find("nome LIKE ?1", "%" + nome + "%").list();
    }
