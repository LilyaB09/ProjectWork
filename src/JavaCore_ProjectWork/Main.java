package JavaCore_ProjectWork;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arrStr = {"one", "two", "three", "four", "five"};
        Integer[] arrInt = {1, 2, 3, 4, 5};
        Float[] arrFlo = {1.1f, 0.002f, 3.33f, 400.04f, 5.5f};

        System.out.println("Массивы разного типа:");
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrFlo));

        swapTwoElements(arrStr);
        swapTwoElements(arrInt);
        swapTwoElements(arrFlo);

        System.out.println("Поменяли местами элементы с индексами 1 и 4");
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrFlo));

        System.out.println("Коробки с фруктами ");

        Box box1 = new Box();
        box1.addFruit(new Apple(1.0));
        box1.addFruit(new Apple(1.0));
        box1.addFruit(new Apple(1.0));
        box1.addFruit(new Orange(1.5)); // апельсины кладем к яблокам
        box1.prnBox();                      // в box1 3 яблока
        System.out.println("Total weight of the box: " + box1.getWeight());

        Box box2 = new Box();
        box2.addFruit(new Orange(1.5));
        box2.addFruit(new Orange(1.5));
        box2.addFruit(new Orange(1.5));
        box2.addFruit(new Orange(1.5));
        box2.addFruit(new Apple(1.0));  // яблоки кладем к апельсинам
        box2.prnBox();                      // в box2 4 апельсина
        System.out.println("Total weight of the box: " + box2.getWeight());

        if (box1.compare(box2)) System.out.println("Коробки весят одинаково");
        else System.out.println("Коробки разного веса");

        Box box3 = new Box();   //  фрукты кладем  в новую коробку
        box3.addBox(box1);      //  в box3 яблоки
        box3.prnBox();
        box1.prnBox();          //  box1 пустая
    }

    private static <T> void swapTwoElements(T[] array) {
        T element = array[1];
        array[1] = array[4];
        array[4] = element;
    }
}
