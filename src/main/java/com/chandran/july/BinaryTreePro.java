package com.chandran.july;

/*
 * This program is for reading and rewriting Binary Tree. Adding two tree nodes
 * Date : 08/26/2021.
 */

public class BinaryTreePro {

	public static void main(String[] args) {
		
		BTNode leftNode1 = new BTNode(1,null,null);
		BTNode rightNode11 = new BTNode(3,null,null);
		BTNode btnodeLeft = new BTNode(2,leftNode1,rightNode11);
		
		
	
		BTNode rightNode22 = new BTNode(6,null,null);
		
		BTNode rightNode33 = new BTNode(10,null,null);
		BTNode rightNode44 = new BTNode(12,null,null);
		
		BTNode btnodeRight = new BTNode(11,rightNode33,rightNode44);
		BTNode leftNode2 = new BTNode(9,rightNode22,btnodeRight);
		
		
		

		BTNode btnode2 = new BTNode(5,btnodeLeft,leftNode2);
		
		
		StringBuilder sb= new StringBuilder();
		traversePerOrder(sb,btnode2);
		System.out.println("Binary Tree : " + sb);

	}
	
	public static void traversePerOrder(StringBuilder sb , BTNode btnode) {
		if(btnode !=null) {
			sb.append(btnode.getValue());
			sb.append("\n");
			traversePerOrder(sb,btnode.leftNode);
			traversePerOrder(sb,btnode.rightNode);
		}
	}

}

class BTNode{
		int data;
		BTNode leftNode;
		BTNode rightNode;
		
		public BTNode(int inputData, BTNode left, BTNode right) {
			data=inputData;
			leftNode=left;
			rightNode=right;
		}
		
		public int getValue() {
			return data;
		}
}