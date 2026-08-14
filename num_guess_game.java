import java.util.Scanner;
import java.util.Random;
public class num_guess_game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r =new Random();
       /*  int num;
        System.out.print("enter num: ");
        num=sc.nextInt();
        String isEven=(num%2==0) ? "Even":"odd";
        System.out.println(isEven);*/

          /*   String name = "";
        
        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);*/

        int num;
        int guess=0;
        int randomNum;
    
        int min=1;
        int max=100;
        randomNum = r.nextInt(min,max);
        System.out.printf("Guess no between %d-%d:\n",min,max);
        do{
            System.out.print("Enter a number: ");
            num=sc.nextInt();
            guess++;
            if(num>randomNum){
                System.out.println("No too High, TRY AGAIN!!");
            }
            else if(num<randomNum){
                System.out.println("No too Low, TRY AGAIN!!");
            }
            else{
                System.out.println("SPOT ON!!");
            }
        

        }while(num!=randomNum);
        System.out.println("The correct no is: "+num);
        System.out.println("The no of guesses: "+guess);
        
        sc.close();
    }
}


//TEMP CONVERSION:
/*      double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        // (condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1f°%s", newTemp, unit); */



    /* String name = "Spongebob";
       char firstLetter = 'S';
       int age = 30;
       double height = 60.5;
       boolean isEmployed = true;

       System.out.printf("Hello %s\n", name);
       System.out.printf("Your name starts with a %c\n", firstLetter);
       System.out.printf("You are %d years old\n", age);
       System.out.printf("You are %f inches tall\n", height);
       System.out.printf("Employed: %b\n", isEmployed);

       System.out.printf("%s is %d years old", name, age);

       // [.precision]

       double price1 = 9.99;
       double price2 = 100.15;
       double price3 = -54.01;

       System.out.printf("%.3f\n", price1);
       System.out.printf("%.3f\n", price2);
       System.out.printf("%.3f\n", price3);

       // [flags]

       // + = output a plus
       // , = comma grouping separator
       // ( = negative numbers are enclosed in ()
       // space = display a minus if negative, space if positive

       System.out.printf("%f\n", price1);
       System.out.printf("%f\n", price2);
       System.out.printf("%f\n", price3);

       // [width]

       // 0 = zero padding
       // number = right justified padding
       // negative number = left justified padding

       int id1 = 1;
       int id2 = 23;
       int id3 = 456;
       int id4 = 7890;

       System.out.printf("id: %04d\n", id1);
       System.out.printf("id: %04d\n", id2);
       System.out.printf("id: %04d\n", id3);
       System.out.printf("id: %04d\n", id4); */
