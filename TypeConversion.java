package chapter1;

public class TypeConversion {
    public static void main(String[] args) {
        
        
        int intValue = 10;
        double doubleValue = intValue; 
        System.out.println("Implicit Conversion:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);

        
        double doubleValue2 = 9.99;
        int intValue2 = (int) doubleValue2; 
        System.out.println("\nExplicit Conversion:");
        System.out.println("double: " + doubleValue2);
        System.out.println("int (after casting): " + intValue2);

        
        String strValue = "123";
        int numericValue = Integer.parseInt(strValue); 
        System.out.println("\nString to Numeric Conversion:");
        System.out.println("String: " + strValue);
        System.out.println("Numeric value (int): " + numericValue);

        
        int num = 456;
        String numStr = String.valueOf(num); 
        System.out.println("\nNumeric to String Conversion:");
        System.out.println("Numeric value: " + num);
        System.out.println("String value: " + numStr);
    }
}
