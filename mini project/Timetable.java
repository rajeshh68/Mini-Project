import java.util.*;

class Timetable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] subjects = new String[5];

        System.out.println("SCHOOL TIMETABLE MANAGEMENT");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter subject for " + days[i] + ": ");
            subjects[i] = sc.nextLine();
        }

        System.out.println("\n----- TIMETABLE -----");

        for (int i = 0; i < 5; i++) {
            System.out.println(days[i] + " : " + subjects[i]);
        }

        sc.close();
    }
}
