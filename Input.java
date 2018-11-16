import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Input {


    List<List<Object>> outerList = new ArrayList<List<Object>>();

    int count = -1 ;


    public void categoryInput() {
        String answer;
        System.out.println("Please insert the names of the categories of the information");
        System.out.println("Whenever you don't want to add another category, please press -1");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        outerList.add(new ArrayList<Object>());
        do {
            if (!(answer.equals("-1"))) {
            outerList.get(0).add(++count, answer);
            answer = scanner.next();
            }
        } while (!(answer.equals("-1")));
        dataInput();
    }

    public void dataInput() {
        String answer;
        System.out.println("Please insert the information you want and then -1 ");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        int count1 = 0;
        do {
            outerList.add(new ArrayList<Object>());
            count1++;
            outerList.get(count1).add(0 ,answer);

            for (int i = 1; i < count + 1; i++) {
                answer = scanner.next();
                outerList.get(count1).add(i , answer);
            }
            System.out.println("You have submitted an object, you can continue for the next one or press -1");
            answer = scanner.next();
        } while (!(answer.equals("-1")));

        for (int i = 0; i < outerList.size() ;i++) {
            System.out.println(outerList.get(i));
        }
    }
}


