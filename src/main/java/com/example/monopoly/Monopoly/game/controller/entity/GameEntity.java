package com.example.monopoly.Monopoly.game.controller.entity;

public class GameEntity {

	private Long gameId;
	private int diceNumberCount;
	private int numberOfField;

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	public int getDiceNumberCount() {
		return diceNumberCount;
	}

	public void setDiceNumberCount(int diceNumberCount) {
		this.diceNumberCount = diceNumberCount;
	}

	public int getNumberOfField() {
		return numberOfField;
	}

	public void setNumberOfField(int numberOfField) {
		this.numberOfField = numberOfField;
	}

}
