package exceptionHandling;

public class CustomerAlreadyExist extends Exception{
	public CustomerAlreadyExist(String errMsg) {
	super(errMsg);
	}
}
