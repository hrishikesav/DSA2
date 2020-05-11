package com.hrishi.design.cardgame;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Deck {
	
	private List<Card> cards = new ArrayList<>();
	
	public void populate() {
		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				cards.add(new Card(false, suit, rank));
			}
		}
	}
	
	public void shuffle() {
		Random random = new Random();
		for(int i=0; i< cards.size(); i++) {
			int ran = random.nextInt(52);
			Card ranCard = cards.get(ran);
			Card temp = cards.get(i);
			cards.set(i, ranCard);
			cards.set(ran, temp);
		}
	}

	public List<Card> getCards() {
		return cards;
	}

}
