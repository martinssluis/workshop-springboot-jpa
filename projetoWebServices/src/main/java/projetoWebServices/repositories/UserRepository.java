package projetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoWebServices.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
