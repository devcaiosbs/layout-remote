package dto.response;

import java.math.BigDecimal;

import entity.enums.Operator;

public record RequirementResponseDTO(Long id, String parameter, Operator operator, BigDecimal nominalValue, BigDecimal tolerance, String unit) {

}
