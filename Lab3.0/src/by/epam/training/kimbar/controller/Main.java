package by.epam.training.kimbar.controller;
import by.epam.training.kimbar.model.Task1;
import by.epam.training.kimbar.model.Task2;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

    private static final Logger LOG = Logger.getRootLogger();

    public static void main(String[] args) {
        String log4jConfPath = "C:\\Users\\Tim\\Desktop\\Lab3.0\\src\\resources\\log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);

        Task1 task1 = new Task1();

        LOG.info("headsOrTails method is started");
        System.out.println(task1.headsOrTails(20));
        System.out.println(task1.headsOrTails(20));


        System.out.println();
        Task2 task2 = new Task2();
        LOG.info("maxNumber method is started");
        System.out.println(task2.maxNumber(8749));
        LOG.info("isPalendrome method is started");
        System.out.println(task2.isPalendrome(14));
        LOG.info("isSimple method is started");
        System.out.println(task2.isSimple(7));
        LOG.info("getCountDifNumber method is started");
        System.out.println(task2.getCountDifNumber(222));





    }
}
