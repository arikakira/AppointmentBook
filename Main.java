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
        a.printPeriod(2);
        a.findFreeBlock(2, 15);
    }
}