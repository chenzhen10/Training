public class Task4 {
    public String sequence(double num){
       boolean up ;
       boolean down;
       double flag;
       double num4 = num % 10;
       flag = num/10;
       double num3 = flag % 10;
       flag = num/100;
       double num2 = flag % 10;
       flag = num/1000;
       double num1 = flag % 10;

       up = num1<num2 && num2<num3 && num3<num4;
       down = num>num2 && num2>num3 && num3>num4;

       return "Возрасает " +  up + " Убиывает " + down;
    }
}
