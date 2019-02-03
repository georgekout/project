import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/* This class inserts data in the database */
public class Input {


    List<List<Object>> outerList = new ArrayList<List<Object>>();

    int count = -1;

    /* This method inserts the name of the categories we want in our database and calls the method to insert the data*/
    public void categoryInput() {
        String answer;
        System.out.println("Please insert the names of "
                + "the categories of the information");
        System.out.println("Whenever you don't want to add"
                + " another category, please press -1");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        outerList.add(new ArrayList<Object>());
        do {
            if (!(answer.equals("-1"))) {
                outerList.get(0).add(++count, answer);
                answer = scanner.next();
            }
        } while (!(answer.equals("-1")));
        dataInput(0);
    }

    /* This method inserts the information in each category */
    public void dataInput(int count1) {
        String answer;
        System.out.println("Please insert the information "
                + "you want for your input: ");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        do {
            outerList.add(new ArrayList<Object>());
            count1++;
            outerList.get(count1).add(0, answer);

            for (int i = 1; i < count + 1; i++) {
                answer = scanner.next();
                outerList.get(count1).add(i, answer);
            }
            System.out.println("You have submitted an object, you can "
                    + "continue for the next one or press -1");
            answer = scanner.next();
        } while (!(answer.equals("-1")));

    }
}
