
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Eclipse Training");
		SayHello sayHello = new SayHello();
		// <ClassNam> <variableName> = new <Constructor>;
		sayHello.sayHello("Kiransdfds");
		sayHello.sayGoodBye("Kirandsfds");
		
		SayHello callMethod = new SayHello();
		
		callMethod.sayHello(args[0]+" "+args[1]);
		callMethod.validateUserCredentials(args[0], args[1]);
		
		callMethod.userAction="Login";
		callMethod.sayHello("Kiran");
		
		callMethod.userAction="Logout";
		callMethod.sayHello("Kiran");
	}
// java HelloWorld "Java Training"
}


