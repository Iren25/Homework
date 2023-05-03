public class Main {
    public static void main(String[] args) {
        System.out.println(getSeasonByMonth(Month.FEBRUARY));
        printAllMonths();

    }
    public static Season getSeasonByMonth(Month month){
        return switch (month) {
            case DECEMBER, JANUARY, FEBRUARY -> Season.WINTER;
            case MARCH, APRIL, MAY -> Season.SPRING;
            case JUNE, JULY, AUGUST -> Season.SUMMER;
            default -> Season.AUTUMN;
        };
    }
    public static void printAllMonths(){
        for (Month month : Month.values()){
            System.out.println("Месяц " + month.numberOfMonth + " - " + month.ruMonth);
        }
    }
}