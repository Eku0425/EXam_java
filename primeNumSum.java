//WAP TO FIND THE SUM OF PRIME NUMBERS FROM 1 TO N.

public class primeNumSum
{
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }

        for (int i=2; i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return  false;

            }
        }
        return true;
        
    }




}
