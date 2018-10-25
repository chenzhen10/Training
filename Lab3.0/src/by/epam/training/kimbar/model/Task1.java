package by.epam.training.kimbar.model;

import java.util.Random;

public class Task1 {
    private Random random = new Random();
    private int headsOrTails;
    private int countOfHeads = 0;
    private  int countOfTails = 0;


    public String headsOrTails(int countOfFlip) {
         countOfHeads = 0 ;
         countOfTails = 0 ;
        while (countOfFlip > 0) {
            numberGenerator();
            headsOrTails = headsOrTails == 0 ? countOfTails++ : countOfHeads++;
            countOfFlip--;
        }
        return "Кол-во орлов : " + countOfHeads + " Кол-во решек : " + countOfTails;
    }

    private int numberGenerator() {
        headsOrTails = random.nextInt(2);
        return headsOrTails;
    }



}
