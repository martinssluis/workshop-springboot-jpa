package projetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoWebServices.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
