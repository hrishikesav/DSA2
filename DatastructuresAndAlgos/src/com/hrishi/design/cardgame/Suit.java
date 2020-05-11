package com.hrishi.design.cardgame;

public enum Suit {
	
	SPADES("Spades"),
	CLUBS("Clubs"),
	HEARTS("Hearts"),
	DIAMONDS("Diamonds");
	
	private final String suiteText;
	
	private Suit(String text) {
		this.suiteText = text;
	}
	
	public String getSuitText() {
		return suiteText;
	}

}
