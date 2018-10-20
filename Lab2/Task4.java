import java.util.Random;

public class Task4 {
    private Random random = new Random();
    private int valueOfMood = 0;

    private int genrateValue(){
       valueOfMood = random.nextInt(10);
       return valueOfMood;
    }

    public void moodSensor(){
        valueOfMood = genrateValue();
        System.out.println(valueOfMood);
        if(valueOfMood <= 3){
            System.out.println("Ваше настроение - грусть");
        }else if(valueOfMood < 7){
            System.out.println("Ваше настроение - удовлетворенность");
        }else {
            System.out.println("Вы в отличном настроении");
        }

    }
}
