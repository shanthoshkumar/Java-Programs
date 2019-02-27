public class Test{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,5,4,6,2};
        boolean b[]=new boolean[1000];
        for(int i=0;i<arr.length;i++){
            if(b[arr[i]]==true)
            {
                System.out.println("Duplicate Element :"+arr[i]);
                break;
            }
            if(b[arr[i]]==false){
                b[arr[i]]=true;
            }
        }
    }
}