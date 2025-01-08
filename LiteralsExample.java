package chapter1;

public class LiteralsExample {

    public static void main(String[] args) {

       
        int intLiteral = 100; 
        int hexLiteral = 0xFF; 
        int octalLiteral = 0123; 
        int binaryLiteral = 0b1010;
        System.out.println("Integer literals: " + intLiteral + ", " + hexLiteral + ", " + octalLiteral + ", " + binaryLiteral);

        
        float floatLiteral = 3.14f; 
        double doubleLiteral = 3.14159; 
        System.out.println("Floating-point literals: " + floatLiteral + ", " + doubleLiteral);

        
        char charLiteral = 'A';
        char unicodeChar = '\u0041'; 
        System.out.println("Character literals: " + charLiteral + ", " + unicodeChar);
        boolean trueLiteral = true; 
        boolean falseLiteral = false; 
        System.out.println("Boolean literals: " + trueLiteral + ", " + falseLiteral);

        
        String strLiteral = "Hello, World!"; 
        System.out.println("String literal: " + strLiteral);
    }
}
