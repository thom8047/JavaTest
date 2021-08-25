// Add different scripts that all represent different sorting algorithms
import java.util.*;


public class SortAlgs {

    public static List<Integer> getUserList() {
        List<Integer> sorting_list = new ArrayList<>();

        Scanner user_input = new Scanner(System.in);
        int num;
        boolean input = false;
        do {
            try {
                num = user_input.nextInt();
                sorting_list.add(num);
                input = true;

                // close with empty input
            } catch (Exception e) {
                input = false;
            }
        } while (input);

        // close scanner
        user_input.close();

        return sorting_list;
    }
    public static void main(String []args) {
        System.out.println("Enter numbers to belong in list, when finished type q"); // prints Hello World

        List<Integer> OBJ = getUserList();

        BubbleSort alg_1 = new BubbleSort();
        List<Integer> alg_1_list = alg_1.returnBubble(OBJ);

        System.out.println(alg_1_list);

        // sorting scripts to pull
     }
}