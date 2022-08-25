/*create Java class called student with the following details as variables with in it
 * USN
 * name
 * branch 
 * phone number
 */
import java.util.Scanner;
public class student
{
    String USN;
    String Name;
    String Branch;
    int phone_no ;

    void insert_record(String reg,String name,String branch,int phone)
    {
        USN=reg;
        Name =name;
        Branch=branch;
        phone_no=phone;
    }

    void display()
    {
        System.out.println(USN+" "+Name+" "+Branch+" "+phone_no);
    }

    public static void main(String args[])
    {
        student s[]=new student[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of student");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s[i]=new student();
        }
    
        for(int j=0;j<n;j++)
        {
            System.out.println("Enter USN ,Name,branch,phone number");
            String USn=sc.next();
            String Nam=sc.next();
            String Branc=sc.next();
            int pho=sc.nextInt();
           
            s[j].insert_record(USn,Nam,Branc,pho);

            
        }
        for(int m=0;m<n;m++)
        {
            s[m].display();
        }
        sc.close();
    }

}
