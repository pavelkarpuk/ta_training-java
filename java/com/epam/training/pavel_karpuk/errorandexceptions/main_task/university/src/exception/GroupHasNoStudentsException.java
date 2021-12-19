package exception;

public class GroupHasNoStudentsException extends Exception{
    public GroupHasNoStudentsException(String message) {
        super(message);
    }
}
