import java.util.Scanner;
public class Calculator{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);



    System.out.println("Choose operator ( +, *, -,  /): ") ;   
    String operator = input.nextLine();

    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();




    if(operator.equals("+")){
    int add = addition(num1, num2);
    System.out.println(num1 + " + " + num2 + " = " + add);
    }
    if(operator.equals("+")){
    int add3 = addition(num1, num2, num3);
    System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + add3);
    }

    if(operator.equals("*")){
    int multiply = multiplication(num1, num2);
    System.out.println(num1 + " * " + num2 + " = " + multiply);
    }
    if(operator.equals("*")){
    int multiply3 = multiplication(num1, num2, num3);
    System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + multiply3);
    }



    if(operator.equals("/")){
    double divide = division(num1, num2);
    System.out.println(num1 + " / " + num2 + " = " + divide);
    }
    if(operator.equals("/")){
    double divide3 = division(num1, num2, num3);
    System.out.println(num1 + " / " + num2 + " / " + num3 + " = " + divide3);
    }



    if(operator.equals("-")){
    int subtract = subtraction(num1,num2);
    System.out.println(num1 + " - " + num2 + " = " + subtract);
    }
    if(operator.equals("-")){
    int subtract3 = subtraction(num1,num2, num3);
    System.out.println(num1 + " - " + num2 + " - " + num3 + " = " + subtract3);
    }


}

   public static int addition(int num1, int num2){
       return num1 + num2; 
    }
    public static int addition(int num1, int num2, int num3){
       return num1 + num2 + num3; 
    }



    public static int multiplication(int num1, int num2){
       return num1 * num2; 
    }
    public static int multiplication(int num1, int num2, int num3){
    return num1 * num2 * num3; 
    }



    public static int division(int num1, int num2){
       return num1 / num2; 
    }
    public static int division(int num1, int num2, int num3){
       return num1 / num2 / num3; 
    }



    public static int subtraction(int num1, int num2){
       return num1 - num2; 
    }
    public static int subtraction(int num1, int num2, int num3){
       return num1 - num2 - num3; 
    }

}
