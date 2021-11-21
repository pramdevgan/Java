public class Lab_Variables {
        public static void main(String[] args) {
            String english = "Hello";
            String spanish = "Hola";
            String italian = "Ciao";
            String french = "Bonjour";

            spanish = english;
            italian = spanish;
            french = italian;

            System.out.println(french);
        }
}