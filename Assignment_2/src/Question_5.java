import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;

class Logger{
    static Logger instance;
    private Logger(){

    }
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void getLog(String message){
        System.out.println(message);
    }
}
public class Question_5 implements Comparator {
    public static void main(String [] args){
        Logger log1 = Logger.getInstance();
        log1.getLog("Log message from Apache Log4J");

        Logger log2 = Logger.getInstance();
        log2.getLog("Log message from slf4j");

        System.out.println(log1 == log2);
    }
}
