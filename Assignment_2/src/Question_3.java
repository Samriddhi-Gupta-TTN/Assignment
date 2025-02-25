import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) throws FileNotFoundException{
        String file = args[0];
        String target = args[1];
        int count = 0;

        Scanner sc = new Scanner(new FileReader(file));
        while(sc.hasNext()){
            String word = sc.next();
            if(word.equalsIgnoreCase(target)){
                count++;
            }
        }
        System.out.println("number of occurrences of "+ target +" is " +count);
    }
}
