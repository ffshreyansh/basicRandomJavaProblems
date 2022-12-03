import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Syntax
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // list.add(34);        
        // list.add(304);
        // list.add(134);
        // list.add(340);
        // list.add(2034);

        // System.out.println(list);
        // list.remove(1);
        // System.out.println(list);
        

        //input
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

    }
}
