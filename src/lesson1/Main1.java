package lesson1;

public class Main1
{
    public static void main(String[] args)
    {
        int counter = 10;
        int sum = 0;
        while (counter < 55)
        {
            sum += counter;
            counter++;
            System.out.println("Iteration " + (counter - 10));
        }
        System.out.println(sum);
    }
}