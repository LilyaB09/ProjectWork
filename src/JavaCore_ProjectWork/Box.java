package JavaCore_ProjectWork;
import java.util.ArrayList;


class Box {
    ArrayList<Fruit> arr = new ArrayList<>();

    public void addFruit(Fruit fr) {
        if (arr.size() == 0 || arr.get(0).name.equals(fr.name)) // апельсины нельзя добавить к яблокам
            arr.add(fr);
    }

    public void prnBox() {
        if (arr.size() == 0) {
            System.out.println("Коробка пустая");
            return;
        }
        for (Fruit fruit : arr) {
            System.out.println( fruit.getName() + " " + fruit.getWeight());
        }
    }

    public double getWeight() {
        double total = 0;
        for (Fruit fruit : arr)
            total += fruit.getWeight();
        return total;
    }

    public boolean compare(Box bx) {
        return getWeight() == bx.getWeight();
    }

    public void addBox(Box bx) {
        arr.addAll(bx.arr);
        bx.arr.clear();
    }
}
