package coll_p;

import java.util.ArrayList;
import java.util.Iterator;

class TV{}

class Phone{}

class HandPhone extends Phone{}

public class GenericsCollMain {

	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		ArrayList<TV> arr2 = new ArrayList();
		ArrayList<Phone> arr3 = new ArrayList();
		ArrayList<HandPhone> arr4 = new ArrayList();
		
		arr1.add("알바하는 들");
		arr1.add(new TV());
		arr1.add(new Phone());
		arr1.add(new HandPhone());
		
		//arr2.add("알바하는 들");
		arr2.add(new TV());
		//arr2.add(new Phone());
		//arr2.add(new HandPhone());
		
		//arr3.add("알바하는 들");
		//arr3.add(new TV());
		arr3.add(new Phone());
		arr3.add(new HandPhone());
		
		//arr4.add("알바하는 들");
		//arr4.add(new TV());
		//arr4.add(new Phone());
		arr4.add(new HandPhone());
		
		for (Object obj : arr1) {}
		
		for (TV tv : arr2) {}
		
		for (Phone ph : arr3) {}
		
		for (HandPhone hp : arr4) {}
		
		Iterator it1 = arr1.iterator();
		Iterator<TV> it2 = arr2.iterator();
		Iterator<Phone> it3 = arr3.iterator();
		Iterator<HandPhone> it4 = arr4.iterator();
		
		Object oo = it1.next();
		TV tv = it2.next();
		Phone ph = it3.next();
		HandPhone hp = it4.next();
		

	}

}
