import java.util.Scanner;
import java.util.List;

/*The class for changing elements and column names */
public class Change {
    /* the main method of this class*/

    public void changeEl(List<List<Object>>outerList) {
        System.out.print("\n Press 1, in order to change column name."
                + " \n Press 2, in order to change an element.");
        Scanner answer = new Scanner(System.in);
        int whatTochange = answer.nextInt();

        if (whatTochange == 1) {
            System.out.print("\n Give the name of the column "
                    + "that you want to change:");
            Scanner col = new Scanner(System.in);
            Object column = col.next();
            int found = Change.searchColumn(outerList, column);

            if (found != -1){
                System.out.print("\n Insert new name for column:");
                Scanner newName = new Scanner(System.in);
                Object nColName = newName.next();
                outerList.get(0).set(found, nColName);
            } else {
                System.out.print("\n The Column you want to change"
                        + " does not exist. \n");
            }

        } else if (whatTochange == 2) {
            System.out.print("\n Please insert the name of the column"
                    + "that contains the element you want to change:");
            Scanner col = new Scanner(System.in);
            Object column = col.next();
            int columnFound = Change.searchColumn(outerList, column);

            if (columnFound != -1) {
                System.out.print("\n Please insert the element"
                        + " you want to change:");
                Scanner el = new Scanner(System.in);
                Object element = el.next();
                int searchEl = Change.searchElement(outerList, element, columnFound);

                if (searchEl != -1) {
                    System.out.print("\n");
                    System.out.print("Please insert new Object:");
                    Scanner newEl = new Scanner(System.in);
                    Object newElement = newEl.next();
                    outerList.get(searchEl).set(columnFound, newElement);


                } else {
                    System.out.print("\n The element you inserted does not"
                            + " exist in the database or in the "
                            + "column you inserted previously."
                            + " Please try again.\n");
                }

            } else {
                System.out.print("\n The column name you inserted"
                        + " does not exist in the Database.\n");
            }
        } else {
            System.out.println("\n The option you selected "
                    + "does not exist. Please try again. \n");
        }
    }
    /*Method that searches and returns the position of the column that the user wants. */
    public static int searchColumn(List<List<Object>>outerList, Object elsearched) {
        int i = 0;
        Boolean flag = false;

        do {
            if (outerList.get(0).get(i).equals(elsearched)) {
                flag = true;
            } else {
                i++;
            }

        } while (i < outerList.size() && flag == false);

        if (flag == false) {
            i = -1;
        }
        return i;
    }
    /*Method that searches and returns the position of the element that the user wants. */
    public static int searchElement(List<List<Object>>outerList, Object elsearched, int col) {
        int i = 0;
        Boolean flag = false;
        int elFound = -1;

        do {
            if (outerList.get(i).get(col).equals(elsearched)) {
                elFound = i;
                flag = true;
            } else {
                i++;
            }
        } while (flag == false && i < outerList.size());

        return elFound;
    }

}

