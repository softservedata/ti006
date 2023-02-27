package com.softserve.edu04iter;

import java.util.*;

public class ApplListIter {
	public static void main(String[] args) {
		//
		// Iterator
		/*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
//		//
//		String element2 = list.get(1);
//		System.out.println("element2 = " + element2);
		//
		// Print Elements
//		System.out.println("elements: " + list);
		//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("list.get(" + i + ")= " + list.get(i));
//		}
		//
//		for (String current : list) { // implicit inner iterator
//			System.out.println("current = " + current);
//		}
		//
		Iterator<String> iterator = list.iterator(); // get iterator
		while (iterator.hasNext()) {
			String current = iterator.next();
			System.out.println("current: " + current);
		}
		*/
		/*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
		//
		// Print
		System.out.println("elements: " + list);
		//
		//int n = list.size();
		for (int i = 0; i < list.size(); i++) {
		//for (int i = 0; i < n; i++) {
            System.out.println("Current Element = " + list.get(i));
            if (list.get(i).contains("Second")) {
                list.remove(i);
				//i--;
            }
        }
		//
//        for (String current : list) {
//            System.out.println(current);
//            if (current.contains("Second")) {
//                list.remove(current);
//            }
//        }
        */
		//

		// /*-
		//List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
		//
		// Print
		System.out.println("elements: " + list);
		//
//		boolean isFound = false;
//		do {
//			isFound = false;
//			int i = 0;
//			for (i = 0; i < list.size(); i++) {
//				if (list.get(i).contains("Second")) {
//					isFound = true;
//					break;
//	            }
//			}
//			if (isFound) {
//				list.remove(i);
//			}
//		} while(isFound);
		//
		// Standart API of Java Collection
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
		    String current = iterator.next();
		    System.out.println("element = " + current);
		    if (current.contains("Second")) {
		        iterator.remove();
		    }
		}
		// */
		// /*-
		System.out.println("\nFinal List:");
		for (String current : list) {
		    System.out.println(current);
		}
		// */
	}
}
