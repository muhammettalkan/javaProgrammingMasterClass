import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.TUES;
        System.out.println(day);

        for(int i = 0; i < 10; i++) {
            day = getRandomDay();

//            System.out.printf("Name is %s, Ordinal Value = %d%n",
//                    day.name(), day.ordinal());
//            if(day == DayOfWeek.FRI){
//                System.out.println("Found a Friday !!");
            switchDayOfWeek(day);
            }

        for (Topping topping: Topping.values()){
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }


    public static DayOfWeek getRandomDay(){

        int randomInteger = new Random().nextInt(7);
        var allDays  = DayOfWeek.values();

        return allDays[randomInteger];

    }

    public static void switchDayOfWeek(DayOfWeek day){

        int dayInteger = day.ordinal() + 1;
        switch (day){
            case WED -> System.out.println("Wednesday is Day " + dayInteger);
            case SAT -> System.out.println("Saturday is Day " + dayInteger);
            default -> System.out.println(day.name().charAt(0) + day.name().substring(1).toLowerCase()
            + "day is Day " + dayInteger);
        }

    }
}
