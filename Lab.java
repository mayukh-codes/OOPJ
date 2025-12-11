import java.util.Scanner;
public class Lab{
    public static void main(String[] args){

        // Program to pront name, roll, section, branch

        System.out.println("Name: Mayukh Das");
        System.out.println("Roll number: 2405286");
        System.out.println("Section: CSE-48");
        System.out.println("Branch: CSE");

        // Program to print corresponding grade using if else statement

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the Obtained marks:");

        int mark= scanner.nextInt();
        scanner.close();
        char Grade='U';

        if (mark >= 90 && mark<= 100){
            Grade = 'O';
        }
        else if (mark >= 80 && mark<= 90){
            Grade = 'E';
        }
        else if (mark >= 70 && mark<= 80){
            Grade = 'A';
        }
        else if (mark >= 60 && mark<= 70){
            Grade = 'B';
        }
        else if (mark >= 50 && mark<= 60){
            Grade = 'C';
        }
        else if (mark >= 40 && mark<= 50){
            Grade = 'D';
        }
        else if (mark >= 0 && mark<= 40){
            Grade = 'F';
        }

        System.out.println("Input marks: "+ mark);
        System.out.println("Grade: "+ Grade);



        // Program to print the week day based on the Day number

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Day number: ");
        int day = input.nextInt();
        input.close();

        String weekday= " ";

        if(day<1 || day>31){
            System.out.println("Invalid Day Number");
        }
        else{
            int dayno=(day-1)%7;

            switch(dayno){
                case 0:
                    weekday="Monday";
                    break;
                case 1:
                    weekday="Tuesday";
                    break;
                case 2:
                    weekday="Wednesday";
                    break;
                case 3:
                    weekday="Thursday";
                    break;
                case 4:
                    weekday="Friday";
                    break;
                case 5:
                    weekday="Saturday";
                    break;
                case 6:
                    weekday="Sunday";
                    break;
            }

        System.out.println("Entered Date: "+day);
        System.out.println("Day: "+weekday);



        // Program to check the entered number is a pallindrome or not

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = input.nextInt();
        input.close();

        int reversed = 0;
        int temp= number;
        while(temp!=0){
            reversed = reversed*10 + temp%10;
            temp/=10;
        }
        if(reversed==number){
            System.out.println("The number is equal to the number");
        }
        else{
            System.out.println("The number is not equal to the number");
        }

        // Program to take first name and last name to print both concatenated

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Name:");

        String firstName = input.nextLine();
        System.out.print("Enter the Last Name:");
        String lastName = input.nextLine();

        input.close();

        System.out.println("Final name: "+firstName+" "+lastName);
    }
}