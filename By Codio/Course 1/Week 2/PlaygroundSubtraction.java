public class PlaygroundSubtraction {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;
        int c = a - b;
        System.out.println(c);
        /* 
        What happens if you:
            Change b to -3? (you get 13 bcuz -- = + so it give 13)
            Change c to c = a - -b? (it give 7)
            Change b to 3.0? (it give Error: incompatible types: possible lossy conversion from double to int)
        */

        /*
                    ------------------------->Subtraction and Strings<-------------------------
        You might be able to concatenate strings with the + operator, but you cannot use the - operator with them.
        */
        /*String d = "one two three";
        String e = "one";
        String f = d - e;
        System.out.println(f);*/

        /* 
        ------------------------->Decrementing<-------------------------
        Use the fewest characters possible to complete the code as described.
        */

        int g = 42;
        int h = 2;
        //decrement a by 1
        g--;
        System.out.println(g);
        //decrement a by b
        g-=h;
        System.out.println(g);

        /*To decrement by 1, you use the -- operator. 
        To decrement or subtract by any other number, you use -=.*/
    }
}