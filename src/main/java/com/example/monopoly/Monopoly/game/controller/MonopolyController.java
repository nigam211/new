package com.example.monopoly.Monopoly.game.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.monopoly.Monopoly.game.controller.entity.GameEntity;
import com.example.monopoly.Monopoly.game.controller.service.MonopolyService;

@RestController
@RequestMapping("/")
public class MonopolyController {

	@Autowired
	private MonopolyService monopolyService;

	private static final Logger logger = LoggerFactory.getLogger(MonopolyController.class);

	@GetMapping("/create-game")
	public String startNewGame() {
		return "Game Created Successfully";
		
	}
	
	@GetMapping("/roll-die/p1/{diceNumberCount}")
	public int numberOfMoves(@PathVariable("diceNumberCount") int diceNumberCount) {
		logger.info("Inside numberOfMoves method of MonopolyController");
		return monopolyService.moveNumberOfPosition(diceNumberCount);
	}
	
	
}
