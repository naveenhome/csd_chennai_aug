package csd.chennai;
import junit.framework.TestCase;

public class TestLargest extends TestCase{
	public void testFirstCase() throws Throwable
	{
		int arr[]={5,6,9,3,2};
		Largest large=new Largest();
		assertEquals(9, large.Find(arr));
	}
	public void testSecondCase() throws Throwable
	{
		int arr[]={5,6,3,2};
		Largest large=new Largest();
		assertEquals(6, large.Find(arr));
	}
	public void testThirdCase() throws Throwable
	{
		int arr[]={-5,-6,-3,-2};
		Largest large=new Largest();
		assertEquals(-2, large.Find(arr));
	}
	public void testForthCase() throws Throwable
	{
		try{
			
		
		int arr[]={};
		Largest large=new Largest();
		int rsult=large.Find(arr);
		fail();
		}catch(Exception ex)
		{
			assertTrue(true);
			
		}
	}
}