package c06;

class Art {
	Art(){
		System.out.println("Art constructor");
	}
}

class Drawing extends Art {
	Drawing(){
		System.out.println("Drawing constructor");
	}
}

public class Cartoon extends Drawing {
	Cartoon() {
		System.out.println("Cartoon constructor");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartoon x = new Cartoon();

	}

}
