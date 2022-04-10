package cgpa_calculator;
import java.util.Scanner;
public class Cgpa_calculator 
{ 
    private int grade_points;
    private int credit_hour;
    private String course_name;
    private int total_credit;
    private int total_grade_points;
    
   /*public void setcourse()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("COURSE NAME:");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            Scanner s1 = new Scanner(System.in);
            System.out.println("ENTER YOUR COURSE NAME:");
            course_name = s1.next();
        }
    }
    public void setgradepoints()
    {
        total_credit =0;
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("GRADE POINTS:");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            Scanner s1 = new Scanner(System.in);
            System.out.println("ENTER YOUR GRADE POINTS OF ALL SUBJECT");
            grade_points = s1.nextInt();
            total_credit = total_credit + grade_points;
        }
        System.out.println(total_credit);
    }*/
    public void setformula()
    {
        int calculation;
        int n;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many courses are you enroll on this semester:");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            Scanner s1 = new Scanner(System.in);
            System.out.println("enter your grades:");
            grade_points = s1.nextInt();
            System.out.println("enter your credit hour:");
            credit_hour = s1.nextInt();
            calculation =grade_points*credit_hour;
            System.out.println("grades points * credit hour:" + calculation);
            sum = sum + calculation;
        }
        System.out.println(sum);
    }
}
