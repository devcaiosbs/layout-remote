package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Material;

public interface MaterialRepository extends JpaRepository<Material, Long> {

}
