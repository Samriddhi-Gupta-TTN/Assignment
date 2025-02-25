
class Person{
    static String firstName = "Samriddhi";
    static String lastName;
    static int age = 21;

    public Person(String lastName){
        Person.lastName = lastName;
    }

    static{
        System.out.println("First Name is " + firstName);
    }

    public static void lastName(){
        System.out.println("Last Name is" + lastName);
    }
}

public class Question1{
    public static void main(String[] args){
        Person pep = new Person("Gupta");
        Person.lastName();

        System.out.println(Person.age);
    }
}
