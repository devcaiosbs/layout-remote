package dto.response;

import java.time.LocalDate;

import entity.Customer;

public record StandardResponseDTO(Long id, String name, LocalDate lastEdition, Customer customer) {

}
