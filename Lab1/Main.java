public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.massOfDino_MGramm(5));
        System.out.println(task1.massOfDino_Gramm(5));
        System.out.println(task1.massOfDino_Ton(5));

        Task2 task2 = new Task2();
        System.out.println(task2.equalsCheeker(2, 1, 2));
        System.out.println(task2.differentCheeker(2, 1, 2));

        Task3 task3 = new Task3();
        System.out.println(task3.areOfCircle(4, 2));

        Task4 task4 = new Task4();
        System.out.println(task4.isUp(1234));
        System.out.println(task4.isDown(1234));

        Task5 task5 = new Task5();
        System.out.println(task5.geomAv( 222222));
        System.out.println(task5.arifmAv(333333));

        Task6 task6 = new Task6();
        System.out.println(task6.changer(1234567));

        Task7 task7 = new Task7();
        System.out.println(task7.changer(4.0, 5.0));
    }
}


