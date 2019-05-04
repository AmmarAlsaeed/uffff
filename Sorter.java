package de.unistuttgart.vis.dsass2019.ex02.p2;

public class Sorter {

    public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
    
   
    
    for (int  i = 0 ; i < list.size() - 1 ; i++) {
    	for(int j = i + 1 ; j < list.size() ; j++) {
    		if ( list.get(i).compareTo(list.get(j)) == +1) {
    		list.swap(i, j);
    		}
    	}
    }
    
   
    }

    public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
    }

    public static <T extends Comparable<T>> void quickSort(ISimpleList<T> list) {
    }

}
