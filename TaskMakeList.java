import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskMakeList {

    static void CreateList(int number0, int number1, int number2, int number3, int number4, int number5) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number0);
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        System.out.println("Наименьше значение списка равно: " + Collections.min(numbers));
    }
}
