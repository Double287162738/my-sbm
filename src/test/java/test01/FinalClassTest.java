package test01;

public  class FinalClassTest {
	public static void main(String[] args) {
	final String aString = "a";
	final String bString = "b";
	String cString = aString +bString ;
	System.out.println((aString+bString)==cString);
	}
}
