public class PlaygroundDivision {
    public static void main(String[] args) {
                //Division
    // Division in Python is done with the division (/) operator
        double a = 25;
        double b = 4;
        System.out.println(a/b);


        /*
            What happens if you:
            Change b to 0? ---------> it gives infinity
            Change b to 0.5?
            Change the code to
        */
        // Below i just change the veriable 
        double c = 0;
        System.out.println(a/c);

        double d = 0.5;
        System.out.println(b/d);

        // Change the code
        double e = 25;
        double f = 4;
        e /= f;
        System.out.println(e);

                            /*
                ------------------------->Integer Division<--------------------
        Normally, you use double in Java division since the result usually involves decimals. 
        If you use integers, the division operator returns an int. 
        This integer division does not round up, nor round down. 
        It removes the decimal value from the answer.
        */
        int g = 5;
        int h = 2;
        System.out.println(g/h);


        /* 
        Which of the following statements about division in Java is FALSE?

        You can use the division operator with ints

        You will get the same result from the division operator using ints and doubles (Correct)

        You can use the division operator with doubles

        You are not allowed to divide by 0

                                    Explaination
        ints and doubles behave differently with the division operator. 
        Using double will result in a decimal where int will result in a whole number with the decimal removed. 
        This means that 10/3 is either 3.3333... or 3 based on data types.
        */
    }
}
