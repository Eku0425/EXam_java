//WAP TO SORT ARRAY IN ASCENDING(LOW TO HIGH) ORDER IN JAVA.

import java.util.Arrays;

 public class ShortArrayAscending
{
    public static void main(String[]args)
    {
        int[] arr =  new int[]{2, 4, 25, 7, 9, 8,};
        Arrays.sort(arr);

        System.out.println("Ascending  ORDER : ");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }

    }
}



//public class PrimeSum {
//
//    // Function to check if a number is prime
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    // Function to calculate the sum of prime numbers up to N
//    public static int sumOfPrimes(int n) {
//        int sum = 0;
//        for (int i = 2; i <= n; i++) {
//            if (isPrime(i)) {
//                sum += i;
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the value of N: ");
//        int n = scanner.nextInt();
//
//        int sum = sumOfPrimes(n);
//        System.out.println("Sum of prime numbers from 1 to " + n + " is: " + sum);
//    }
//}
//
