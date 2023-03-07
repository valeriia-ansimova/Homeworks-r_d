package homework15;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int weekDayNumber;

    public int getWeekDayNumber() {
        return weekDayNumber;
    }

    DayOfWeek(int weekDayNumber) {
        this.weekDayNumber = weekDayNumber;
    }


    public static DayOfWeek getDayByNumber(int weekDayNumber) {
        for (DayOfWeek d : DayOfWeek.values()) {
            if (d.weekDayNumber == weekDayNumber) {
                return d;
            }
        }
        return null;
    }
}
