import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            str+=str.charAt(i);
        }
        System.out.print(str.substring(str.length()/2));
    }
}