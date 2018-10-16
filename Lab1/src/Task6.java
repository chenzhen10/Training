public class Task6 {
    public String changer(int num) {
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
        flag =num/1000000;
        int pre_last5 = flag % 100;

        return last + "" + pre_last+ "" + pre_last1 + "" + pre_last2+ "" + pre_last3 + "" + pre_last4 + "" + pre_last5 ;
    }
}
