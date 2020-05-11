package com.hrishi.design.cardgame;

public class Card {
	
	private Suit suit;
	private Rank rank;
	private boolean isJoker;
	
	public Card(boolean isJoker, Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
		this.isJoker = isJoker;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public boolean isJoker() {
		return isJoker;
	}

	public void setJoker(boolean isJoker) {
		this.isJoker = isJoker;
	}

	@Override
	public String toString() {
		if(this.isJoker) {
			return "Joker";
		} else {
			return rank + " of " + suit;
		}
	}
	
}
