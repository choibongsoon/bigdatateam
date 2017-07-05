package kdata.exceptions;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("try Ω√¿€");
			System.out.println(2/0);
			
			String s = null;
			System.out.println(s.charAt(1));
			
			System.out.println("try ≥°");
		} /*catch(ArithmeticException e){
			System.out.println("catch - arithmetic");
		} catch(NullPointerException e){
			System.out.println("catch - nullpointer");
		}*/catch(RuntimeException e){
			System.out.println("catch");
			e.printStackTrace();
		}finally{
			System.out.println("finally");
		}
	}

}
