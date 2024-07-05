package search;

public class firstlastpositionofelement {
    public static int firstelement(int[] arr,int i,int target){
        if(i>=arr.length)
            return -1;
        else if (arr[i]==target){
            return i;
        }
        return firstelement(arr,i+1,target);
    }
    public static int lastelement(int[] arr,int i,int target){
        if(i>=arr.length)
            return -1;
        else if(arr[i]==target){
            return i;
        }
        return lastelement(arr,i-1,target);
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int ind = firstelement(arr,0,target);
        int ind1 = lastelement(arr,arr.length-1,target);
        int[] arr2 = new int[2];
        for(int i=0;i<1;i++){
            System.out.print(ind+" ");
            System.out.print(ind1);
        }

//        System.out.println(ind);
//        System.out.println(ind1);
//        int[] arr2 = new int[2];
//        arr2[0] = ind;
//        arr2[1] = ind1;
//        System.out.println(arr2);


        }

    }
