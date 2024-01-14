package Module7;

class Mystatic {

	public static void callstaticfn()
	{
		System.out.println("static function called")
	}
}

public class static_method3 {
	public static void main(String[] args) {

		Mystatic my = new Mystatic();
		Mystatic.callstaticfn();
		// my.callstaticfn(); // Error
	}

}
