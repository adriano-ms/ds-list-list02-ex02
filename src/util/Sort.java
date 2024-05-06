package util;

import br.edu.fateczl.list.List;

public class Sort {
	
	public static void bubbleSort(List<Integer> list) {
		try {
			int size = list.size();
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size - i - 1; j++) {
					if(list.get(j) > list.get(j + 1)) {
						int aux = list.get(j);
						list.remove(j);
						list.add(aux, j + 1);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
