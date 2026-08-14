import java.util.Scanner;
public class StudentReportCard {
    static int calcTotal(int[] marks){
        int total=0;
        for(int m:marks) total+=m;
        return total;
    }
    static double calcAvg(int total){
        return total/5.0;
    }
    static String calcGrade(double avg){
        if(avg>=90) return "A";
        else if(avg>=80 ) return "B";
        else if(avg>= 70) return "C";
        else if(avg>=60 ) return "D";
        else if(avg>= 50) return "E";
        else return "F";
    }
    static String passOrFail(double avg){
        return avg>=50 ? "PASS":"FAIL";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name=sc.nextLine();
        int[] marks=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter marks of sub "+(i+1)+" :");
            marks[i]=sc.nextInt();
        }
        int total=calcTotal(marks);
        double avg=calcAvg(total);
        String grade=calcGrade(avg);
        String result=passOrFail(avg);

        System.out.println("REPORT CARD:");
        System.out.println("Name: "+name);
        System.out.println("Total: "+total+" /500");
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+grade);
        System.out.println("Result: "+result);

        sc.close();
    }
    
}
