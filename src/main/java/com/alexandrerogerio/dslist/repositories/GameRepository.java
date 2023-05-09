package com.alexandrerogerio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrerogerio.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>  {

}
