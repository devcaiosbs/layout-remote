package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Requirement;

public interface RequirementRepository extends JpaRepository<Requirement, Long> {

}
