import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Menu {



    public static void main(String[] args) {
		Input i = new Input();
        String ans;
		Scanner scanner = new Scanner(System.in);
		showMenu();
        ans = scanner.next();
        while (!(ans.equals("5"))) {
            if (!(ans.equals("5"))) {
                if (ans.equals("1")) {
                    i.categoryInput();
                    i.dataInput();

                } else if (ans.equals("2")) {
                    Output o = new Output();
                    Output.printDatabase(i.outerList);
                } else if (ans.equals("3")) {
                    Change m = new Change();
                    Change.ChanEl(i.outerList);
                } else if (ans.equals("4")) {
                    Change m = new Change();
                    Delete.deleteEl(i.outerList);
                } else {
                    System.out.println("Wrong input");
                }
            }
            showMenu();
            ans = scanner.next();
        }
    }

    public static void showMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1. Insert data");
        System.out.println("2. Show data");
        System.out.println("3. Change data");
        System.out.println("4. Delete data");
        System.out.println("For exit, press 5");
    }
}