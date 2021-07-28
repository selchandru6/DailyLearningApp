package com.chandran.july;

/*
 * Purpose : In Binary Search Tree, all nodes which are present to the left of root will be less than root node and nodes which are present to the right will be greater than the root node.
 * Date    : Jul 28, 2021
 * Auther  : chandransellappan
 */

public class BinarySearchTree {

	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int dataInt) {
			this.data = dataInt;
			this.left = null;
			this.right = null;
		}
	}

	public Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int data) {

		Node newNode = new Node(data);

		if (null == root) {
			root = newNode;
			return;
		} else {
			Node current = root, parent = null;
			while (true) {
				parent = current;
				if (data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public Node minNode(Node root) {
		if (root.left != null) {
			return minNode(root.left);
		} else {
			return root;
		}

	}

	public Node deleteNode(Node node, int value) {
		if (node == null) {
			return null;
		} else {
			if (value < node.data) {
				node.left = deleteNode(node.left, value);
			} else if (value > node.data) {
				node.right = deleteNode(node.right, value);
			} else {
				if (node.left == null && node.right == null) {
					node = null;
				} else if (node.left == null) {
					node = node.right;
				} else if (node.right == null) {
					node = node.left;
				} else {
					Node temp = minNode(node.right);
					node.data = temp.data;
					node.right = deleteNode(node.right, temp.data);
				}
			}

			return node;
		}
	}

	public void inorderTraversal(Node node) {
		if (root == null) {
			System.out.println("Tree is empty...");
			return;
		} else {
			if (node.left != null) {
				inorderTraversal(node.left);
			}
			System.out.println(node.data + " ");
			if (node.right != null) {
				inorderTraversal(node.right);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(50);
		bt.insert(30);
		bt.insert(70);
		bt.insert(60);
		bt.insert(10);
		bt.insert(90);

		System.out.println("Binary Search after insert ");
		bt.inorderTraversal(bt.root);

		Node deletedNode = null;
		// Deletes node 90 which has no child
		deletedNode = bt.deleteNode(bt.root, 90);
		System.out.println("\nBinary search tree after deleting node 90:");
		bt.inorderTraversal(bt.root);

		// Deletes node 30 which has one child
		deletedNode = bt.deleteNode(bt.root, 30);
		System.out.println("\nBinary search tree after deleting node 30:");
		bt.inorderTraversal(bt.root);

		// Deletes node 50 which has two children
		deletedNode = bt.deleteNode(bt.root, 50);
		System.out.println("\nBinary search tree after deleting node 50:");
		bt.inorderTraversal(bt.root);
		bt.insert(20);
		bt.insert(80);
		bt.insert(95);
		System.out.println("Binary Search after insert ");
		bt.inorderTraversal(bt.root);

	}

}
