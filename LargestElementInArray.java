// WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.

public class LargestElementInArray
{
    public static void main(String[] args)
    {
        int[] array = {25,4,12,50,80,100};
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }

        System.out.println("The largst num : "  + max);
    }
}








