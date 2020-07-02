package com.hrishi.datastructures.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
	
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}

	private class TrieNode {
		Map<Character, TrieNode> children;
		boolean endOfWord;
		
		public TrieNode() {
			children = new HashMap<>();
			endOfWord = false;
		}
	}
	
	/*
	 * Time complexity = O(l * n)
	 * l = avg length of word
	 * n = number of word
	 */
	public void insert(String word) {
		TrieNode current = root;
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode trieNode = current.children.get(ch);
			if(trieNode == null) {
				trieNode = new TrieNode();
				current.children.put(ch,trieNode);
			}
			current = trieNode;
		}
		current.endOfWord = true;
	}
	
	/*
	 * O(l)
	 */
	public boolean search(String word) {
		TrieNode current = root;
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode trieNode = current.children.get(ch);
			if(trieNode == null) {
				return false;
			}
			current = trieNode;
		}
		return current.endOfWord;
	}
	
	public boolean searchPrefix(String prefix) {
		TrieNode current = root;
		boolean prefixFound = true;
		for(int i=0; i<prefix.length(); i++) {
			char ch = prefix.charAt(i);
			TrieNode trieNode = current.children.get(ch);
			if(trieNode == null) {
				prefixFound = false;
				break;
			}
			current = trieNode;
		}
		return prefixFound;
	}
}
