public class ArrayModify 
{
 public static void main(String[] args) 
 { 
                                            // Array Modification
   // To modify an element within an array, simply find the index at which that element is stored and assign a new value to it.
   int[] grades = {85, 95, 48, 100, 92};
   System.out.println(grades[2]);

   grades[2] = 88; //88 will replace 48 at index 2
   System.out.println(grades[2]);

                                          // Modifying Multiple Arrays

   // You can create and modify as many arrays as you’d like. 
   // For example, you can create an array to store your family members and another array to store their age.


    String[] family = {"Dad", "Mom", "Brother", "Sister"};
    int[] age = new int[4];
    
    System.out.println(family[0] + " " + age[0]);
    System.out.println(family[1] + " " + age[1]);
    System.out.println(family[2] + " " + age[2]);
    System.out.println(family[3] + " " + age[3]);    
                                          // What happens if you:
   // Add age[0] = 50; directly below the line int[] age = new int[4];?
   // Add age[1] = 45; below the line int[] age = new int[4]; but before the print statements?
   // Add age[2] = 25; below the line int[] age = new int[4]; but before the print statements?
   // Add age[3] = 20; below the line int[] age = new int[4]; but before the print statements?
   // Change "Sister" within the String array to "Brother2"?
 }   
}
