/**
 * @author Emile Gauvin
 * GAUE20109008
 * @version 09 2022
 */
public class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while(i<=200){
            if(i % 3 == 0 && i % 5 == 0 ){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                // ligne de commentaire 2
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
