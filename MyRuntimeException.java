package kdata.exceptions;

public class MyRuntimeException extends RuntimeException{
	//RuntimeException에서 매개변수 있는거 쓰려고 하니까 어떻게 해야될까!!!
	public MyRuntimeException (){
		super("MyRuntimeException 생성자#1");
	}
	//실행할때마다 바뀌도록 할것. 
	public MyRuntimeException (String msg){
		super(msg);
	}
}
