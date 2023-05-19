public class Main {
    public static void main(String[] args) {
        public class Main {

            private Day day = Day.MONDAY;

            public static void main(String[] args) {

                Day today = Day.MONDAY;

                switch (today) {
                    case MONDAY:
                        System.out.println("Today is Monday");
                        break;
                    case TUESDAY:
                        System.out.println("Today is Tuesday");
                        break;
                }

            }

            public void printDay() {
                switch (day) {
                    case MONDAY:
                        System.out.println("Today is Monday");
                        break;
                    case TUESDAY:
                        System.out.println("Today is Tuesday");
                        break;
                }
            }


            public Day getDay() {
                return day;
            }

            public enum Day {
                MONDAY,
                TUESDAY,
                WEDNESDAY,
                THURSDAY,
                FRIDAY,
                SATURDAY,
                SUNDAY
            }

        }
    }


}