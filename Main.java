public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 15, 20, 7, 8, 3};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 != 0)
            {
                sum = sum + numbers[i];
            }
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}
