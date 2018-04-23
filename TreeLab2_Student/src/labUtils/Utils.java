package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		Position<Integer> root = t.addRoot(4);
		Position<Integer> children1 = t.addChild(root, 9);
		t.addChild(children1, 7);
		t.addChild(children1, 10);
		Position<Integer> children2 = t.addChild(root, 20);
		Position<Integer> children3 = t.addChild(children2, 15);
		t.addChild(children3, 12);
		Position<Integer> children4 = t.addChild(children3, 17);
		t.addChild(children4, 19);
		Position<Integer> children5 = t.addChild(children2, 21);
		Position<Integer> children6 = t.addChild(children5, 40);
		t.addChild(children6, 30);
		t.addChild(children6, 45);



		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		
		
		return t; 
	}


}
