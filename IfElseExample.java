package chapter1;

public class IfElseExample {

    public static void main(String[] args) {

        int number = 20;

        
        if (number > 30) {
            System.out.println("Number is greater than 30");
        } else if (number > 10) {
            System.out.println("Number is greater than 10 but less than or equal to 30");
        } else {
            System.out.println("Number is 10 or less");
        }
    }
}

