import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //This part of the code is done with If, Else If and Else statements
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("This is a program showing calculations in java");
        System.out.println("This part of the program is written with");
        System.out.println("If, Else if and Else statements");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("*******************************");
        System.out.println("*******Calculator begins*******");
        System.out.println("*******************************");
        System.out.println();
        System.out.println();
        System.out.println();
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
            System.out.println("");
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

        //This part of the code is made with Switch()

        System.out.println("This is the second part of my calculator");
        System.out.println("The same calculations can be made here");
        System.out.println("Although this is made with Switch instead");
        System.out.println("of If, Else If and Else statements");
        System.out.println("please use one of the following numbers");
        System.out.println("1 for addition it'll sum up 2 number!");
        System.out.println("2 for subtraction it'l subtract 2 numbers! ");
        System.out.println("3 for times, it'll take one number and time it with another!");
        System.out.println("4 for divide it'll divide 2 numbers!");
        System.out.println("5 this is a secret expression that'll take two numbers and calculate them!");

        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("This is Addition it'll sum up 2 numbers of your choice");
                System.out.println("Please insert 2 numbers!");
                int frstNumb = input.nextInt();
                int scndNumb = input.nextInt();
                System.out.println("");
                System.out.println(calc.sum(frstNumb, scndNumb));
                break;
            case 2:
                System.out.println("This is subtraction it'll subtract 2 numbers of your choice");
                System.out.println("Please insert 2 numbers!");
                frstNumb = input.nextInt();
                scndNumb = input.nextInt();
                System.out.println("");
                System.out.println(calc.sub(frstNumb, scndNumb));
                break;
            case 3:
                System.out.println("This is times it'll take 2 numbers of your choice and time them together");
                System.out.println("Please insert 2 numbers!");
                frstNumb = input.nextInt();
                scndNumb = input.nextInt();
                System.out.println("");
                System.out.println(calc.times(frstNumb, scndNumb));
                break;
            case 4:
                System.out.println("This is divide it'll divide up 2 numbers of your choice");
                System.out.println("Please insert 2 numbers!");
                frstNumb = input.nextInt();
                scndNumb = input.nextInt();
                System.out.println("");
                System.out.println(calc.divide(frstNumb, scndNumb));
                break;
            case 5:
                System.out.println("This is the secret it'll calculate an expression from 2 numbers of your choice");
                System.out.println("Please insert 2 numbers!");
                frstNumb = input.nextInt();
                scndNumb = input.nextInt();
                System.out.println("");
                System.out.println(calc.secret(frstNumb, scndNumb));
                break;

        }
    }
}
