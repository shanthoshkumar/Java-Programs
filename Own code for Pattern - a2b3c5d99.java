import java.util.*;
public class Test{
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            String str=s.nextLine();
            for(int i=0;i<str.length();i++)
            {
                if( ((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57) )
                {
                    if( (i!=str.length()-1) && ((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57) && ((int)str.charAt(i+1)>=48 && (int)str.charAt(i+1)<=57) )
                    {
                        int sum=(((int)str.charAt(i)-48)*10)+((int)str.charAt(i+1)-48);
                        loop(str.charAt(i-1),sum);
                        ++i;
                    }
                    else
                    {
                        int num=((int)str.charAt(i)-48);
                        loop(str.charAt(i-1),num);
                    }
                }
            }
       }
      private static void loop(char c,int n){
          if(n==0){
              System.out.println();
          }
          else
          {
          System.out.print(" "+c+""+n);
          --n;
          loop(c,n);
          }
      }
}
