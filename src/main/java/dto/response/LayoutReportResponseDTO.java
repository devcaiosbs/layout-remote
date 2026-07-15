package dto.response;

import java.time.LocalDate;

import repository.Product;

public record LayoutReportResponseDTO(Long id, LocalDate inspectionDay, String notes, Product product) {

}
