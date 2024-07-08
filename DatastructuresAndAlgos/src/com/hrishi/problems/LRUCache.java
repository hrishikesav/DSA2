package com.hrishi.problems;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    static class Node {
        int key;
        String value;
        Node prev;
        Node next;

        public String toString() {
            return key + "-" + value;
        }
    }

    static Map<Integer, Node> map = new HashMap<>();
    static Node head = null;
    static Node tail = null;
    static int CAPACITY = 3;

    public static void main(String[] args) {
        put(2, "two");
        put(3, "three");
        put(4, "four");
        put(2, "twoTWO");
        System.out.println("get(3) = " + get(3));
        put(5, "five");
        System.out.println("map = " + map);
        printNode(head);
    }

    static void printNode(Node node) {
        if(node != null) {
            System.out.print(node.key + " ");
        }

        while(node.next != null) {
            node = node.next;
            System.out.print(node.key + " ");

        }
    }

    static String get(int key) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            removeNode(node);
            addNode(node);
            return node.value;
        }
        return "-1";
    }

    static void put(int key, String value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            removeNode(node);
            map.remove(key);
        }

        if(map.size() >= CAPACITY) {
            map.remove(tail.key);
            removeNode(tail);
        }

        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;
        addNode(newNode);
        map.put(key, newNode);
    }

    static void removeNode(Node node) {
        if(node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if(node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
    }

    static void addNode(Node node) {
        node.next = head;
        node.prev = null;

        if(head != null) {
            head.prev = node;
        }

        head = node;

        if(tail == null) {
            tail = head;
        }
    }
}
