package projetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoWebServices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
