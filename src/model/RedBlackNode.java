package model;
import enumerations.Color;

public class RedBlackNode<T extends Comparable<T>> {
	
	//Attributes
	private Color color;
	private T value;
	private RedBlackNode<T> father;
	private RedBlackNode<T> leftSon;
	private RedBlackNode<T> rightSon;
	
	
	/**
	 * It builds a red node all nodes when they are created are red.
	 * @param value
	 */
	public RedBlackNode(T value) {
		this.value = value;
		color = Color.RED;
	
	}
	
	/**
	 * It builds a black node without value, all the node must have a null black node.
	 */
	public RedBlackNode() {
		
		
	}
	
	//
	// == GETTERS AND SETTERS  
	//

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public RedBlackNode<T> getFather() {
		return father;
	}

	public void setFather(RedBlackNode<T> father) {
		this.father = father;
	}

	public RedBlackNode<T> getLeftSon() {
		return leftSon;
	}

	public void setLeftSon(RedBlackNode<T> leftSon) {
		this.leftSon = leftSon;
	}

	public RedBlackNode<T> getRightSon() {
		return rightSon;
	}

	public void setRightSon(RedBlackNode<T> rightSon) {
		this.rightSon = rightSon;
	}
	
	
	
	
	
}
