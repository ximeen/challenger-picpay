package picpay.challenger.dtos;

import picpay.challenger.domain.users.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) { }
