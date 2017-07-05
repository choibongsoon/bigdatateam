package kdata.exceptions;

public class MyRuntimeExceptionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRuntimeException r1 = new MyRuntimeException();
		MyRuntimeException r2 = new MyRuntimeException("두번째 예외");
		MyRuntimeException r3 = new MyRuntimeException("세번째 예외");
		
//		throw r1;
//		throw r2;
//		throw new MyRuntimeException();
		
		try{
			throw r1;
		} catch(MyRuntimeException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
