package projetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoWebServices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
