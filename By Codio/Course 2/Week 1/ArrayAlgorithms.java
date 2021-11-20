public class ArrayAlgorithms {
    public static void main(String[] args) {
    
                                                // Array Algorithms

    // In addition to being used with loops, arrays can also be used with conditionals to help with tasks such as searching for 
    // a particular element,finding a minimum or maximum element, or printing elements in reverse order.
    
    // Searching for a Particular Element
    String[] cars = {"Corolla", "Camry", "Prius", "RAV4", "Highlander"};
    String Camry = "A Camry is not available."; //default String value

    for (String s : cars) { //enhanced for loop
    if (s.equals("Camry")) { //if "Camry" is in array
        Camry = "A Camry is available."; //variable changes if "Camry" exists
    }
    }
        
    System.out.println(Camry); //print whether Camry exists or not

    }
}
