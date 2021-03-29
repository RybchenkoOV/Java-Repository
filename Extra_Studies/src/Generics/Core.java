package Generics;

public class Core {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat");
        GenBox<Integer, Animal, Double> genBox = new GenBox<>(12, animal, 1.5);
        System.out.println(genBox.getVarT().getClass()); // Класс Integer
        System.out.println(genBox.getVarV().getClass()); // Класс Animal
        System.out.println(genBox.getVarN().getClass()); // Класс Double


        System.out.println(genBox.compareTo(13)); // выдает -1, т.к. 12 < 13
        System.out.println(genBox.compareTo(12)); // выдает 0, т.к. 12 = 12
        System.out.println(genBox.compareTo(11)); // выдает 1, т.к. 12 > 13

        /** Выведем содержимое коробки */
        System.out.println(genBox.getVarT());
        System.out.println(genBox.getVarV());
        System.out.println(genBox.getVarN());
    }



}
