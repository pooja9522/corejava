package in.co.rays.basics;

public class Random1to100 {
	public static void main(String[]args) {
	int max=100;
	int min=5;
	int range=max-min;
	for (int i = 1; i<=5; i++) {
	int  rd= (int)(Math.random()*range);
	System.out.println(rd);
		
	}
	

}
}