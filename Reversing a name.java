import java.util.*;
public class Test{
public static void main(String [] args){
   Scanner s=new Scanner(System.in);
   String name=s.nextLine();
   String reversedname="";
   System.out.println(name.length());
   for(int i=name.length()-1;i>=0;i--){
    //    System.out.println(name.charAt(i));          

       reversedname+=name.charAt(i);
   }
   System.out.println("original name"+' '+name);
   System.out.println(" ");
   System.out.println("Reversed name"+' '+reversedname);
}
}