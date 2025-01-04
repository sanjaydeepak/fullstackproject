import java.util.*;
public class nestedpatterns {
    public static void pattern(int num)
    {
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                      System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
           int t=scan.nextInt();
          
           for(int i=0;i<t;i++)
           {
            int n=scan.nextInt();
           }
           
                   pattern(n);
           scan.close();

    }
}
