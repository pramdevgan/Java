public class ArrayIterate 
{
    public static void main(String[] args) 
    {
                                                // Array Iteration
    // Though we can add many elements to our array, printing each of them can get quite tedious. 
    // For example, if we have 10 names of friends in our array, we would need to specify each of their array index to print them. 


    // String[] friends = {"Alan", "Bob", "Carol", "David", "Ellen", 
    //                 "Fred", "Grace", "Henry", "Ian", "Jen"};

    //     System.out.println(friends[0]);
    //     System.out.println(friends[1]);
    //     System.out.println(friends[2]);
    //     System.out.println(friends[3]);
    //     System.out.println(friends[4]);
    //     System.out.println(friends[5]);
    //     System.out.println(friends[6]);
    //     System.out.println(friends[7]);
    //     System.out.println(friends[8]);
    //     System.out.println(friends[9]);

    // Luckily, we can use loops which we had learned previously to help us with this process. 
    // To print out all of our friends’ names without repeating the print statement ten times, we can use a for loop to iterate 10 times.
    // String[] friends = 
    // {
    // "Alan", "Bob", "Carol", "David", "Ellen", 
    // "Fred", "Grace", "Henry", "Ian", "Jen"
    // };

    // for (int i = 0; i < 10; i++) 
    //     {
    //     System.out.println(friends[i]);
    //     }
                                            // What happens if you:
    // Change System.out.println(friends[i]); in the code above to System.out.println(friends[0]);?
    // Change System.out.println(friends[i]); in the code above to System.out.println(friends[10]);?   
    
    
                                            // Array Length
    // To make the iteration process easier, we can use an instance variable called length to determine how many elements are in our array. 
    // To use length, just call it by adding a period . after our array followed by length. 
    // For example, friends.length will tell us how many elements are in our friends array. 
    // The advantage of using length is that we can initialize additional elements in our array without having to keep track of how many elements are already inside.

        String[] friends = {"Alan", "Bob", "Carol", "David", "Ellen", 
                            "Fred", "Grace", "Henry", "Ian", "Jen"};

        for (int i = 0; i < friends.length; i++) 
        {
        System.out.println(friends[i]);
        }
                                        // What happens if you:

    // add "Kate" as an element to the array right after "Jen"?
    // remove "Alan" and "Bob" from the array? 

    // Notice how friends.length continues to keep track of how many elements are in our array even though we’ve made several changes.
    

    }    
}
