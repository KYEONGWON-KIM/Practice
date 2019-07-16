//예외발생문
package goods.exception;

public class NotExistException extends Exception{
	public NotExistException(){}
	public NotExistException(String message){
		super(message);
	}
}
