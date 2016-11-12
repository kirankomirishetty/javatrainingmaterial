
public class SayHello {

	public String userAction;
	
	public void sayHello(String name) {
		if("Logout".equalsIgnoreCase(userAction)) {
			System.out.println("Logout successfull");
		} else {
			System.out.println("Saying Hello inside SayHello class "+name);
		}
	}
	public void sayGoodBye(String name) {
		System.out.println("Saying goodbye inside SayHello Class "+name);
	}
	public void validateUserCredentials(String userName, String password ) {
		// some code to validate
		System.out.println("User is validated successfully "+userName);
	}
	public void sayHello() {
		System.out.println("Hello Guest");
	}
}
