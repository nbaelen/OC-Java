import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {

    public static void main(String[] args) {
        //Toujours notre 25 Décembre 2018 a 13H37
        LocalDate ldt = LocalDate.now();

        //Le prochain samedi
        LocalDate prochainSamedi = ldt.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(prochainSamedi);

        //Le troisième mardi du mois suivant
        //On ajoute un mois à notre date
        ldt = ldt.plus(1, ChronoUnit.MONTHS);
        //On en créer une nouvelle au premier jour du mois
        LocalDate ldt2 = LocalDate.of(ldt.getYear(), ldt.getMonth(), 1);
        //On avance de trois mardi
        LocalDate troisiemeMardi = ldt2	.with(TemporalAdjusters.next(DayOfWeek.TUESDAY))
                .with(TemporalAdjusters.next(DayOfWeek.TUESDAY))
                .with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(troisiemeMardi);

    }

}