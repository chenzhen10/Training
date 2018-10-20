public class Task6 {
    public String changer(int num) {

        int last = num % 10;
        int pre_last = (num /= 10) % 10;
        int pre_last1 = (num /= 10) % 10;
        int pre_last2 = (num /= 10) % 10;
        int pre_last3 = (num /= 10) % 10;
        int pre_last4 = (num /= 10) % 10;
        int pre_last5 = (num / 10) % 100;

        return last + "" + pre_last+ "" + pre_last1 + "" + pre_last2+ "" + pre_last3 + "" + pre_last4 + "" + pre_last5 ;
    }
}
