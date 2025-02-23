
package Activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// Declaration Hash set
		HashSet<String> hs = new HashSet<String>();
		//Add 6 objects
		hs.add("Harry");
		hs.add("Wesley");
		hs.add("Longbotton");
		hs.add("Dumbledore");
		hs.add("Hermione");
		hs.add("Snape");
		
		//print the hashset
		System.out.println("The content are " + hs);
		//print the size of the hashset
		System.out.println("Size of the HashSet are " + hs.size());
		//remove the object
		hs.remove("Snape");
		//After removing the size and content
		System.out.println("The current size are " + hs.size() + " and the content are: " + hs);
		
		//Remove element that is not present
        if(hs.remove("Snape")) {
        	System.out.println("Snape removed from the Current Set");
        } else {
        	System.out.println("Snape is not present in the Current Set");
        }
		
        //Search for element
        System.out.println("Checking if Harry is present: " + hs.contains("Harry"));
        System.out.println("Checking if Snape is present: " + hs.contains("Snape"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);

	}

}
