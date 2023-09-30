import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Exercise
//print number from input number till 0 both ways + and -
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number");
        int number = scanner.nextInt();//15 -> 15,14,13,12 ... 0
        int addition = number > 0 ? -1 : 1;
//    while (number != 0) {
//        System.out.println(number);
//        number += addition;
//    }
//    System.out.println("0");

//Exercise
//get input from user
//print number from 0 to input
//Example input = 8
//output = 0,1,2,3,4,5,6,7,8
        int i = 0;

        while (i != number) {
            System.out.println(i);
            i -= addition;
        }
        System.out.println(number);


//Exercise
//input number from user
//calculate and print the factorial of that number
//6 number
// sum = number* number-1 * number- 2..   1...   6*5*4*3*2*1
        System.out.println("enter the number to calculate factorial");
        int sum = number;
        while (number > 1) {
            number--;
            sum = sum * number;
        }
        System.out.println(sum);


//Exercise - Card game 21
        int sumcards = 0;
        int toContinue = 1;
        do {
            int card = (int) ((Math.random() * 10) + 1);//random card between 1 to 11
            sumcards += card;
            System.out.println("you card is: " + card);
            System.out.println("your Sum now is : " + sumcards);
            //if the user wins or loses.
            if (sumcards == 21) {
                System.out.println("you win");
                break;
            }
            if (sumcards > 21) {
                System.out.println("you lost");
                break;
            }

            System.out.println("do you want more cards 1=yes 0=no");
            toContinue = scanner.nextInt();

        } while (toContinue == 1);

//Exercise guess the number
//the program will make random number from 0 to 5
//you need to guess the number
// make many attempts until you guess the number
        int random_num = (int) ((Math.random() * 2) + 1);
        int attempts = 0;
        System.out.println("Let guess the number the computer has choose:");
        int guess_num = 0;
        do {
            attempts++;
            guess_num = scanner.nextInt();
            System.out.println("this is your " + attempts + " Attempt; your number is: " + guess_num);
            if (random_num != guess_num) {
                System.out.println("You did not guess the correct number, let's try again. please enter another number:");
            }
        }
        while (random_num != guess_num) ;
        System.out.println("You got it. The correct number is: " + guess_num);

//Exercise - for loop ; ask user to give number
//the program will print from 1 to the given number
        System.out.println("please give a number");
        int user_number = scanner.nextInt();
        for (int ii=1; ii <= user_number; ii++ ){
            System.out.println(ii);}

//Exercise - for loop ; ask user to give number
//the program will print from 1 to the given number and from given number to 1
            System.out.println("please give a number");
            int user_number2 = scanner.nextInt();
            for (int iii=1; iii <= user_number2; iii++ ) {
                System.out.println(iii);}

            for (int i4=user_number2-1; i4 != 0; i4-- ) {
            System.out.println(i4);}


//Exercise - for loop ; ask user to give number
//the program will check if the given number is prime; use break
        System.out.println("please give a number, we will check if it is a prime");
        int user_number3 = scanner.nextInt();
        int number_of_dividers = 0;
        for (int i5=2; i5 < user_number3; i5++ ) {
            if (user_number3 % i5 == 0) {
                number_of_dividers++;
                if (number_of_dividers > 0) {
                    System.out.println("your number is not prime!!!");
                    break;
                }
            }
        }
        if (number_of_dividers==0){
            System.out.println("wow ; your number is a prime number!");}

//Exercise - User input grades from 0 to 100 of the students.
//When user finish he input -1
//When user finish we should print the average grade of all students.

        int number_of_students = 0;
        int sum_of_grades = 0;
        int input_grade = 0;
        while (input_grade !=-1){
            System.out.println("please enter grade of next student, to finish enter -1:");
            input_grade = scanner.nextInt();
            if (input_grade == -1) {
                break;
            }
            if (input_grade >=0 && input_grade<=100) {
                sum_of_grades += input_grade;
                number_of_students++;
            }else{
                System.out.println("invalid grade, a grade must be between 0 to 100. try again");
            }
            }
        float average = sum_of_grades/number_of_students;
        System.out.println("The average grade of "+number_of_students+" students is "+average );

//Exercise - print X tripode

        int levels =5;

        for (int j=0; j <=levels; j++){
            for (int k=1; k<=j; k++){
                System.out.print("X");
            }
            System.out.println();
        }


    }

}