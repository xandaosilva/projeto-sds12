package com.alexandrerogerio.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandrerogerio.dslist.dto.GameDTO;
import com.alexandrerogerio.dslist.dto.GameMinDTO;
import com.alexandrerogerio.dslist.entities.Game;
import com.alexandrerogerio.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	public List<GameMinDTO> findAll(){
		List<Game> result =  gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
