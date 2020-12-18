package com.example.monopoly.Monopoly.game.controller.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CellSpcification {
	
	@Value("{configuration.property.value.Old_kent_Road}")
	private int byllingPriceClell1;

	@Value("{configuration.property.value.cell2}")
	private String cell2;

	@Value("{configuration.property.value.Whitechapel_Road}")
	private int byllingPriceClell2;
	
	@Value("{configuration.property.value.King's_Cross_station}")
	private int byllingPriceClell3;
	
	@Value("{configuration.property.value.The_Angel_Islington}")
	private int byllingPriceClell4;
	
	@Value("{configuration.property.value.Euston_Road}")
	private int byllingPriceClell5;
	
	@Value("{configuration.property.value.Pentonville_Road}")
	private int byllingPriceClell6;
	
	@Value("{configuration.property.value.Pall_Mall}")
	private int byllingPriceClell7;
	
	@Value("{configuration.property.value.Whitehall}")
	private int byllingPriceClell8;
	
	@Value("{configuration.property.value.Northumberland_Avenue}")
	private int byllingPriceClell9;
	
	@Value("{configuration.property.value.Marylebone_station}")
	private int byllingPriceClell10;
	

	public int cell2(int diceNumberCount, int initialAmount) {
		if (diceNumberCount == 2) {
			int Amount = initialAmount - byllingPriceClell2;
			return Amount;
		} else {
			return 0;
		}

	}

	public int cell3(int diceNumberCount, int initialAmount) {
		if (diceNumberCount == 3) {
			int Amount = initialAmount - byllingPriceClell3;
			return Amount;
		} else {
			return 0;
		}
	}

	public int cell4(int diceNumberCount, int initialAmount) {
		if (diceNumberCount == 4) {
			int Amount = initialAmount - byllingPriceClell4;
			return Amount;
		} else {
			return 0;
		}
	}

	public int cell5(int diceNumberCount, int initialAmount) {
		if (diceNumberCount == 5) {
			int Amount = initialAmount - byllingPriceClell5;
			return Amount;
		} else {
			return 0;
		}
	}

	public int cell6(int diceNumberCount, int initialAmount) {
		if (diceNumberCount == 6) {
			int Amount = initialAmount - byllingPriceClell6;
			return Amount;
		} else {
			return 0;
		}
	}

	public int cell7(int diceNumberCount, int initialAmount) {
		if (diceNumberCount == 7) {
			int Amount = initialAmount - byllingPriceClell7;
			return Amount;
		} else {
			return 0;
		}
	}

	public int cell8(int diceNumberCount, int initialAmount) {
		if (diceNumberCount == 8) {
			int Amount = initialAmount - byllingPriceClell8;
			return Amount;
		} else {
			return 0;
		}
	}

	public int cell9(int diceNumberCount, int initialAmount) {
		if (diceNumberCount == 9) {
			int Amount = initialAmount - byllingPriceClell9;
			return Amount;
		} else {
			return 0;
		}
	}

	public int cell10(int diceNumberCount, int initialAmount) {
		if (diceNumberCount == 10) {
			int Amount = initialAmount - byllingPriceClell10;
			return Amount;
		} else {
			return 0;
		}
	}

	public int cell11(int diceNumberCount, int initialAmount) {
		int count=0;
		if(initialAmount>10)
		{
			for (int j = 10; j <= initialAmount; j ++) 
			{ 
				count++;
			}
			if (count == 1) {
				int Amount = initialAmount - byllingPriceClell1;
				return Amount;
			} 
			if (count == 2) {
				int Amount = initialAmount - byllingPriceClell2;
				return Amount;
			}else {
				return 0;
			}
		}
		return 0;
		
	}

	public int cell12(int diceNumberCount, int initialAmount) {
		int count=0;
		if(initialAmount>10)
		{
			for (int j = 10; j <= initialAmount; j ++) 
			{ 
				count++;
			}
			if (count == 1) {
				int Amount = initialAmount - byllingPriceClell1;
				return Amount;
			} 
			if (count == 2) {
				int Amount = initialAmount - byllingPriceClell2;
				return Amount;
			}else {
				return 0;
			}
		}
		return 0;
		
	}

}
