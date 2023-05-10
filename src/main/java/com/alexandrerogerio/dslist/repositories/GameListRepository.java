package com.alexandrerogerio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrerogerio.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
