package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.LayoutReport;

public interface LayoutRepository extends JpaRepository<LayoutReport, Long> {

}
