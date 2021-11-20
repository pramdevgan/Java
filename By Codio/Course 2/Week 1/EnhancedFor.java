public class EnhancedFor 
{
    public static void main(String[] args) 
    {
                                                // Using an Enhanced For-Loop

// There is a special type of for loop that can be used with arrays called an enhanced for loop. 
// An enhanced for loop, also known as a for each loop, can be used to iterate through array elements without having to refer to any array indices. 
// To use an enhanced for loop, you need the following:
// The keyword "for" followed by parentheses ().
        // A typed iterating variable followed by colon : followed by the array name.
        // Note that the iterating variable must be of the same type as the array.
// Any commands that repeat within curly braces {}.
    // Note that when using an enhanced for loop, you can print the iterating variable itself without using brackets [].
    String[] friends = {"Alan", "Bob", "Carol", "David", "Ellen", 
                        "Fred", "Grace", "Henry", "Ian", "Jen"};

    for (String i : friends) {
    System.out.println(i);
    }

    
    }
}
