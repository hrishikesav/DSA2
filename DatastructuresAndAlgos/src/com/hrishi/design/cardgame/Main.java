package com.hrishi.design.cardgame;

import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.populate();
		
		List<Card> cards = deck.getCards();
		
		deck.shuffle();
		cards.stream().forEach(System.out::println);
		
	}

}
