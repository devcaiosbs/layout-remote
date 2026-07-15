package dto.response;

import java.math.BigDecimal;

import entity.Requirement;
import entity.enums.Result;

public record MeasuredCharacteristicResponseDTO(Long id, BigDecimal measuredValue, Result result, Requirement requirement) {

}
