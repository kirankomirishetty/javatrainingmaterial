
public class SayHello {

	public void sayHello(String name) {
		
		System.out.println("Saying Hello inside SayHello class "+name);
	}
	public void sayGoodBye(String name) {
		System.out.println("Saying goodbye inside SayHello Class "+name);
	}
	public void validateUserCredentials(String userName, String password ) {
		// some code to validate
		System.out.println("User is validated successfully "+userName);
	}
}
