package dev.top.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.top.entities.Collegues;

public interface ColleguesRepo extends JpaRepository<Collegues, Integer> {

	Optional<Collegues> findByPseudo(String pseudo);

}
