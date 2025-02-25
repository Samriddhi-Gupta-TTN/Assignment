import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

class User{
    String firstName;
    String lastName;
    int age;
    String phoneNumber;

    public User(String firstName, String lastName, int age, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

public class Question_2 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter 1: first name 2: last name 3: age 4: phone number");
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            String phoneNumber = sc.nextLine();

            User user = new User(firstName, lastName, age, phoneNumber);
            File file = new File("user.txt");
            FileWriter fw = new FileWriter(file,true);
            fw.append(user.toString()).append("\n");
            fw.close();

            System.out.print("Do you want to continue creating users? (type QUIT to exit)");
            String response = sc.nextLine();
            if(response.equalsIgnoreCase("QUIT")){
                break;
            }
        }
    }
}
