package com.hrishi.datastructures.trie;

public class TrieImpl {

	public static void main(String[] args) {
		
		Trie trie = new Trie();
		trie.insert("alil");
		
		System.out.println(trie.search("alil"));
		System.out.println(trie.searchPrefix("z"));
	}

}
