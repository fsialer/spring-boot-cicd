package com.fernando.spring_boot_cicd;

public record UserDTO(String username,
                      String firstName,
                      String lastName,
                      int age,
                      String email) {
}
