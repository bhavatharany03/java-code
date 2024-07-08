package practicecode;

import java.util.ArrayList;
import java.util.Scanner;

public class lemonadechange {
    public static boolean data(int[] bills){
        ArrayList<Integer> wallet = new ArrayList<>();
        int count5=0;
        int count10 = 0;
        for(int i:bills){
            if(i==5){
                count5++;
                wallet.add(5);
            }
            if(i==10){
                count5--;
                count10++;
                if(wallet.contains(5)){
                    wallet.remove((Integer)5);
                    wallet.add(10);
                }
                else
                    return false;
            }
            if(i==20){
                if(count5>0 && count10>0){
                    count5--;
                    count10--;
                    wallet.remove((Integer)5);
                    wallet.remove((Integer)10);
                    wallet.add(20);
                }
                if(count5>=3){
                    count5-=3;
                    wallet.remove((Integer)5);
                    wallet.remove((Integer)5);
                    wallet.remove((Integer)5);
                    wallet.add(20);

                }
                else
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bills = new int[n];
        for (int i = 0; i < n; i++) {
            bills[i] = sc.nextInt();
        }
        System.out.print(data(bills));
    }
}

