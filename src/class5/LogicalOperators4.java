package class5;

import java.util.Scanner;

public class LogicalOperators4 {
    public static void main(String[] args) {

        String day ="Friday";
        switch (day){
            case"Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            case "Thursday":
                System.out.println("4");
                break;
            case "Friday":
                System.out.println("5");
                break;
            default:
                System.out.println("Wrong day");

        }


    }

    public static class ScannerDemo1 {
        public static <Char> void main(String[] args) {
            Scanner scan=new Scanner(System.in);

            /*
            Scanner => Name of the class
            scan is just a variable like we create primitive variable
            = => assignment operator
            System.in => tells the computer we want to read the data from keyboard

             */
    //        System.out.println("Please Enter your age");
    //        int age=scan.nextInt();
    //        System.out.println("You are " + age +"Years old");
    //
    //        System.out.println("Please Enter your weight");
    //        double weight=scan.nextDouble();
    //        System.out.println(" your weight is "+weight+ " Kg");
    //
    //        System.out.println("Are you hungry");
    //        boolean hnugry=scan.nextBoolean();
    //        System.out.println("Hungry "+hungry);

    //
    //        System.out.println("Please Enter your gender");
    //        char gender=scan.next().charAt(0); // char type of input
    //        System.out.println("Your gender is "+gender);


            System.out.println("Please Enter your name");
            String name=scan.next();
            System.out.println("Please name is "+name);

            scan.nextLine(); // trick to make nextline method work after wa have used any other method from
            // Scanner class
            System.out.println("Please Enter your full name");
            String fullName=scan.nextLine();
            System.out.println("Your full name is " +fullName);
            scan.close(); // Good practice





        }
    }

    public static class SwitchCaseDemo {
        public static void main(String[] args) {

            int day=1;
            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Wrong day");

            }


        }
    }
}
