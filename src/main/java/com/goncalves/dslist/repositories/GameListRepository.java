package com.goncalves.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goncalves.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    

}
