package generics;

import java.util.ArrayList;
import java.util.Comparator;


import enumerations.Color;
import interfaces.HelpInSearch;



public class RedBlackTree<T extends HelpInSearch> {
	
	//Attributes
	private RedBlackNode<T> root;
	private RedBlackNode<T> sonNull;
	private Comparator<T> comp;
	private ArrayList<T> list;
	
	public RedBlackTree(Comparator<T> comp) {
		sonNull = new RedBlackNode<T>();
		sonNull.setColor(Color.BLACK);
		sonNull.setLeftSon(null);
		sonNull.setRightSon(null);
		root = sonNull;
		this.comp = comp;
		list = new ArrayList<T>();
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
	
	public ArrayList<T> getList(){
		return list;
	}
	
	
	public ArrayList<T> searchByName(String input){
	
		searchByNameHelp(root,input);
		
		return list;
		
	}
	
	
	public void delete(T value) {
		
		RedBlackNode<T> node = new RedBlackNode<>(value);
		
		delete(root,node);
	}
	
	private void delete(RedBlackNode<T> current, RedBlackNode<T> node) {
		if(current == sonNull) {
			return;
		}
		else if(comp.compare(current.getValue(),node.getValue())==0) {
			
			
			if(current.getValue().getIdI().equals(node.getValue().getIdI())) {
				deleteNodeHelper(current);
			}
		}
		else if(comp.compare(current.getValue(),node.getValue())>0) {
			delete(current.getLeftSon(),node);
		}
		else {
			delete(current.getRightSon(),node);
		}
	}
	
	public void deleteNodeHelper(RedBlackNode<T> node) {
		
		RedBlackNode<T> x, y;
		
		y = node;
		
		Color yOriginalColor = y.getColor();
		
		if(node.getLeftSon() == sonNull) {
			x = node.getRightSon();
			rbTransplant(node,node.getRightSon());
			
		}
		else if(node.getRightSon() == sonNull) {
			x = node.getLeftSon();
			rbTransplant(node,node.getLeftSon());
			
		}
		else {
			y = minimum(node.getRightSon());
			
			yOriginalColor = y.getColor();
			
			x = y.getRightSon();
			
			if(y == node.getFather()) {
				x.setFather(y);
			}
			else {
				rbTransplant(y, y.getRightSon());
				y.setRightSon(node.getRightSon());
				y.getRightSon().setFather(y);
			
			}
			
			rbTransplant(node, y);
			y.setLeftSon(node.getLeftSon());
			y.getLeftSon().setFather(y);
			y.setColor(node.getColor());
	
			
		}
		
		if(yOriginalColor == Color.BLACK) {
			fixDelete(x);
		}
		
	}
	
	public void fixDelete(RedBlackNode<T> node) {
		RedBlackNode<T> s;
		
		while(node != root && node.getColor() == Color.BLACK) {
			if(node == node.getFather().getLeftSon()) {
				s = node.getFather().getRightSon();
				
				if(s.getColor() == Color.RED) {
					s.setColor(Color.BLACK);
					node.getFather().setColor(Color.RED);
					leftRotate(node.getFather());
					s = node.getFather().getRightSon();
				}
				
				if(s.getLeftSon().getColor() == Color.BLACK &&
						s.getRightSon().getColor() == Color.BLACK) {
					s.setColor(Color.RED);
					node = node.getFather();
				}
				else {
					if(s.getRightSon().getColor() == Color.BLACK) {
						s.getLeftSon().setColor(Color.BLACK);
						s.setColor(Color.RED);
						rightRotate(s);
						s = node.getFather().getRightSon();
					}
					
					s.setColor(node.getFather().getColor());
					node.getFather().setColor(Color.BLACK);
					s.getRightSon().setColor(Color.BLACK);
					leftRotate(node.getFather());
					node = root;
				}
			} else {
				
				s = node.getFather().getLeftSon();
				
				if(s.getColor() == Color.RED) {
					s.setColor(Color.BLACK);
					node.getFather().setColor(Color.RED);
					rightRotate(node.getFather());
					s = node.getFather().getLeftSon();
				}
				
				if(s.getRightSon().getColor() == Color.BLACK &&
						s.getLeftSon().getColor() == Color.BLACK) {
					

					s.setColor(Color.RED);
					node = node.getFather();
				}
				else {
					if(s.getLeftSon().getColor() == Color.BLACK) {
						
						s.getRightSon().setColor(Color.BLACK);
						s.setColor(Color.RED);
						leftRotate(s);
						s = node.getFather().getLeftSon();
					}
					
					s.setColor(node.getFather().getColor());
					node.getFather().setColor(Color.BLACK);
					if(s.getLeftSon() == null) {
						return;
					}
					s.getLeftSon().setColor(Color.BLACK);
					rightRotate(node.getFather());
					node = root;
					
				}
			}
			
		}
		node.setColor(Color.BLACK);
	}
		
		
	
	public void rbTransplant(RedBlackNode<T> u, RedBlackNode<T> v) {
		if(u.getFather() == null) {
			root = v;
		}
		else if(u == u.getFather().getLeftSon()) {
			u.getFather().setLeftSon(v);
		}
		else {
			u.getFather().setRightSon(v);
		}
		v.setFather(u.getFather());
	}
	
	
	public RedBlackNode<T> minimum(RedBlackNode<T> node){
		
		while(node.getLeftSon() != sonNull) {
			node = node.getLeftSon();
		}
		
		return node;
	}

	
	
	public void searchByNameHelp(RedBlackNode<T> current,String input){
		if(current == sonNull) {
			return;
		}
		else if(areSameCharacters(input,current.getValue().getNameI())==true) {
			
			if(list.size() > 100) {
				return;
			}
			else {
				
				list.add(current.getValue());
				
				
				//If we find a node with the same characters values of the input, we have to look to the right
				
				if(current.getRightSon() != sonNull) {
					if(verifyNextCharacterIsGreater(input,current.getRightSon().getValue().getNameI()) == true) {
						
						if(current.getLeftSon() != sonNull) {
							if(verifyNextCharacterIsGreater(input,current.getLeftSon().getValue().getNameI()) == false){ 
								searchByNameHelp(current.getLeftSon(),input);
							}
							else {
								current = sonNull;
							}
						}
						
						
					}
					else {
						searchByNameHelp(current.getRightSon(),input);
					}
				}
				
				
			}
		}
		else {
			
			
			//If the name in the current node is not greater, we have to search in the right son
			if(currentIsGreater(input,current.getValue().getNameI())==false) {
				searchByNameHelp(current.getRightSon(),input);
			}
			else {
				
				if(currentIsMinor(input,current.getValue().getNameI())==true) {
					searchByNameHelp(current.getRightSon(),input);
				}
				searchByNameHelp(current.getLeftSon(),input);
			}
		}
	}
	
	public ArrayList<T> searchByLastName(String input){
		searchByLastNameHelp(root,input);
		return list;
		
	}
	
	public void searchByLastNameHelp(RedBlackNode<T> current,String input) {
		if(current == sonNull) {
			return;
		}
		else if(areSameCharacters(input,current.getValue().getLastNameI())==true) {
			if(list.size() >100) {
				return;
			}
			list.add(current.getValue());
			
			//If we find a node with the same characters values of the input, we have to look to the right
			if(current.getRightSon() != sonNull) {
				
				if(verifyNextCharacterIsGreater(input,current.getRightSon().getValue().getLastNameI()) == true) {
					
					if(current.getLeftSon() != sonNull) {
						if(verifyNextCharacterIsGreater(input,current.getLeftSon().getValue().getLastNameI()) == false){ 
							searchByLastNameHelp(current.getLeftSon(),input);
						}
						else {
							current = sonNull;
						}
					}
					
					
				}
				else {
					searchByNameHelp(current.getRightSon(),input);
				}
			}
			
		}
		else {
			//If the name in the current node is not greater, we have to search in the right son
			if(currentIsGreater(input,current.getValue().getLastNameI())==false) {
				searchByLastNameHelp(current.getRightSon(),input);
			}
			else {
				
				if(currentIsMinor(input,current.getValue().getLastNameI())==true) {
					searchByLastNameHelp(current.getRightSon(),input);
				}
				searchByLastNameHelp(current.getLeftSon(),input);
			}
		}
	}
	public ArrayList<T> searchByFullName(String input) {
		searchByFullNameHelp(root,input);
		return list;
	}
	
	public void searchByFullNameHelp(RedBlackNode<T> current,String input) {
		if(current == sonNull) {
			return;
		}
		else if(areSameCharacters(input,current.getValue().getfullNameI())==true) {
			if(list.size() >100) {
				return;
			}
			list.add(current.getValue());
			
			//If we find a node with the same characters values of the input, we have to look to the right
			if(current.getRightSon() != sonNull) {
				
				if(verifyNextCharacterIsGreater(input,current.getRightSon().getValue().getfullNameI()) == true) {
					
					if(current.getLeftSon() != sonNull) {
						if(verifyNextCharacterIsGreater(input,current.getLeftSon().getValue().getfullNameI()) == false){ 
							searchByFullNameHelp(current.getLeftSon(),input);
						}
						else {
							current = sonNull;
						}
					}
					
					
				}
				else {
					searchByFullNameHelp(current.getRightSon(),input);
				}
			}
			
		}
		else {
			//If the name in the current node is not greater, we have to search in the right son
			if(currentIsGreater(input,current.getValue().getfullNameI())==false) {
				searchByFullNameHelp(current.getRightSon(),input);
			}
			else {
				
				if(currentIsMinor(input,current.getValue().getLastNameI())==true) {
					searchByFullNameHelp(current.getRightSon(),input);
				}
				searchByFullNameHelp(current.getLeftSon(),input);
			}
		}
	}
	
	public ArrayList<T> searchByCode(String input) {
		searchByCodeHelp(root,input); 
		return list;
	}
	
	public void searchByCodeHelp(RedBlackNode<T> current,String input) {
		if(current == sonNull) {
			return;
		}
		else if(areSameCharacters(input,current.getValue().getIdI())==true) {
			if(list.size() >100) {
				return;
			}
			list.add(current.getValue());
			
			//If we find a node with the same characters values of the input, we have to look to the right
			if(current.getRightSon() != sonNull) {
				
				if(verifyNextCharacterIsGreater(input,current.getRightSon().getValue().getIdI()) == true) {
					
					if(current.getLeftSon() != sonNull) {
						if(verifyNextCharacterIsGreater(input,current.getLeftSon().getValue().getIdI()) == false){ 
							searchByCodeHelp(current.getLeftSon(),input);
						}
						else {
							current = sonNull;
						}
					}
					
					
				}
				else {
					searchByCodeHelp(current.getRightSon(),input);
				}
			}
			
		}
		else {
			//If the name in the current node is not greater, we have to search in the right son
			if(currentIsGreater(input,current.getValue().getIdI())==false) {
				searchByCodeHelp(current.getRightSon(),input);
			}
			else {
				
				if(currentIsMinor(input,current.getValue().getIdI())==true) {
					searchByCodeHelp(current.getRightSon(),input);
				}
				searchByCodeHelp(current.getLeftSon(),input);
			}
		}
	}
	
	public boolean areSameCharacters(String input,String nodeName) {
		int inputLength = input.length();
		
		
		for(int i = 0; i<inputLength;i++) {
			if(i<nodeName.length()) {
				if(input.charAt(i) != nodeName.charAt(i)) {
					return false;
				}
			}
			
		}
		
		return true;
	}
	
	public boolean verifyNextCharacterIsGreater(String input, String nextInput) {
		
		char v1 = input.charAt(0);
		char v2 = nextInput.charAt(0);
		
		if(v2>v1) {
			return true;
		}
		
		return false;
		
	}
	
	public boolean currentIsMinor(String input,String nodeInput) {
		int inputLength = input.length();
		
		for(int i = 0;i<inputLength;i++) {
			if(i<nodeInput.length()) {
				
				if(input.charAt(i) > nodeInput.charAt(i)) {
					return true;
				}
			}
			
		}
		
		return false;
	}
	
	public boolean currentIsGreater(String input,String nodeInput) {
		
		int inputLength = input.length();
		
		if(input.length()>nodeInput.length()) {
			return false;
		}
		
		
		for(int i = 0; i<inputLength;i++) {
			
			if(i<nodeInput.length()) {
				
				if(input.charAt(i) < nodeInput.charAt(i)) {
					return true;
				}
			}
			
			
		}
		
		return false;
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
	
	//
	// GETTERS AND SETTERS
	//
	public void setNewInstance() {
		list = new ArrayList<T>();
	}

	public RedBlackNode<T> getRoot() {
		return root;
	}

	public void setRoot(RedBlackNode<T> root) {
		this.root = root;
	}
	public RedBlackNode<T> getSonNull() {
		return sonNull;
	}

	

	
	
	
	
}
