package spring_boot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import spring_boot.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
