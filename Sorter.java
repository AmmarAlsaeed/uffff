package de.unistuttgart.vis.dsass2019.ex02.p2;

public class Sorter {

    public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
    
   
    
    for (int  i = 0 ; i < list.size() - 1 ; i++) {                       
    	for(int j = i + 1 ; j < list.size() ; j++) {
    		if ( list.get(i).compareTo(list.get(j)) == +1) {       // wenn das Element in der pos i kleiner als das Element in der pos j
    		list.swap(i, j);                                       //  tausche i mit j 
    		}
    	}
    }
    
   
    }

    public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
    }

    public static <T extends Comparable<T>> void quickSort(ISimpleList<T> list) {
    }

}
