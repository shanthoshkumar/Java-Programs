import java.util.*;
public class Test{
public static void main(String [] args){
//    Scanner s=new Scanner(System.in);
int arr[]={0,3,5,7,10};//{12,25,1,5,8};
int min=0,max=0;
    for(int i=0;i<arr.length;i++)
    {   int mincount=0,maxcount=0;
        for(int j=0;j<arr.length;j++)
            { 
                if(arr[i]>arr[j])
                {
                    maxcount+=1;
                }
                else if(arr[i]<arr[j])
                {
                    mincount+=1;
                }
                if(maxcount==arr.length-1)   
                    max=arr[i];
                else if(mincount==arr.length-1)   
                    min=arr[i];
            }
         
    } 

    for(int i=min+1;i<max;i++)     
    {
        boolean status=false;
        for(int k=0;k<arr.length-1;k++){
            if(i==arr[k])
            {
             status=true;
            }
        }
        if(!status)
        {
            System.out.println("Missing Element "+i);
        }
    }
}
}