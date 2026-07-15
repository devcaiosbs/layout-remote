package dto.response;

public record ProductResponseDTO(Long id, String name, String partNumber, boolean active, boolean annualInspection, String plant) {

}
