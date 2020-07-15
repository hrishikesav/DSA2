package com.hrishi.design.snakeandladder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SnakeAndLadderMain {
	
	static final int TILE_SIZE = 20;

	public static void main(String[] args) {
		
		String winner = null;
		
		Player player1 = new Player("Hrishi");
		Player player2 = new Player("Dhriti");
		
		Map<Integer, Integer> snakePostions = new HashMap<Integer, Integer>();
		Map<Integer, Integer> ladderPostions = new HashMap<Integer, Integer>();
		
		snakePostions.put(12, 5);
		snakePostions.put(18, 2);
		
		ladderPostions.put(6, 15);
		ladderPostions.put(10, 19);
		
		List<Player> players = new LinkedList<Player>();
		players.add(player1);
		players.add(player2);
		
		while(winner == null) {
			for(Player player : players) {
				int num = throwDice();
				
				int currPos = player.getPosition();
				int newPos = currPos + num;
				
				if(snakePostions.containsKey(newPos)) {
					System.out.println(player.getName() + " snake match");
					newPos = snakePostions.get(newPos);
				}
				
				if(ladderPostions.containsKey(newPos)) {
					System.out.println(player.getName() + " ladder match");
					newPos = ladderPostions.get(newPos);
				}
				
				player.setPosition(newPos);
				
				System.out.println(player.getName() + "'s turn. Current position: " + currPos 
						+ ", Dice value: " + num + ", New pos: " + newPos);
				
				if(newPos >= TILE_SIZE) {
					winner = player.getName();
					break;
				}
			}
			System.out.println("----------------------------------------------------------------");
		}
		
		System.out.println("Winner is: " + winner);
		
	}
	
	static int throwDice() {
		Random random = new Random();
		int num = -1;
		while((num = random.nextInt(6)) == 0) {
		}
		return num;
	}

}
