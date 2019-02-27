import java.util.*;
class aa{
   void task(int a,char s){
       for(int i=0;i<a;i++){
           System.out.print(s);
       }
                  System.out.println();

   }
}
public class Test{
   public static void main(String args[]){
       aa obj=new aa();
       Scanner sc=new Scanner(System.in);
       String input=sc.next();

       for(int i=0;i<input.length()-1;i++){

           if(i<input.length()-2&&(int)input.charAt(i+1)-48<10 && (int)input.charAt(i+2)-48<10){
               int oo=(int)input.charAt(i+1)-48;
               int o=(oo*10)+(int)input.charAt(i+2)-48;
               obj.task(o,input.charAt(i));
               i=i+2;
           }else if((int)input.charAt(i+1)-48<10){
               int o=(int)input.charAt(i+1)-48;
               obj.task(o, input.charAt(i));
               i=i+1;
           }
       }

   }

}