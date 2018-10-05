import java.util.*;
class Learn
{
   public static void main (String[] args) {
    Calendar now = Calendar.getInstance();
     int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
     int middle=(now.get(Calendar.SECOND)%10)/2;
    //  int end=array.length;
    for(int i=middle;i<array.length;i++)    
    {
        if(i==array.length-1)
        {
            System.out.println(array[i]);   //Last Element
            int k=middle;
            for(int j=0;j<k;j++)
            {
                System.out.println(array[j]);  // From Initial Element
            }
        }
        else
        {
        System.out.println(array[i]);
        }
    }
   }
}  