package basics;

public class string {
    public static void main(String[] args) {
        String s = "hello world";
        String[] a = s.split(" ");
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
