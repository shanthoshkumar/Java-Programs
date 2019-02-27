import java.util.*;
public class Test{
    public static void main(String[] args){
        int arr[]={1,2,3,4,1,3,4};
        ArrayList<Integer> list=new ArrayList<Integer>(arr.length);
        int clone[]=new int[arr.length];
        boolean status=false;
        int looptracker=0,duplicatecount=0;
        String DuplicateElements="( ";
        for(int x:arr){
            looptracker++;
            if(!list.contains(x))
                list.add(x);
            else
            {
                status=true;
                duplicatecount++;
                if(duplicatecount==1)
                    DuplicateElements+=x;
                else
                    DuplicateElements+=","+x+"";
            }
            if(looptracker==arr.length)
            {
                if(!status)
                    System.out.println("No Duplicates");
                else
                {
                    System.out.println("Total No of Duplicates "+duplicatecount);
                    System.out.println("\nDuplicate Elements => "+DuplicateElements+" )");
                }
            }
        }
        
    }
}