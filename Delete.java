import java.util.List;
import java.util.Scanner;

/* This class deletes either a column , a line or a specified element.*/
public class Delete {
    /* DeleteEl is the main method of the class.*/
    public void deleteEl(List<List<Object>> outerList) {
        System.out.print("\n Press 1, in order to delete a column. \n "
                + "Press 2, in order to delete a line. \n "
                + "Press 3 in order to delete an element.");
        Scanner answer = new Scanner(System.in);
        int whatToDelete = answer.nextInt();

        if (whatToDelete == 1) {
            System.out.print("\n Give the name of the column that"
                    + " you want to delete:");
            Scanner col = new Scanner(System.in);
            Object column = col.next();
            int found = Change.searchColumn(outerList, column);

            if (found != -1) {
                for (int i = 0; i < outerList.size(); i++) {
                    outerList.get(i).remove(found);
                }
            }
        } else if (whatToDelete == 2) {
            System.out.printf("\n From 0 - %d which line you want"
                    + " to delete? ", outerList.size()-1);
            Scanner answer2 = new Scanner(System.in);
            int line = answer2.nextInt();
            for (int i = 0; i < outerList.get(line).size(); i++) {
                outerList.get(line).remove(i);
                i--;
            }

        } else if (whatToDelete == 3) {
            System.out.print("\n Please insert the name of the column "
                    + "that contains the element you want to delete:");
            Scanner col = new Scanner(System.in);
            Object column = col.next();
            int columnFound = Change.searchColumn(outerList, column);

            if (columnFound != -1) {
                System.out.print("\n Please insert the element you want "
                        + "to delete:");
                Scanner el = new Scanner(System.in);
                Object element = el.next();
                int searchEl = Change.searchElement(outerList, element, columnFound);

                if (searchEl != -1) {
                    System.out.print("\n");
                    outerList.get(searchEl).remove(columnFound);

                } else {
                    System.out.print("\n The element you inserted does not"
                            + " exist in the database or in the column "
                            + "you inserted previously.Please try again.\n");
                }

            } else {
                System.out.print("\n The column name you inserted "
                        + "does not exist in the Database.\n");
            }
        } else {
            System.out.println("\n The option you selected does not exist."
                    + " Please try again. \n");
        }
    }
}