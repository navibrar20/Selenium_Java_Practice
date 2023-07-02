package Java;

public class Param {
	
	String name = "Navi";
	String state = "Kansas";

public void Test1(String city,String town) {
	
	System.out.println("it contains two parameters");
}

public void Test1(String city,String town,String home) {
	
	System.out.println("it contains three parameters");
	
}

public void Test2() {

	System.out.println("this is method of parent class");
	
}

public static void main(String args[]) {
	Param p = new Param();
	System.out.println(p.name);
	
	
	p.Test1("kot", "punjab","mainst");
	
}

public static class Param1 extends Param{



public void Test1(String city) {
	
	System.out.println("its method of child class and has one parameter");
}
	
public void Test2() {
	
	System.out.println("this is method of child class");
	super.Test2();
}
public static void main(String args[]) {

	
	Param1 q = new Param1();
	q.Test2();
	
	
	
}
}
}