class Employee{
     String firstname;
     String lastname;
     int age;
     String designation;


     //defaulf
    public Employee(){

    }

    //parameter
    public Employee(String firstname,String lastname,int age,String designation){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.designation=designation;
    }

    //copy
    public Employee(Employee other){
        this.firstname=other.firstname;
        this.lastname=other.lastname;
        this.age=other.age;
        this.designation=other.designation;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }
}


public class Question5 {
}
