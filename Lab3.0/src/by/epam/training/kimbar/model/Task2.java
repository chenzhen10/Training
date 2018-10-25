package by.epam.training.kimbar.model;

public class Task2 {
    private int maxNumbers = 0;
    private int pal = 0;
    private int counter = 0;
    private boolean flag = false;
    private int temp = 0;



    public int maxNumber(int value) {
        maxNumbers = value % 10;
        value /= 10;
        while (value > 0) {
            if (value % 10 > maxNumbers) {
                maxNumbers = value % 10;
            }
            value /= 10;
        }
        return maxNumbers;
    }

    public boolean isPalendrome(int pali) {
        counter = pali;
        pal = 0;

        while (counter > 0) {
            pal = 10 * pal + counter % 10;
            counter /= 10;
        }
        return pal == pali;
    }

    public boolean isSimple(int num) {
        counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
            flag = counter <= 2;
        }
        return flag;
    }

//    public String getSimpleDel(int simp) {
//
//    }

    public int getCountDifNumber(int num) {
        counter = 0;

        for (int i = 0; i<10 ; i++) {
            temp = num;
            while (temp != 0){
                if(temp % 10 == i){
                    counter++;
                    break;
                }
                temp /= 10;
            }
        }
        return  counter;
    }

}