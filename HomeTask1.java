
/**
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
Метод должен пройтись по каждому элементу и проверить что он не равен null. А теперь реализуйте следующую логику:

Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */

import java.util.*;

public class HomeTask1 {

    public static void main(String[] args) {

        Integer[] IntArray = new Integer[] { 1, 2, null, 1, 2, null, 8 };

        System.out.println(Arrays.toString(IntArray));

        checkArray(IntArray);

    }

    public static void checkArray(Integer[] arr) {
        StringBuilder sb = new StringBuilder();
        int countNull = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                countNull++;
                sb.append(i);
                sb.append(" ");

            }
        }
        if (countNull != 0) {
            System.out.println("Null is in index: ");
            System.out.println(sb.toString());
            throw new IllegalStateException("Array's element equals null");
        }

    }
}