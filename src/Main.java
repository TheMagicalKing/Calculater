import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("This is a program showing calculations in java");

        System.out.println(calc.sum(23,34));
        System.out.println(calc.sub(10,5));
        System.out.println(calc.times(5,5));
        System.out.println(calc.divide(30,2));
        System.out.println(calc.secret(35,203));

        System.out.println("Try it yourself!");
        System.out.println("Use any of the following expressions  in order to calculate something you'd like");
        System.out.println("+,-,*,/ or type secret for a secret formula!");
        System.out.println("USE ONLY ONE!");
        String scanInput =  input.next();
        if (scanInput.equals("+")){
            System.out.println("Please insert 2 numbers!");
            int frstNumb = input.nextInt();
            int scndNumb = input.nextInt();
            System.out.println(calc.sum(frstNumb,scndNumb));
        }
        else if (scanInput.equals("-")) {
            System.out.println("Please insert 2 numbers!");
            int frstNumb = input.nextInt();
            int scndNumb = input.nextInt();
            System.out.println(calc.sub(frstNumb, scndNumb));
        }
        else if (scanInput.equals("*")) {
            System.out.println("Please insert 2 numbers!");
            int frstNumb = input.nextInt();
            int scndNumb = input.nextInt();
            System.out.println(calc.times(frstNumb, scndNumb));
        }
        else if (scanInput.equals("/")) {
            System.out.println("Please insert 2 numbers!");
            int frstNumb = input.nextInt();
            int scndNumb = input.nextInt();
            System.out.println(calc.divide(frstNumb, scndNumb));
        }
        else if (scanInput.equals("secret")) {
            System.out.println();
            System.out.println("Please insert 2 numbers!");
            int frstNumb = input.nextInt();
            int scndNumb = input.nextInt();
            System.out.println(calc.secret(frstNumb, scndNumb));
        }
        else
            System.out.println("you have made an invalid input.");




    }
}
