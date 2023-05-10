package com.alexandrerogerio.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandrerogerio.dslist.dto.GameDTO;
import com.alexandrerogerio.dslist.dto.GameListDTO;
import com.alexandrerogerio.dslist.entities.Game;
import com.alexandrerogerio.dslist.entities.GameList;
import com.alexandrerogerio.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result =  gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
}
