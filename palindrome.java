import java.util.*;
public class MyClass {
    public static void main(String args[]) {
         char [] arr;
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        arr = new char[name.length()];
        int a=0;
        int count=0;
        for(int i=name.length()-1;i>=0;i--)
        {
            arr[a]=name.charAt(i);
            a++;
            
        }
                  

        for(int k=0;k<name.length();k++)
        {
                // System.out.println(k);
            
              if(arr[k]==name.charAt(k))
              {
                  count++;
              }
        }
                        // System.out.println(name.length()+"   "+count);

              if(count==name.length())
              {
                System.out.println("Palindrome");
              }
              else
              {
                  System.out.println("The String you given"+" "+name+" "+"was Not a Palidrome");
              }
    }
}
