package Enums;

public class EnumExamples {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these are enum constants
        //public static final
        //since it's final we can't create child enums
        //type is week


        Week() {
            System.out.println("Constructor called for "+ this);
        }
        //this is not public nor protected, only private or default
        //as we don't want to create new objects

        //internally : public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Thursday;
//        for(Week day: Week.values()) {
//            System.out.println(day);
//        }
        System.out.println();
//        System.out.println(week);
    }
}
