import java.util.Scanner;
public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        StringBuilder str = new StringBuilder();
        while(true){
            String inp = sc.nextLine();
            if(inp.equals("XDONE"))
                break;
            str.append(inp).append(" ");
        }
        System.out.println(str);
    }
}
