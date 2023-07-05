import java.time.DayOfWeek;

public class SwitchStatementOld {

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.SATURDAY;
        String activity;
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                activity = "Relax";
                break;
            case MONDAY:
                activity = "Try to work";
                break;
            default:
                activity = "Work";
        }
        System.out.println(activity);
    }
}
