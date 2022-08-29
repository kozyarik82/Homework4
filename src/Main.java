public class Main {
    public static void main(String[] args) {
        // Задача 1.1
        int age = 20;
        if (age >= 18) {
            System.out.println(" Поздравляем! Вы достигли совершеннолетия!");
        }
        age = 10;
        if (age < 18) {
            System.out.println(" Вы еще не достигли совершеннолетия и вам нужно немного подождать");
        }

        // Задача 1.2
        age = 9;
        if (age >= 7) {
            System.out.println(" Ребенок должен ходить в школу ");
        }
        age = 19;
        if (age >= 18) {
            System.out.println(" Пора отправляться в университет ");
        }
        age = 25;
        if (age >= 24) {
            System.out.println(" Пора искать первую работу ");
        }

        // Задача 1.3
        int amountPassenger = 25;
        if (amountPassenger < 60) {
            System.out.println(" Есть свободные сидячие места ");
        }
        amountPassenger = 90;
        if (amountPassenger >= 60) {
            System.out.println(" Остались только стоячие места ");
        }
        amountPassenger = 110;
        if (amountPassenger >= 102) {
            System.out.println(" В вагоне нет свободных мест");
        }

        // Задача 2.1
        age = 17;
        if (age >= 18) {
            System.out.println(" Поздравляем! Вы достигли совершеннолетия!");
        } else {
            System.out.println(" Вы еще не достигли совершеннолетия и вам нужно немного подождать");
        }

        // Задача 2.2
        age = 25;
        if (age >= 7 && age < 18) {
            System.out.println(" Ребенок должен ходить в школу ");
        } else if (age >= 18 && age < 24) {
            System.out.println(" Пора отправляться в университет ");
        } else {
            System.out.println(" Пора искать первую работу ");
        }

        // Задача 2.3
        amountPassenger = 50;
        if (amountPassenger < 60) {
            System.out.println(" Есть свободные сидячие места ");
        } else if (amountPassenger >= 60 && amountPassenger < 102) {
            System.out.println(" Остались только стоячие места ");
        } else {
            System.out.println(" В вагоне нет свободных мест");
        }

        // Задача 3.1
        age = 39;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }

        // Задача 3.2
        age = 55;
        if (age < 5) {
            System.out.println(" Ребенок в возрасте " + age + " лет не допускается на аттракцион!");
        } else if (age >= 5 && age < 14) {
            System.out.println(" Ребенок в возрасте " + age + " лет допускается на аттракцион только в сопровождении взрослого!");
        } else if (age >= 14) {
            System.out.println(" Ребенок в возрасте " + age + " лет допускается на аттракцион без сопровождения взрослого!");
        }

        // Задача 3.3
        int one = 99;
        int two = 50;
        int three = 80;
        if (one>two&&one>three){
            System.out.println(" Максимальное число " + one);
        } else if (two>one&&two>three){
            System.out.println(" Максимальное число " + two);
        } else if (three>one&&three>two){
            System.out.println(" Максимальное число " + three);
        }





    }

    }










