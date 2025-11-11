package projetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoWebServices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
