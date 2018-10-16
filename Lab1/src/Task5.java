public class Task5 {
    public String average(int num){
        double geom = 0;
        double arifm = 0;
        int flag = 0;

        int last = num % 10;
        flag =num/10;
        int pre_last = flag % 10;
        flag =num/100;
        int pre_last1 = flag % 10;
        flag =num/1000;
        int pre_last2 = flag % 10;
        flag =num/10000;
        int pre_last3 = flag % 10;
        flag =num/100000;
        int pre_last4 = flag % 10;

        arifm = (last + pre_last + pre_last1 +pre_last2 + pre_last3 + pre_last4)/6;
        geom = Math.pow((last * pre_last * pre_last1 * pre_last2 * pre_last3 * pre_last4),0.16666666666666666);

        return arifm  + " " + geom ;
    }
}
