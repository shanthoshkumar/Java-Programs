public class MyClass {
   public static void main(String args[]) {
       for(int a=0;a<8;a++)
       {
           System.out.print("*"+" ");
       }
       for(int a=0;a<8;a++)
       {
           System.out.println("*");
       }
       for(int a=0;a<=8;a++)
       {
           System.out.print("*"+" ");
       }
       for(int a=0;a<=8;a++){
           for(int b=0;b<=8;b++){
               if(b==8){
                   System.out.print("*");
               }else{
                   System.out.print(" " +" ");
               }
           }
           System.out.println("");

       }
       for(int a=0;a<=8;a++){
           System.out.print("*" +" ");
       }
   }
}