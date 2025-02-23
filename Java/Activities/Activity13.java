
package Activities;

import java.util.*;

public class Activity13 {

    public static void main(String[] args) {
    	
    	//Create the  objects
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        Random indexGen = new Random();
        
        //Statement to show users to indicate 
        System.out.print("Enter integers please ");
        System.out.println("(EOF or non-integer to terminate): ");

        //Loop  to take only integers  from console
        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        int generatedIndex = indexGen.nextInt(list.size());
        
        //Integer nums[] = list.toArray(new Integer[0]);
        //int index = indexGen.nextInt(nums.length);
        System.out.println("Random index value generated: " + generatedIndex);
        System.out.println("Value in array at generated index: " + list.get(generatedIndex));

        scan.close();
    }
}
