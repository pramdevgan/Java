public class PlaygroundConcatenation {
    public static void main(String[] args)
    {
        /*
        ------------------->String Concatenation<-------------------
        String concatenation is the act of combining two strings together. 
        This is done with the + operator.
        */

        String a = "This is an";
        String b = " example of string concatenation";
        String c = a+b;
        System.out.println(c);


        /*
        ------------------------->What happens if you:<---------------------
        Concatenate two strings without an extra space (i.e. a = "This is an")?
        Use the += operator instead of the + operator (i.e. a+=b;)?
        Add 3 to a string?
        Add "3" to a string?
        */

        // Use the += operator instead of the + operator (i.e. a+=b;)?

        String d = a+=b;
        System.out.println(d); // Nothing will happen it give same result like a+b.


        // Add 3 to a string?

        // String e = 3;
        // String f = e + b;
        // System.out.println(f); // it gives error -----> "error: incompatible types: int cannot be converted to String"
        

        // Add "3" to a string?

        String g = " 3";
        String h = a + g; 
        System.out.println(h);

        /* 
            Construct a program that will print:
            I understand String concatenation!
        */
        String i = "I understand";
        String j = i + " String concatenation!";
        System.out.println(j);


        /*
                                            In Java, Strings must use double quotes (") - not single quotes (').

        Additionally, you need to either end or start with a space when concatenating two Strings to get normal spacing in your resulting String.

        String a needs to be declared and instantiated before you use it in the instantiation of String b.

        Since you are concatenating String a in the initialization of String b, you do not need to concatenate it again in the print statement.
        */
    }
}
