import java.util.*;
public class task1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3,m4,m5,m6;
        float sum;
        float avg;
        System.out.println("Enter the mark of 6 subject(out of 100)");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        m6=sc.nextInt();
            sum=m1+m2+m3+m4+m5+m6;
            System.out.println("Total mark is: "+sum);
            avg=sum/6;
            System.out.println("Average mark is:"+avg);
            char grade;

                    switch((int)sum/6)
                    {
                        case 10:
                          grade ='A';
                        break;

                        case 9:
                            grade ='B';
                        break;

                        case 8:
                            grade ='C';
                        break;

                        case 7:
                            grade ='D';
                        break;

                        default:
                            grade ='F';
                        break;

                    }
                    System.out.println("the grade  is"+ grade);
            
                System.out.println("RESULT:");
                System.out.println("The total mark is :" +sum);
                System.out.println("The average is:" +avg);
                System.out.println("The grade is " +grade);

     }
} 