package csd.chennai;
public class Largest
{

	public int Find(int[] arr) throws Throwable {
		// TODO Auto-generated method stub
		if(arr.length==0)
			throw new Exception();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
}