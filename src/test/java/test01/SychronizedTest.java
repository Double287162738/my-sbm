package test01;

public class SychronizedTest {

	public static void main(String[] args) {
		Sychronized sychronized = new Sychronized();
		
		new Thread(sychronized).start();
		new Thread(sychronized).start();
	}
}
