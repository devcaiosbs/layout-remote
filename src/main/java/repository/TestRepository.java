package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Test;

public interface TestRepository extends JpaRepository<Test, Long> {

}
