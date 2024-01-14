
class myfirstclass {
	int x = 10;
	int y = 20;

	// public myfirstclass() {
	// x = 30;
	// y = 50;
	// }

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

}

class class0 {

	public static void main(String[] args) {

		myfirstclass f = new myfirstclass();
		System.out.println(f.getX());

	}

}
