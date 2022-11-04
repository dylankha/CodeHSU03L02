import java.sql.SQLOutput;
import java.util.Scanner;
public class BooleanFun {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your age: ");
        int myAge = input.nextInt();
        int nextAge = myAge + 1;

        System.out.println("Current age: " + myAge);

        //convert these into something more complete using if statements
        System.out.println ();
        System.out.println("Can rent a car: " + (myAge >= 25));
        if(myAge >= 25){
            System.out.println("You can rent a car!");
        }

        else{
            System.out.println("You can't rent a car :( ");
        }

        System.out.println ();
        System.out.println("Gets a senior discount: "+ (myAge >= 65));
        if(myAge >= 65){
            System.out.println("You can get a senior discount. You're old lmao.");
        }

        else{
            System.out.println("You can't yet have a senior discount. One day...");
        }

        System.out.println ();
        System.out.println("Can order from children's menu: " + (myAge <=12));
        if(myAge <= 12){
            System.out.println("You can order from the children's menu!");
        }

        else{
            System.out.println("Cheap ass. No kids menu for you.");
        }

        System.out.println ();
        System.out.println("On your next birthday out you will be: " + nextAge); //complete this code, don't do math inside

        //further modification: prompt user for input and then print what they are able to do based on their age
        //and print their age on their next birthday

    }
}
