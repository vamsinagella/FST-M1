
package Activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		//Create Array list
		List<String> myList = new ArrayList<String>();
		//Add 5 names
		myList.add("Lion");
		myList.add("Tiger");
		myList.add("Giraffe");
		myList.add(1,"Bear");
		myList.add(3,"Fox");
		//printing all the objects
		System.out.println("Print all the objects:");
		for(String s:myList) {
			System.out.println(s);
		}
		
		//Iterator<String> iter = myList.iterator();
		//while(iter.hasNext())
		//{
				//System.out.println(iter.next());
			
		//}
		System.out.println("3rd element in the list is: " + myList.get(2));
		System.out.println("To check Bear exists:" + myList.contains("Bear"));
		System.out.println("To check the size of the ArrayList: the total size are: " + myList.size());
		System.out.println("To remove Fox from the Arraylist : " + myList.remove(3) + " After removing the current size of the ArrayList are: " + myList.size());
	}

}
