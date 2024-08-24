public class SumOfEven
{

        public static int sumofEven(int n)
        {

            if (n < 2) {
                return 0;
            }

            if (n % 2 == 0) {
                return n + sumofEven(n - 2);
            } else
            {

                return sumofEven(n - 1);
            }
        }

        public static void main(String[] args) {
            int n = 5;
            int sum = sumofEven(n);
            System.out.println("Sum of even num:  " + sum);
        }
    }

