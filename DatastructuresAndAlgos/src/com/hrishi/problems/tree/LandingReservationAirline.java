package com.hrishi.problems.tree;

import java.time.LocalTime;

public class LandingReservationAirline {
    static private class BinarySearchTree<Temporal> {

        private Node root = null;

        private void insert(LocalTime element, int time) {
            if (element == null) {
                throw new IllegalArgumentException("Cannot pass null arguments");
            }

            root = insert(root, element, time);
        }
        private Node insert(Node current, LocalTime element, int time) {
            Node returnNode = null;
            if(current == null) {
                returnNode = new Node(null,null, element, time);
                return returnNode;
            }

            if(element.isBefore(current.element)) {
//                System.out.println(element + " is on left side of " + current.element);
                if(element.plusMinutes(time).isBefore(current.element)) {
                    current.left = insert(current.left, element, time);
                } else {
                    System.out.println("Cannot reserve the runway at "
                            + element + " for " + time + " minutes !");
                    return current;
                }
            } else {
//                System.out.println(element + " is on right side of " + current.element);
                if(current.element.plusMinutes(current.time).isBefore(element)) {
                    current.right = insert(current.right, element, time);
                } else {
                    System.out.println("Cannot reserve the runway at "
                        + element + " for " + time + " minutes !");
                    return current;
                }
            }
            return current;
        }

        public void printInOrder() {
            printInOrder(root);
        }

        private void printInOrder(Node node) {
            if (node != null) {
                printInOrder(node.left);
                System.out.print(" " + node.element + "(" + node.time + ")");
                printInOrder(node.right);
            }
        }

    }

    static private class Node {
        private LocalTime element;
        private int time;
        private Node left;
        private Node right;
        public Node(Node left, Node right, LocalTime element, int time) {
            this.time = time;
            this.element = element;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree<LocalTime> bst = new BinarySearchTree<>();
        bst.insert(LocalTime.of(10,10), 3);
        bst.insert(LocalTime.of(10,14), 3);
        bst.insert(LocalTime.of(9, 55), 2);
        bst.insert(LocalTime.of(10, 18), 1);
        bst.insert(LocalTime.of(9, 58), 5);
        bst.insert(LocalTime.of(9, 47), 2);
        bst.insert(LocalTime.of(9, 41), 2);
        bst.insert(LocalTime.of(10, 22), 1);
        bst.insert(LocalTime.of(9, 50), 6); // cannot do reservation
        bst.insert(LocalTime.of(10, 4), 4);

        bst.printInOrder();
    }
}
