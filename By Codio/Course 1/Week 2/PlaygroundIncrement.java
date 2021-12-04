public class PlaygroundIncrement {
    public static void main(String[] args)
    {
        /*
            -------------------------------->Incrementing Variables<--------------------------------
        Incrementing a variable means to change the value of a variable by a set amount. 
        You will most often have a counting variable, which means you will increment by 1.
        */

        int a = 0;
        a = a + 1;
        System.out.println(a);


        /* 
                --------->How to Read a = a + 1<---------
            The variable a appears twice on the same line of code. 
            But each instance of a refers to something different.
        */


        /* 
            -------------------->The ++ and += Operators<--------------------
            Incrementing is a common task for programmers. 
            Many programming languages have developed a shorthand for a = a + 1 
            because of this, a++ does the same thing as a = a + 1.
        */

        int b = 0;
        int c = 0;
        b = b + 1;  // same as b++;
        c++;
        System.out.println(a);
        System.out.println(b);


        /* 
            In the cases you need to increment by a different number, you can specify it using the += operator. 
            You can replace b++; with b+=1; in the above code and get the same result.
        */
                    /*
                        ---->What happens if you:<----
                            Change b such that b+=2?
                            Change b such that b+=-1?
                            Change b such that b-=1?
                    */
        
        // Change b such that b+=2?

        int d = 1;
        d+=2;
        System.out.println(d); // you get 3 becuz first it initialize the 1 then add 2 then it print out the the 3.


        int e = 1;
        e+=-1;
        System.out.println(e); // you get 0


        int f = 1;
        f-=1;
        System.out.println(f); // you get 0

        /*
        -------------------------->Incrementing<----------------------
        Use the fewest characters possible to complete the code as described.
        */

        int even= 0;
        // add 2
        even+=2;
        int all= 0;
        // add 1
        all++;

        System.out.println(even); 
        System.out.println(all);
        /*
            If you are incrementing by 1, the shortest way is the ++ operator, 
            if you are incrementing by any other number (like 2) the shortest way is the += operator.
        */
    }
}
