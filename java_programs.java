import java.util.Scanner;

public class java_programs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] students = new String[21][3];
        String[][] rooms = new String[10][2];

        for (int i = 0; i < 21; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Name: ");
            students[i][0] = sc.nextLine();

            System.out.print("Course (UG/PG): ");
            students[i][1] = sc.nextLine();

            System.out.print("Gender (Male/Female): ");
            students[i][2] = sc.nextLine();
        }

        boolean[] allotted = new boolean[21];

        int roomNo = 0;

        for (int i = 0; i < 21 && roomNo < 10; i++) {

            if (allotted[i] == true) {
                continue;
            }

            rooms[roomNo][0] = students[i][0];
            allotted[i] = true;

            for (int j = i + 1; j < 21; j++) {

                if (!allotted[j] &&
                        students[i][2].equalsIgnoreCase(students[j][2])) {

                    rooms[roomNo][1] = students[j][0];
                    allotted[j] = true;
                    break;
                }
            }

            roomNo++;
        }

        System.out.println("HOSTEL ALLOTMENT: ");

        for (int i = 0; i < 10; i++) {

            System.out.println("Room " + (i + 1));

            if (rooms[i][0] != null) {
                System.out.println("Student 1: " + rooms[i][0]);
            }

            if (rooms[i][1] != null) {
                System.out.println("Student 2: " + rooms[i][1]);
            }
        }

        System.out.println(" UNALLOTTED STUDENTS ");

        for (int i = 0; i < 21; i++) {

            if (!allotted[i]) {
                System.out.println(
                        students[i][0] + " No room available"
                );
            }
        }

        
    }
}