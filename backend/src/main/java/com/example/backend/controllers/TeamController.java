package com.example.backend.controllers;

import com.example.backend.dtos.CreateTeamRequest;
import com.example.backend.entities.Team;
import com.example.backend.services.TeamService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/teams")
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<Team> createTeam(@Valid @RequestBody CreateTeamRequest dto, Principal principal) {
        String userEmail = principal.getName();
        Team createdTeam = teamService.createTeam(dto.getName(), userEmail);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdTeam);
    }
}
