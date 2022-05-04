package generics;

import java.util.Comparator;

import enumerations.Color;


public class RedBlackTree<T> {
	
	//Attributes
	private RedBlackNode<T> root;
	private RedBlackNode<T> sonNull;
	private Comparator<T> comp;
	
	public RedBlackTree(Comparator<T> comp) {
		sonNull = new RedBlackNode<T>();
		sonNull.setColor(Color.BLACK);
		sonNull.setLeftSon(null);
		sonNull.setRightSon(null);
		root = sonNull;
		this.comp = comp;
	}
	
	public void insert(T element) {
		RedBlackNode<T> node = new RedBlackNode<T>(element);
		node.setFather(null);
		node.setLeftSon(sonNull);
		node.setRightSon(sonNull);
		node.setColor(Color.RED);
		
		
		RedBlackNode<T> y = null;
		RedBlackNode<T> x = this.root;
		
		while(x != sonNull) {
			y = x;
			if(comp.compare(x.getValue(), node.getValue())>0) {
				x = x.getLeftSon();
			}
			else {
				x = x.getRightSon();
			}
		}
		
		node.setFather(y);
		
		if(y == null) {
			root = node;
		}
		else if(comp.compare(y.getValue(),node.getValue())>0) {
			y.setLeftSon(node);
		}
		else{
			y.setRightSon(node);
		}
		
		if(node.getFather() == null) {
			node.setColor(Color.BLACK);
			return;
		}
		
		if(node.getFather().getFather() == null) {
			return;
		}
		
		balanceAfterInsert(node);
			
	}
	
	public void balanceAfterInsert(RedBlackNode<T> node) {
		RedBlackNode<T> aux;
		
		/*
		 * The tree must be balanced if the father of the new son that has been 
		 * added is Red, 
		 */
		while(node.getFather().getColor() == Color.RED) {
			//Case 1:
			//If the father of the node is same to the right son of its grandfathher
			if(node.getFather() == node.getFather().getFather().getRightSon()) {
				//aux is the left son of grandfather's node
				aux = node.getFather().getFather().getLeftSon();
				
				
				if(aux.getColor() == Color.RED) {
					//If aux is Red, the color is changed to Black.
					aux.setColor(Color.BLACK);
					
					//The father of the node is changed to Black.
					node.getFather().setColor(Color.BLACK);
					
					// The grandfahter of the node is changed to Red.
					node.getFather().getFather().setColor(Color.RED);
					
					// The new node is changed for its grand father
					node = node.getFather().getFather();
					
					
				}
				// If the father of the node is same to the left son of its grandfather(ELSE)
				else {
					//If the node is the left son of his father
					if(node == node.getFather().getLeftSon()) {
						//The node is changed for its father
						node = node.getFather();
						//Do right rotation
						rightRotate(node);
					}
					// Thew new color of the father of the node is Black
					node.getFather().setColor(Color.BLACK);
					// The new color of the grandfather of the node is Red
					node.getFather().getFather().setColor(Color.RED);
					//Do left rotaion to the grand father of the node
					leftRotate(node.getFather().getFather());
				}
			}// The father of node is the left son of the grandfather of the node
			else {
				//Aux is the right son of the grandfather of the node
				aux = node.getFather().getFather().getRightSon();
				if(aux.getColor() == Color.RED) {
					//If aux is red, the color is changed to BLACK
					aux.setColor(Color.BLACK);
					//The father of the node is changed to BLACK.
					node.getFather().setColor(Color.BLACK);
					//The grandfather  of the node is changed to RED.
					node.getFather().getFather().setColor(Color.RED);
				
					// The new node is changed for its grand father
					node = node.getFather().getFather();
						
					} //If aux is BLack
					else {
						//If hte node is right son.
						if(node == node.getFather().getRightSon()) {
							//Node is changed to its father
							node = node.getFather();
							leftRotate(node);
						}
						
						// The father of the node is changed to BLACK.
						node.getFather().setColor(Color.BLACK);
						
						//The grand fathe of the node is changed to BLACK.
						node.getFather().getFather().setColor(Color.RED);
						rightRotate(node.getFather().getFather());
						
					}
				}
				if(node == root) {
					//To stop while
					break;
				}
			}
			root.setColor(Color.BLACK);
	}
	
	
	public void rightRotate(RedBlackNode<T> node) {
				//The node y is changed to the left son of node
				RedBlackNode<T> y = node.getLeftSon();
				
				// The left son of node is changed for the right son of its left son 
				node.setLeftSon(y.getRightSon());
				
				if(y != sonNull) {
					//If y is diferent a null son without information
					y.getRightSon().setFather(node);
				}
				
				//The new father of y is the father of node
				y.setFather(node.getFather());
				
				//If node is the root, the new root is y
				if(node.getFather() == null) {
					root = y;
				} //If node is the right son of his father
				else if(node == node.getFather().getRightSon()) {
					// The right son of the father's node is y.
					node.getFather().setRightSon(y);
				}
				else {
					node.getFather().setLeftSon(y);
				}
				
				y.setRightSon(node);
				node.setFather(y);
	}
	
	public void leftRotate(RedBlackNode<T> node) {
		// Y is the right son of the node
		RedBlackNode<T> y = node.getRightSon();
		// The right son of the node is changed for the left son of its right son
		node.setRightSon(y.getLeftSon());
		
		if(y != sonNull) {
			//If y is diferent to null son without information
			y.getLeftSon().setFather(node);
		}
		
		//The new father of y is the father of node
		y.setFather(node.getFather());
		
		//If node is the root, the new root is y
		if(node.getFather() == null) {
			this.root = y;
		} // If node is the right son of his father
		else if(node == node.getFather().getLeftSon()) {
			// The right son of the father's node is 
			node.getFather().setLeftSon(y);
		}
		else {
			node.getFather().setRightSon(y);
		}
		
		y.setLeftSon(node);
		node.setFather(y);
	}
	
	public void toShowHelp() {
		toShow(root,"",true);
	}
	
	public void toShow(RedBlackNode<T> root, String aux, boolean last) {
			
			if(root != sonNull) {
				System.out.print(aux);
				if(last == true) {
					System.out.print("R----");
					aux += "   ";
				}else {
					System.out.print("L----");
					aux += "|  ";
				}
				
				String auxColor = root.getColor() == Color.RED ? "RED":"BLACK";
				System.out.println(root.getValue().toString() + "(" + auxColor + ")");
				toShow(root.getLeftSon(),aux,false);
				toShow(root.getRightSon(),aux,true);
				
			}
	
		}
	
}
