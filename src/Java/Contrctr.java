package Java;

public class Contrctr {
	
	int a = 10;
	String b = "Navi";
	boolean c;
	double f = 5.5;
	
	public void Show()
	{
		System.out.println(a + " / "+b+ " / "+c+" / "+f);
		
	}
	
	Contrctr(int a,String b){
		
	}
	
	
	public static void main(String args[]) {
		
		Contrctr d = new Contrctr(5,"aaa");
		d.Show();
	}
	

}
