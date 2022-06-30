import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
     //Object
        Function f = new Function();
       //call function
        f.print();
        f.print("Hello Word");
        //Object of Scanner class
        Scanner s = new Scanner(System.in);
        //Give from you.
        System.out.println("What is your name");
      //String
       String Name = s.nextLine();
        System.out.println("hello "+Name );
    }

}
