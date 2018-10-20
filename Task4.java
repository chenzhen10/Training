public class Task4 {

   public String isUp(double num) {

      double num4 = num % 10;
      double num3 =  Math.round(num /= 10) % 10;
      double num2 =  Math.round(num /= 10) % 10;
      double num1 =  Math.round(num / 10) % 10;

      return "Возрасает " + (num1 < num2 && num2 < num3  && num3 < num4);
   }

   public String isDown(double num) {

      double num4 = num % 10;
      double num3 = Math.round(num /= 10) % 10;
      double num2 = Math.round(num /= 10) % 10;
      double num1 = Math.round(num / 10) % 10;

      return "Убиывает " +  (num1 > num2 && num2 > num3 && num3 > num4) ;
   }



}
