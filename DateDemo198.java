import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class DateDemo198 {
    public static void main(String[] args){
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt);

        OffsetDateTime odt=OffsetDateTime.now();
        System.out.println(odt);

        Period p=Period.of(2, 2,10);
        System.out.println(p.addTo(LocalDate.now()));

        Instant i=Instant.now();
        System.out.println(i);
    }
}
