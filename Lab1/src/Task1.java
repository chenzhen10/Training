public class Task1 {
       public String massOfDino(double mass_kg){
            double mgramm = 1000000 * mass_kg;
            double gramm = 1000 * mass_kg;
            double ton = 0.001 * mass_kg;
            return "Миллиграммы : " + mgramm + " Граммы : " + gramm + " Тонны :" + ton;
        }
}