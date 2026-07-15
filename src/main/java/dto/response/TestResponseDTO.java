package dto.response;

import entity.Requirement;

public record TestResponseDTO(Long id, String name, Requirement requirement) {

}
