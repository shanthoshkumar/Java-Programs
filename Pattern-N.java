public class MyClass {
   public static void main(String args[]) {
       for(int i=0;i<18;i++){
           for(int j=0;j<18;j++){
               if((j==0)||(j==17)||(i==j))
                   System.out.print("*");
               else
                   System.out.print(" ");
           }
           System.out.println("");
       }
   }
}