public class Task2 {
   private boolean equals;
   private boolean different;

    public String equalsCheeker(double a ,double b , double c){
        equals = a==b && b==c;
        return "Равны " + equals  ;
    }
    public String differentCheeker(double a, double b , double c){
        different = a==b && b!=c || a!=c && b==c || a==c && b!=a;
        return  "Не равны " + different;
    }

}
