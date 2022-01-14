package PracticeProjectPhase1;

public class LongestIncreasingSubseaquence {
	static int maximumof_ref; 

	static int _lis(int array[], int n)
	{

		if (n == 1)
			return 1;

		int result, maximum_ending_here = 1;

		
		for (int i = 1; i < n; i++) {
			result = _lis(array, i);
			if (array[i - 1] < array[n - 1]
				&& result + 1 > maximum_ending_here)
				maximum_ending_here = result + 1;
		}

		
		if (maximumof_ref < maximum_ending_here)
			maximumof_ref = maximum_ending_here;

		
		return maximum_ending_here;
	}

	
	static int lis(int arr[], int n)
	{
		
		maximumof_ref = 1;

		
		_lis(arr, n);

		
		return maximumof_ref;
	}

	
	public static void main(String args[])
	{
		int array[] = { 1,2,3,4,5,6,7,8,9,0,6,5,4,};
		int n = array.length;
		System.out.println("Length of lis is " + lis(array,
				n)
						+ "\n");
	}
}


