import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

/**
 * Exercises on if, for and while loops
 */
public class Main {

    Scanner input = new Scanner(System.in);
    // Look up the documentation for Scanner and what methods are available
    private Main() {

    int number1; // first number to compare
    int number2; // second number to compare
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 4;
        Main obj = new Main();

        /*obj.compare(1,5 );
        obj.floatNum();
        obj.loop(1);*/
        obj.reverse();
    }





    //TODO: Write a Java program to compare two numbers.
    public void compare(int a,int b) {
        int compare;
        if (a > b)
            System.out.println(a + " is bigger than " + b);
        else if (a < b)
            System.out.println(a + " is smaller than " + b);
        else if (a==b)
            System.out.println(a+" is equal with "+b);
    }



    // TODO: Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    // TODO: Otherwise, print "positive" or "negative".
        public  void floatNum(){
        double floatNum;
        System.out.println("Enter your number here: ");
        floatNum = input.nextDouble();

        if (floatNum==0)
            System.out.println("zero");
        else if (floatNum>0)
            System.out.println("positive");
        else System.out.println(("negative"));
        }





    // TODO: Write a program in Java to display the first 10 natural numbers.
    public void loop(int i){
        int Loop;
        for(i=0;i<10;i++)
        System.out.println("Value of i is "+i);

    }







    // TODO: Write a Java program to reverse a string. Print the before and after.
    public void reverse() {
        System.out.println("Enter a string: ");
        char[] a = input.nextLine().toCharArray();
        for (int i = a.length-1;i>=0; i--)
            System.out.print(a[i]);
    }






}



