package com.example.monopoly.Monopoly.game.controller.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.monopoly.Monopoly.game.controller.MonopolyController;


@Service
public class MonopolyService {
	
	private static final Logger logger = LoggerFactory.getLogger(MonopolyService.class);

	
	private int initialAmount=1000;
	
	@Autowired
	private CellSpcification cellSpcification;
	
	@Value("{configuration.property.value.cell2}")
	private int cell2;
	
	@Value("{configuration.property.value.Whitechapel_Road}")
	private int byllingPrice;
	

	public int moveNumberOfPosition(int diceNumberCount) {

		switch (diceNumberCount) {
		  case 2:
			  logger.info("2 position move");
		    int updatedAmountCell2=cellSpcification.cell2(diceNumberCount,initialAmount);
		    initialAmount=updatedAmountCell2;
		    return initialAmount;
		  case 3:
			  logger.info("3 position move");
			    int updatedAmountCell3=cellSpcification.cell3(diceNumberCount,initialAmount);
			    initialAmount=updatedAmountCell3;
			    return initialAmount;
		  case 4:
			  logger.info("4 position move");
			    int updatedAmountCell4=cellSpcification.cell4(diceNumberCount,initialAmount);
			    initialAmount=updatedAmountCell4;
			    return initialAmount;
		  case 5:
			  logger.info("5 position move");
			    int updatedAmountCell5=cellSpcification.cell5(diceNumberCount,initialAmount);
			    initialAmount=updatedAmountCell5;
			    return initialAmount;
		  case 6:
			  logger.info("6 position move");
			    int updatedAmountCell6=cellSpcification.cell6(diceNumberCount,initialAmount);
			    initialAmount=updatedAmountCell6;
			    return initialAmount;
		  case 7:
			  logger.info("7 position move");
			    int updatedAmountCell7=cellSpcification.cell7(diceNumberCount,initialAmount);
			    initialAmount=updatedAmountCell7;
			    return initialAmount;
		  case 8:
			  logger.info("8 position move");
			    int updatedAmountCell8=cellSpcification.cell8(diceNumberCount,initialAmount);
			    initialAmount=updatedAmountCell8;
			    return initialAmount;
		  case 9:
			    logger.info("9 position move");
			    int updatedAmountCell9=cellSpcification.cell9(diceNumberCount,initialAmount);
			    initialAmount=updatedAmountCell9;
			    return initialAmount;
		  case 10:
			  logger.info("10 position move");
			    int updatedAmountCell10=cellSpcification.cell10(diceNumberCount,initialAmount);
			    initialAmount=updatedAmountCell10;
			    return initialAmount;
		  case 11:
			  logger.info("11 position move");
			    int updatedAmountCell11=cellSpcification.cell11(diceNumberCount,initialAmount);
			    initialAmount=updatedAmountCell11;
			    return initialAmount;
		  case 12:
			  logger.info("12 position move");
			    int updatedAmountCell12=cellSpcification.cell12(diceNumberCount,initialAmount);
			    initialAmount=updatedAmountCell12;
			    return initialAmount;
		}
		
		
		
		return 0;
	}



}
