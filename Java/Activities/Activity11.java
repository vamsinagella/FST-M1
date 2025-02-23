
package Activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// Declaring Hash map
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Red");
		hm.put(2, "Blue");
		hm.put(3, "Violet");
		hm.put(4,"Grey");
		hm.put(5, "Orange");
		
		// Print the Map
        System.out.println("The Original map: " + hm);
        
        //Remove the colour
        hm.remove(4);
        //Current Hash map
        System.out.println("The Updated map: " + hm);
        
        // Check if green exists
        if(hm.containsValue("Blue")) {
            System.out.println("Blue exists in the Map");
        } else {
            System.out.println("Blue does not exist in the Map");
        }
        
    	// Print the size of the Map
        System.out.println("Number of pairs in the Map is: " + hm.size() + " and the Map Set are " + hm);
		
		for(int key: hm.keySet()) {
			System.out.println(hm.get(key));
		}

	}

}
