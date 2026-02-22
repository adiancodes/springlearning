import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] redArr = new int[n];
            int[] blueArr = new int[n];

            for(int i = 0; i < n; i++) {
                redArr[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++) {
                blueArr[i] = sc.nextInt();
            }

            int currentMax = 0;
            int currentMin = 0;

            for(int i = 0; i < n; i++){
                int max1 = currentMax - redArr[i];
                int min1 = currentMin - redArr[i];

                int max2 = blueArr[i] - currentMin;
                int min2 = blueArr[i] - currentMax;

                currentMax = Math.max(Math.max(max1, min1), Math.max(max2, min2));
                currentMin = Math.min(Math.min(max1, min1), Math.min(max2, min2));
            }
            System.out.println(currentMax);
        }
    }
}