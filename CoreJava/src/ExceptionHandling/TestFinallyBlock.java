package ExceptionHandling;

public class TestFinallyBlock {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			
		int c=a/b;
		System.out.println("division+"    +c);
			
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("this is pooja ");
			
	
		}
		
	}

}
