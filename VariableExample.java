package chapter1;
public class VariableExample {

    
    static int classVariable = 10;

    
    int instanceVariable;

   
    public VariableExample(int value) {
        instanceVariable = value;
    }

    
    public void demonstrateVariables(int paramVariable) {
        
        int localVariable = 20;

        System.out.println("Class variable (Static): " + classVariable);
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Local variable: " + localVariable);
        System.out.println("Parameter variable: " + paramVariable);
    }

    public static void main(String[] args) {
        VariableExample obj = new VariableExample(50);

        obj.demonstrateVariables(30);
    }
}

