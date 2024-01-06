package in.co.rays.ExceptionHandling;

public class TestLogin1 {
	public static void main(String[] args) {
	String name="pooja";
	String lastname="jawariya";
	String gmailid="poojasadd12@gmail.com";
	
	if(name.equals("pooja")) {
		System.out.println("user name is valid");
	}else {
		try {
			throw new Login1(name) ;
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
		if(lastname.equals("jawaiya")) {
			System.out.println("user last name  is valid");
		}else {
			try {
				throw new Login1(name,lastname);
			}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		
				if(gmailid.equals("poojasadd12@gmail.com")) {
					
			System.out.println("user id is valid");
				}else {
					try {
						throw new Login1(name,lastname,gmailid);
					}catch (Exception e) {
							System.out.println(e);
			
						}
					}
					
				
				
			}
		
}
