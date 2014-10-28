
/**
 * Simple class which echos any arguments passed in back to the console.
 */
public class EchoArguments {


	public static void main(String[] args) {
		System.out.println("Echoing Arguments:");
		for (String arg : args) {
			System.out.println(arg);
		}
	}


}
