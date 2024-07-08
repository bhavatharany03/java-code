package greedyapproach;

public class fractionalknapsack {
    public static void main(String[] args) {
        int[] value = {60,100,120};
        int[] wt = {10,20,30};
        int totwght = 50;
        int totprofit = 0;
        System.out.println(data(value,wt,totwght,totprofit));
    }
    public static int data(int[] value,int[] wt,int totwght,int totprofit){
        int[] ratio = new int[3];
//        int[] profit = new int[3];
        int profitamt = 0;
        for(int i=0;i<3;i++){
            ratio[i]=value[i]/wt[i];
        }
        for(int i=0;i<3;i++){
            profitamt=ratio[i]*wt[i];
            totwght-=wt[i];
            totprofit=profitamt+profitamt;
        }
        return totprofit;
    }
}
