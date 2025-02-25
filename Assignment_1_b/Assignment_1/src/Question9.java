class NoStackTraceException extends Exception{
    public NoStackTraceException(String message){
        super(message);
    }

    @Override
    public Throwable fillInStackTrace(){
        return this;
    }}
    public class Question9 {

    public static void testMethod() throws NoStackTraceException{
        throw new NoStackTraceException("Custom exception -> no stack trace");
    }
    public static void main(String[] args){
        try{
            testMethod();
        }
        catch (NoStackTraceException e){
            System.out.println(e.getMessage());
            System.out.println("Stack trace "+ e.getStackTrace().length);
        }
    }
}
