public class Task2 {
    public String cheeker(float a ,float b , float c){
        boolean equals;
        boolean different;
        equals = a==b && b==c;
        different = a==b && b!=c || a!=c && b==c || a==c && b!=a;
        return "Равны " + equals + " Не равны " + different ;
    }

}
