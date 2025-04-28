package topicos1.br.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import topicos1.br.model.garrafa.Pedido;

@ApplicationScoped
public class PedidoRepository implements PanacheRepository<Pedido>{

    public List<Pedido> findByNome(String nome) {
        return find("nome LIKE ?1", "%" + nome + "%").list();
    }

}


