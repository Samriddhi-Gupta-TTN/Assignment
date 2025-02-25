class Data{
    int id;
    int getId(){
        return id;
    }
    void setId(int id){
        this.id =id;
    }
}
public class Question8 {
    public static void main(String [] args){
        try{
                Class cls = Class.forName("com.example.MissingClass");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
