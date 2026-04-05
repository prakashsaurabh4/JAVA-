import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class DateDemo197 {
    public static void main(String[] args){
        Date d=new Date();
        d.setHours(21);
        System.out.println(d);

        LocalDate dt=LocalDate.now(); // Also use plus and minus in time
        System.out.println(dt);
    }
} 