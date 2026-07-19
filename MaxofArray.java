import java.util.*;

class MaxofArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array elements as input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding maximum element
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element is: " + max);

        sc.close();
    }
}
