package de.unistuttgart.vis.dsass2019.ex02.p2;

public class Main {

	public static void main(String[] args) {
		SimpleList<Integer> list  = new SimpleList<>();
		
		list.append(4);
		list.append(568);
		list.append(85);
		list.append(9);
		list.append(3);
		list.append(53);
		list.append(4444);
		list.append(12345);
		list.append(0);
		list.append(222);
		Sorter.selectionSort(list);
		
		
		
		System.out.println(list.size());

		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println( list.get(i));
			}
		
		
	}

}
