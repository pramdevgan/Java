public class PlaygroundAddition {
    public static void main(String[] args)
    {
        /*
            The Addition (+) Operator
            The addition operator works as you would expect with numbers.
        */
        System.out.println(7+3);

        // You can also add two variables together

        int a = 7;
        int b = 3;
        System.out.println(a+b);


        /*
            -------------->What happens if you:<--------------
            Make a of type double(e.g. double a = 7.0;)?
            Make b a negative number (e.g. int b = -3;)?
            Make b an explicitly positive number (e.g. int b = +3;)
        */
        // Make a of type double(e.g. double a = 7.0;)?
        double c = 7.0;
        System.out.println(c + b); // you get a double in answer

        // Make b a negative number (e.g. int b = -3;)?
        // Insted of b i take another variable bcuz it already has been declared
        int d = -3;
        System.out.println(a+d); // you get a int 4 in answer bcuz +- = - that means 7-3=4.


        // Make b an explicitly positive number (e.g. int b = +3;)
        int e = +3;
        System.out.println(e+a); // you get a int 10 in answer


        /*
        >------------------>Adding ints and doubles<------------------<
        What happens when you add an int and a double together?

        You get an error

        You get an int

        You get a double (Correct)

        Since a double can represent the same value as an integer (2.0 is the same value as 2), but not necessarily the other way around (2.4 cannot be an int) the result will be a double. For example:

        7.0 + 3 = 10.0
        */
    }
}
