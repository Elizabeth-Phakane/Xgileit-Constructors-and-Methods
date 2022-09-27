import calculatorapp.Calculator;

public class Main {

    public static void main(String[] args) {


        Calculator outcome1 = new Calculator();

        //creating object instances
        Calculator subtractionOutcome = new Calculator(20,2,'-');
        Calculator additionOutcome = new Calculator(2,3,'+');
        Calculator multiplicationOutcome = new Calculator(2,5,'*');
        Calculator divisionOutcome= new Calculator(10.5,2,'/');

        //calling the methods for each object instance accordingly
        System.out.println ("The answer is: " + subtractionOutcome.subtraction());
        System.out.println("The answer is: " + additionOutcome.addition());
        System.out.println("The answer is: " + multiplicationOutcome.multiplication());
        System.out.println ("The answer is: " + divisionOutcome.division());


    }
}