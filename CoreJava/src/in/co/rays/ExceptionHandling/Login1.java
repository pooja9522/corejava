package in.co.rays.ExceptionHandling;

public class Login1 extends Exception {
	String name=null;
	String lastname=null;
	String gmailid=null;
	
	public Login1(String name) {
		super("user invalid");
	}
	public Login1(String name,String lastname) {
		super("user invalid");
		}
	public Login1(String name,String lastname,String gmailid) {
		super("user invalid");
	}
	
	
	

}
