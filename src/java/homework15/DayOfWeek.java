package homework15;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int weekDayNumber;

    public int getWeekDayNumber() {
        return weekDayNumber;
    }

    DayOfWeek(int weekDayNumber) {
        this.weekDayNumber = weekDayNumber;
    }


    public static homework15.DayOfWeek getDayByNumber(int weekDayNumber) {
        for (homework15.DayOfWeek d : homework15.DayOfWeek.values()) {
            if (d.weekDayNumber == weekDayNumber) {
                return d;
            }
        }
        return null;
    }
}
