

interface JavaCalculation{
	 int operation(int x , int y);
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 6;
		JavaCalculation jcm = (int x , int y)->x*y ;
		JavaCalculation jcd = (int x , int y)->x%y;
		int mul = jcm.operation(a,b);
		int div = jcd.operation(a,b);
		System.out.println(mul + "  " + div);

	}

}
