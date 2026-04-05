import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

public class DateDemo199 {
    public static void main(String[] args){

        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(df.format(ldt));
    }
}