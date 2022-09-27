
/*
This console Calculator application will offer four functionalities
(Addition, Subtraction, Multiplication, Division). It will work on 2 numbers provided through a constructor
as well as an operator sign to demonstrate the actions in the methods.
 */
package calculatorapp;

public class Calculator {

    double num1;
    double num2;
    char operationSign;
    double result ;

    //constructor with no parameters
    public Calculator(){

        System.out.println("constructor with no parameters");
    }

    //Assigning values to the attributes that will be used in the calculation methods
    public Calculator(double num1 , double num2,char operationSign){
        this.num1 = num1;
        this.num2 = num2;
        this.operationSign =operationSign;

    }

    //This is a method for the addition action using 2 numbers
    public double addition(){

       if(operationSign =='+') {
           result = num1 + num2;
       }
       return result;
    }

    //This is a method for the multiplication action using 2 numbers
    public double multiplication(){

        if(operationSign =='*') {
            result = num1 * num2;
        }
        return result;
    }


    //This is a method for the division action using 2 numbers
    public double division(){

        if(operationSign =='/') {
            result = num1 / num2;
        }
        return result;
    }


    //This is a method for the subtraction action using 2 numbers
    public double subtraction(){

        if(operationSign =='-') {
            result = num1 - num2;
        }
        return result;
    }


}
