package view;

import br.edu.fateczl.list.List;
import util.Sort;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Integer> listA = new List<>();
		List<Integer> listB = new List<>();
		List<Integer> listU = new List<>();
		List<Integer> listI = new List<>();
		
		listA.addLast(3);
		listA.addLast(5);
		listA.addLast(8);
		listA.addLast(12);
		listA.addLast(9);
		listA.addLast(7);
		listA.addLast(16);
		
		listB.addLast(9);
		listB.addLast(6);
		listB.addLast(2);
		listB.addLast(3);
		listB.addLast(7);	
		
		int size = listA.size();
		for(int i = 0; i < size; i++) 
			listU.addLast(listA.get(i));
		
		size = listB.size();
		for(int i = 0; i < size; i++) 
			listU.addLast(listB.get(i));
		
		Sort.bubbleSort(listU);
		
		for(int i = 0; i < listU.size() - 1; i++) {
			int aux = listU.get(i);
			if(aux == listU.get(i+1)) {
				listU.remove(i);
				listI.addLast(aux);
			}
		}
		
		System.out.print("List U: ");
		printList(listU);
		
		System.out.print("List I: ");
		printList(listI);
		
		
	}
	
	public static void printList(List<?> list) {
		try {
			int size = list.size();
			for(int i = 0; i < size; i++) 
				System.out.print(list.get(i) + " ");
			
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
