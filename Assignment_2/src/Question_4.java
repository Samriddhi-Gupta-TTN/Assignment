interface Bootcamp{
    String info();
}
class JVM implements Bootcamp{
    public String info(){
        return "JVM:Hello";
    }
}
class JS implements Bootcamp{
    public String info(){
        return "JS:Hello";
    }
}
class Devops implements Bootcamp{
    public String info(){
        return "Devops:Hello";
    }
}

class BootCampFactory{
    public static Bootcamp getStudents(String competency){
        if (competency.trim().equalsIgnoreCase("JVM"))
            return new JVM();
        else if (competency.trim().equalsIgnoreCase("DevOps"))
            return new Devops();
        else
            return new JS();
    }}


public class Question_4 {
    public static void main(String[] args){
        Bootcamp competency1 = BootCampFactory.getStudents("jvm");
        System.out.println(competency1.info());

        Bootcamp competency2 = BootCampFactory.getStudents("DEVOPS");
        System.out.println(competency2.info());

        Bootcamp competency3 = BootCampFactory.getStudents("JS");
        System.out.println(competency3.info());
    }
}
