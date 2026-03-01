package com.example.backend.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateTeamRequest {
    @NotBlank(message = "Le nom de l'équipe est obligatoire")
    private String name;
}
