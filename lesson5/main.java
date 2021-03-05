package lesson5;

/** Домашнее задание Java1. Level1. Step5
 1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
 В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
 3. У каждого животного есть ограничения на действия (
 бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
 прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
 плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.*/

public class main {

    public static void main(String[] args) {

        /** Создадим стандартных животных. Несмотря на заданные дефолтные параметры снизу у каждого животного они будут отличаться в большую или меньшую сторону
         * Это достигается внедрением модулей rndRun, rndSwim и rndJump в родительском классе Animal */

        Bird bird = new Bird("Owl", 5, 0, 0.2f);
        Horse horse = new Horse("Pony", 1500, 100, 3.0f);
        Dog dog = new Dog("Bobik", 500, 10, 0.5f);
        TomCat tomCat = new TomCat("TomCat", 200, 0, 2.0f);

        /** TomCat actions */
        System.out.println(tomCat.name + " abilities: Run (" + tomCat.abRun + " m), Swim ( none ), Jump (" + tomCat.abJump + "m)");
        tomCat.jump(50.0f); // invalid
        tomCat.jump(0.3f); // valid
        tomCat.run(2500); // invalid
        tomCat.run(10); // valid
        tomCat.swim(1); // impossible
        System.out.println("------------------");

        /** Dog actions */
        System.out.println(dog.name + " abilities: Run (" + dog.abRun + " m), Swim (" + dog.abSwim + " m), Jump (" + dog.abJump + "m)");
        dog.jump(50.0f); // invalid
        dog.jump(0.2f); // valid
        dog.run(2000); // invalid
        dog.run(30); // valid
        dog.swim(120); // invalid
        dog.swim(5); // valid
        System.out.println("------------------");

        /** Horse actions */
        System.out.println(horse.name + " abilities: Run (" + horse.abRun + " m), Swim (" + horse.abSwim + " m), Jump (" + horse.abJump + "m)");
        horse.jump(80.0f); // invalid
        horse.jump(1.2f); // valid
        horse.run(10000); // invalid
        horse.run(800); // valid
        horse.swim(5000); // invalid
        horse.swim(50); // valid
        System.out.println("------------------");

        /** Bird actions */
        System.out.println(bird.name + " abilities: Run (" + bird.abRun + " m), Swim ( none ), Jump (" + bird.abJump + "m)");
        bird.jump(80.0f); // invalid
        bird.jump(0.2f); // valid
        bird.run(10000); // invalid
        bird.run(2); // valid
        bird.swim(1); // impossible
        System.out.println("------------------");

        /** Для демонстрации 7 задания созданим несколько новых животных с дефолтными параметрами и выведем их характеристики*/

        Dog dog1 = new Dog("Hatiko", 500, 10, 0.5f);
        System.out.println(dog1.name + " abilities: Run (" + dog1.abRun + " m), Swim (" + dog1.abSwim + " m), Jump (" + dog1.abJump + "m)");

        Bird bird1 = new Bird("Baklan", 2, 10, 0.5f);
        System.out.println(bird1.name + " abilities: Run (" + bird1.abRun + " m), Swim ( none ), Jump (" + bird1.abJump + "m)");

        TomCat tomCat1 = new TomCat("Koshara", 2, 10, 0.5f);
        System.out.println(tomCat1.name + " abilities: Run (" + tomCat1.abRun + " m), Swim ( none ), Jump (" + tomCat1.abJump + "m)");

        Horse horse1 = new Horse("Ishak", 1500, 100, 3.0f);
        System.out.println(horse1.name + " abilities: Run (" + horse1.abRun + " m), Swim (" + horse1.abSwim + " m), Jump (" + horse1.abJump + "m)");

    }

}
