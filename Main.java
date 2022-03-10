package JavaCore.StreamAPI.Lesson.HW_1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList2 = new ArrayList<>();
        for (int i : intList) {
            if(i <= 0) continue;
            if(i % 2 != 0) continue;
            intList2.add(i);
        }
        Collections.sort(intList2);
        for (int j : intList2) System.out.println(j);
    }

}
