package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.MeasuredCharacteristic;

public interface MeasuredCharacteristicRepository extends JpaRepository<MeasuredCharacteristic, Long> {

}
