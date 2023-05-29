package student.banasthali.abhilasha;
public class array4 {
    

{


static void permute(int A[], int P[], int n)
{
	
	for (int i = 0; i < n; i++)
	{
		int next = i;

		while (P[next] >= 0)
		{

			
			swap(A, i, P[next]);
			int temp = P[next];

		
			P[next] -= n;
			next = temp;
		}
	}
}

static int[] swap(int []arr, int i, int j)
{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	return arr;
}


public static void main(String[] args)
{
	int A[] = { 5, 6, 7, 8 };
	int P[] = { 3, 2, 1, 0 };
	int n = A.length;

	permute(A, P, n);

	for (int i = 0; i < n; i++)
		System.out.print(A[i]+ " ");
        array4 s=new array4();

}
}


    
}
