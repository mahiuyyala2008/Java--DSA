public class ArrayBasics {
    public static void main(String[] args) {

        // Create an array
        int arr[] = {10, 20, 30, 40, 50};

        // Get (access) element
        System.out.println("First element: " + arr[0]);
        System.out.println("Third element: " + arr[2]);

        // Set (update) element
        arr[1] = 25;

        System.out.println("After updating second element:");

        // Traverse (print all elements)
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
