public class Question7 {
    public static void main(String[]args){
        try{
            int result = 10/0;
            System.out.println(result);

            String str = null;
            int length = str.length();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        /*catch (ArithmeticException | NullPointerException e){
            e.printStackTrace();
        }*/
        finally {
            System.out.println("Finally execute");
        }
    }
}
