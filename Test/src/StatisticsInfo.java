
import java.util.Scanner;
public class StatisticsInfo
{
	
static void showStatistics()
	 {
	     int n;
		 float mean,median,std;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter number of data points:");
		 n=sc.nextInt();
		 if (n < 3)
		 	{
			 	System.out.println("The number of data points should be greater than 2.");

		 	}
		 else
		 {

	 //declare an array of n size to store integral data points
			 	int[] dataset = new int[n];
	 //allow user inputs
			 		int i = 0;
			 		for (i = 0; i < n; i++)
			 			{
			 				System.out.print("["+i+"]:");
			 				dataset[i] = sc.nextInt();
			 			}

	 //sort the data set
			 		bubblesort(dataset, n);

	 //calculate the mean
			 		int sum = 0;
			 		int j = 0;
			 		while (j < n)
			 		{
			 			sum = sum + dataset[j];
			 			j++;
			 		}

			 		mean = (float)sum / n;

	 //calculate median
	 //If n is odd, median=dataset[n/2]
	 //If n is even, median=(dataset[n/2]+dataset[1+n/2])/2
	 //The index of array starts from 0, so you need to subtract 1 from the indices used in calculating the median
			 		if (n % 2 != 0) median = dataset[n / 2];
			 		else median = (dataset[(n / 2) - 1] + dataset[n / 2]) / (float)2;

	 //calculate the mode
			 		int[][] mode = new int[n][2];
	 //initialize 2D array storing numbers of occurences, and values
			 		for (i = 0; i < 2; i++)
			 			for (j = 0; j < n; j++) mode[j][i] = 0;
			 				mode[0][0] = 1;

			 				for (i = 0; i < n; i++)
			 					for (j = 0; j < n - 1; j++)
			 						if (dataset[i] == dataset[j + 1]) { ++mode[i][0]; mode[i][1] = dataset[i]; }

			 				int max;
			 				int k = 0;
			 				max = mode[0][0];
			 				for (j = 0; j < n; j++)
			 					if (max < mode[j][0]) { max = mode[j][0]; k = j; }


	 //calculate standard deviation,std
			 				float temp = 0.0f;

			 				for (j = 0; j < n; j++)
			 					{
			 						temp = temp + (float)Math.pow(dataset[j] - mean, 2);
			 					}

			 				std = (float)Math.sqrt(temp / (n - 1));

	 //Show results

	 System.out.println("Statistical Information:");
	 System.out.println("===============================");
	 System.out.println("Arithmetic mean:"+mean);
	 System.out.println("Median:"+median);
	 if (mode[k][1] != 0)
	 System.out.println("Mode:"+ mode[k][1]);
	 else System.out.println("Mode: no mode");
	 System.out.println("Standard deviation:"+std);


  }

 }
private static void bubblesort(int[] dataset, int n) {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	StatisticsInfo info = new StatisticsInfo();
	info.showStatistics();
	 
	 }
		 
 }

	 



