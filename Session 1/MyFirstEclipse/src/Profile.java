
public class Profile {

	public static void main(String[] args) {
		SayHello sh = new SayHello();
		sh.validateUserCredentials(args[0], args[1]);
	}
}
