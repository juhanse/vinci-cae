package com.example.backend.services;

import com.example.backend.entities.Team;
import com.example.backend.entities.User;
import com.example.backend.repositories.TeamRepository;
import com.example.backend.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeamService {
    private final TeamRepository teamRepository;
    private final UserRepository userRepository;

    public TeamService(TeamRepository teamRepository, UserRepository userRepository) {
        this.teamRepository = teamRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    public Team createTeam(String teamName, String userEmail) {
        User currentUser = userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé avec l'email: " + userEmail));

        if (currentUser.getTeam() != null) {
            throw new IllegalStateException("Impossible de créer : Un membre ne peut appartenir qu'à 1 seule team à la fois.");
        }

        if (teamRepository.existsByName(teamName)) {
            throw new IllegalArgumentException("Le nom d'équipe '" + teamName + "' est déjà pris.");
        }

        Team newTeam = new Team();
        newTeam.setName(teamName);
        newTeam.setPrimaryUser(currentUser);
        Team savedTeam = teamRepository.save(newTeam);

        currentUser.setTeam(savedTeam);
        userRepository.save(currentUser);

        return savedTeam;
    }
}
