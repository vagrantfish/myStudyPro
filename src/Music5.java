import java.time.Clock;
import java.util.*;

interface Instument5{
	int i =5;
	void play();
	String what();
	void adjust();
}

class Wind5 implements Instument5{
	public void play(){
		System.out.println("Wind5.play()");
	}
	public String what() { return "Wind5"; }
	public void adjust() {}
}

class Percussion5 implements Instument5{
	public void play() {
		System.out.println("Percussion5.play()");
		}
		public String what() { return "Percussion5"; }
		public void adjust() {}
}

class Stringed5 implements Instument5{
	public void play() {
		System.out.println("Stringed5.play()");
		}
		public String what() { return "Stringed5"; }
		public void adjust() {}
}

class Brass5 extends Wind5 {
	public void play() {
		System.out.println("Brass5.play()");
}
	public void adjust() {
		System.out.println("Brass5.adjust()");
}
}
class Woodwind5 extends Wind5 {
	public void play() {
		System.out.println("Woodwind5.play()");
}
public String what() { return "Woodwind5"; }
}


public class Music5 {
	
	static void tune(Instument5 i) {
		// ...
		i.play();
		}
		static void tuneAll(Instument5[] e) {
		for(int i = 0; i < e.length; i++)
		tune(e[i]);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instument5[] orchestra = new Instument5[5];
		int i = 0;
		// Upcasting during addition to the array:
		orchestra[i++] = new Wind5();
		orchestra[i++] = new Percussion5();
		orchestra[i++] = new Stringed5();
		orchestra[i++] = new Brass5();
		orchestra[i++] = new Woodwind5();
		tuneAll(orchestra);
		
		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
		    int result = e1.compareTo( e2 );
		    return result;
		} );
		
		
		final Clock clock = Clock.systemUTC();
		System.out.println( clock.instant() );
		System.out.println( clock.millis() );
		
		
		GregorianCalendar now = new GregorianCalendar();
		int month = now.get(Calendar.MONTH)+1;
		System.out.println(month);
		    
		

	}

}
