import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int total=s.nextInt();
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                for(int k=1;k<=6;k++){
                    int count=i+j+k;
                    if(count==total)
                        {
                            // System.out.println("dice 1="+" "+i+"  "+" dice 2="+" "+j+"  "+" dice 3="+" "+k);
                            System.out.println("("+i+","+j+","+k+")");
                            System.out.println();
                        }
                }
            }
        }
        
    }
}