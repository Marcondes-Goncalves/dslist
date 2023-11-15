package com.goncalves.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goncalves.dslist.entities.Games;

public interface GameRepository extends JpaRepository<Games, Long> {
    

}
