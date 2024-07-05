package search;

public class linearsearch {
    public static int linear(int[] a,int tar){
        int i;
        for(i=0;i<a.length-1;i++){
            if(a[i]==tar){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,734,321};
        int tar = 734;
        int data = linear(a,tar);
        if(data==-1)
            System.out.println("element not found");
        else
            System.out.println("element found at index:"+data);
    }
}
