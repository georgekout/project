import java.util.ArrayList;
import java.util.Scanner;

/*The claas of the menu which calls the other classes when the user needs them. */
public class Menu {
    /* The main method */
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Input> list = new ArrayList<Input>();
        int count=0;

        Input in = new Input();
        Change ch = new Change();
        Delete del = new Delete();
        Output out = new Output();
        int answer = -1;
        do {
            System.out.println("--Database Menu--");
            System.out.println("Choose one of the following actions: ");
            System.out.println("1.Create database.");
            System.out.println("2.Input more data.");
            System.out.println("3.Change data in pre-existing database.");
            System.out.println("4.Delete data from pre-existing database.");
            System.out.println("5.View Data.");
            System.out.println("6.Exit.");
            answer = sc.nextInt();

            if (answer == 1) {
                list.add(new Input());
                list.get(count).categoryInput();
                count++;
            } else if (answer == 2) {
                for (int i=0; i<list.size(); i++) {
                    list.get(i).outputconnection();
                }
                System.out.println("Please give the number of the database you wish to change: ");
                Scanner scanner = new Scanner(System.in);
                answer = scanner.nextInt();
                list.get(answer-1).dataInput(in.outerList.size()+1);
            } else if (answer == 3 ) {
                for (int i=0; i<list.size(); i++) {
                    list.get(i).outputconnection();
                }
                System.out.println("Please give the number of the database you wish to view: ");
                Scanner scanner = new Scanner(System.in);
                answer = scanner.nextInt();
                list.get(answer-1).change();
            } else if (answer == 4) {
                for (int i=0; i<list.size(); i++) {
                    list.get(i).outputconnection();
                }
                System.out.println("Please give the number of the database you wish to view: ");
                Scanner scanner = new Scanner(System.in);
                answer = scanner.nextInt();
                list.get(answer-1).delete();
            } else if (answer == 5) {
                for (int i=0; i<list.size(); i++) {
                    list.get(i).outputconnection();
                }
                System.out.println("Please give the number of the database you wish to view: ");
                Scanner scanner = new Scanner(System.in);
                answer = scanner.nextInt();
                list.get(answer-1).printdata();
            } else if (answer == 6) {
                break;
            } else {
                System.out.println("The option you selected does not exist. Please choose a valid option.");
            }
            System.out.println(" ");

        } while(answer != 6);
    }
}