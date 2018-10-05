import java.util.*;
class Swift
{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String result=Character.toString(str.charAt(str.length()-1))+Character.toString(str.charAt(0));
        for(int i=1;i<str.length()-1;i++)
        {
            if(i<str.length()-1 && str.charAt(i)!=' ' && str.charAt(i+1)!=' ')
            {
               result+=str.charAt(i);
            }
            else if(str.charAt(i)==' ')
            {
                result+=' ';
                result+=str.charAt(i-1);
            }
        }
                 System.out.println(result);
   }
}