import java.util.Scanner;
public class Calculator {
 
    static double add(double x,double y){return x+y; }
    static double sub(double x,double y){return x-y; }
    static double mul(double x,double y){return x*y; }
    static double div(double x,double y){
        if(y==0){
            System.out.println(" Cannot div by 0");
            return 0;
        }
        return x/y; 
    }
    static double mod(double x,double y){return x%y; }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        double x=sc.nextDouble();
        System.out.print("Enter num2: ");
        double y=sc.nextDouble();
        System.out.print("Select an operaator: ");
        char op=sc.next().charAt(0);
        double result=0;
        switch(op){
            case '+':
                result=add(x,y);break;
            case '-':
                result=sub(x,y);break;
            case'*':
            result=mul(x,y); break;
            case'/':
            result=div(x,y); break;
            case'%':
            result=mod(x,y);break;
            default: System.out.println("Invalid operator");
        }
        System.out.print("Result: "+result);
        sc.close();
    }

}
