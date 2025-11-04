import java.util.Scanner;
class MinValueArray 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++)
		{
			System.out.println("Enter the elements:");
            arr[i] = sc.nextInt();
        }      
        int min = arr[0];
        for (int i = 1; i < n; i++) 
		{
            if (arr[i] < min)
			{
                min = arr[i];
            }
        }
        System.out.println("Minimum value in the array is: " + min);       
    }
}