public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.getCountOfEyes(200));
        System.out.println("Коллиечство голов : " + task1.getCountOfHeads(14));

        System.out.println(" ");
        Task2 task2 = new Task2();
        task2.isPryamoug(8,6,10);

        System.out.println(" ");
        Task3 task3 = new Task3();
        System.out.println("Глассная : " + task3.isGlasn('ы'));
        task3.isGlasn2("ы");
        task3.isGlasn3('ы');
        task3.isGlasn4('ы');

        System.out.println(" ");
        Task4 task4 = new Task4();
        task4.moodSensor();

        System.out.println(" ");
        Task5 task5 = new Task5();
        task5.dateOfTheNextDay(28,2,1600);

    }
}
