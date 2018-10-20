public class Task5 {
    private double geom;
    private double arifm;

    public String arifmAv(int num){

        int last = num % 10;
        int pre_last = (num /= 10) % 10;
        int pre_last1 = (num /= 10) % 10;
        int pre_last2 = (num /= 10) % 10;
        int pre_last3 = (num /= 10) % 10;
        int pre_last4 = (num / 10) % 10;

        arifm = last + pre_last + pre_last2 + pre_last3 + pre_last4 + pre_last1;

        return  "Арифметическое среднее  " + arifm / 6 ;
    }
    public String geomAv(int num){

        int last = num % 10;
        int pre_last = (num /= 10) % 10;
        int pre_last1 = (num /= 10) % 10;
        int pre_last2 = (num /= 10) % 10;
        int pre_last3 = (num /= 10) % 10;
        int pre_last4 = (num / 10) % 10;

        geom = last * pre_last * pre_last1 * pre_last2 * pre_last3 * pre_last4;
        geom = Math.round(Math.pow(geom,0.16));

        return "Геометрическое среднее " + geom  ;
    }
}
