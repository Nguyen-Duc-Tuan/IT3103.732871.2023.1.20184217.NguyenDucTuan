package lab01;
public class HelloWorld{
	public void sayHi(String a){
		System.out.println("Hello World " + a);
	}
	public static void main(String[] args) {
		HelloWorld Dat = new HelloWorld();
		Dat.sayHi("Dat");
	}
}