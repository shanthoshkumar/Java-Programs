import java.util.*;
public class Test{
   public static void main (String[] args) {
       Scanner s=new Scanner(System.in);
       int k=s.nextInt();
       for(int i=1;i<=k*2;i++)
       {
           if(i<=k)
           {
                for(int j=1;j<=i;j++)
               {
                   System.out.print(j+" ");
               }
             System.out.println(" ");
           }
       }

         for(int i=k-1;i>=1;i--)
         {
             for(int j=1;j<=i;j++)
             {
               System.out.print(j+" ");
             }
             System.out.println(" ");
         }

   }
}
