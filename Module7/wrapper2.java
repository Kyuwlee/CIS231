package Module7;

public class wrapper2 {
	static void changeMe(Integer val) {
		System.out.println("Received value " + val);
		val += 100;
		System.out.println("Changed value " + val);

	}

	public static void main(String[] args) {
		Integer arg;
		arg = 10;
		System.out.println("Before call " + arg);
		changeMe(arg);
		System.out.println("After call " + arg);
	}

}
