public class Main {
    public static void main(String[] args) {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        for(int i=10; i<15; i++) {      // makes min 10-14 free for PD#2
            schedule[1][i] = true;
        }
        for(int i=30; i<45; i++) {
            schedule[1][i] = true;
        }
        for(int i=50; i<60; i++) {
            schedule[1][i] = true;
        }
        System.out.println(a.findFreeBlock(2, 15));     // test cases
        System.out.println(a.findFreeBlock(2, 9));      // test cases
        System.out.println(a.findFreeBlock(2, 20));     // test cases

        schedule = new boolean[8][60];
        for(int i=25; i<30; i++) {
            schedule[1][i] = true;
        }
        for(int i=0; i<15; i++) {
            schedule[2][i] = true;
        }
        for(int i=41; i<60; i++) {
            schedule[2][i] = true;
        }
        for(int i=5; i<30; i++) {
            schedule[3][i] = true;
        }
        for(int i=44; i<60; i++) {
            schedule[3][i] = true;
        }
        AppointmentBook b = new AppointmentBook(schedule);
        int period = 2;
        while(period<5) {
            System.out.println("Period: " + period);
            b.printPeriod(period);
            period++;
        }

        System.out.println(b.makeAppointment(2, 4, 22));        //test case
        System.out.println(b.makeAppointment(3, 4, 3));     // test case
        System.out.println(b.makeAppointment(2, 4, 30));        // test case
    }
}