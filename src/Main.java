public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно подождать");
        }

        System.out.println("/nTask 2");
        int airTemperature = 6;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        }
        if (airTemperature > 5) {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }
        System.out.println("/nTask 3");
        int speed = 110;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + "то можно ехать спокойно");
        }
        System.out.println("/nTask 4");

        age = 16;
        if (age >= 2 && age <= 6) {
            System.out.println("Если человеку " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если человеку " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если человеку " + age + ", то его место в университете");
        }
        if (age >= 24) {
            System.out.println("Если человеку " + age + ", то ему пора ходить на работу");
        }
        System.out.println("/nTask 5");
        age = 8;
        if (age < 5) {
            System.out.println("Если возраст ребенка меньше " + age + ", то он не может кататься на аттракционах");
        }
        if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка больше " + age + ", то он не может кататься на аттракционах");
        }
        System.out.println("/nTask 6");
        int place = 102;
        int sitPlace = 60;
        int people = 70;

        if (people < sitPlace){
            System.out.println("В вагоне есть сидячие места");
        }
        if (people >= sitPlace && people < place) {
            System.out.println("В вагоне есть стоячие места ");
        }
        if (people >= place) {
            System.out.println("В вагоне нет мест");
        }
        System.out.println("/nTask 7");
        int one = 10;
        int two = 8;
        int three = 31;

        if (one >= two && one >= three) {
            System.out.println("Максимальное число в переменной one, равно " + one);
        }else if (two >= three) {
            System.out.println("Максимальное число в переменной two, равно " + two);
        }else {
            System.out.println("Максимальное число в переменной three, равно " + three);
        }
    }
}