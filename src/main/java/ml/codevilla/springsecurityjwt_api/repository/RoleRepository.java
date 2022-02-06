package ml.codevilla.springsecurityjwt_api.repository;

import java.util.Optional;

import ml.codevilla.springsecurityjwt_api.models.ERole;
import ml.codevilla.springsecurityjwt_api.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
