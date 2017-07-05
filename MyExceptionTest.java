package kdata.exceptions;

public class MyExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new MyException("error");
		}catch(MyException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
