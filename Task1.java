public class Task1 {
    private double mgramm = 1000000;
    private double gramm = 1000;
    private double ton = 0.001;

    public String massOfDino_MGramm(double mass_kg) {
        return "Миллиграммы : " + mgramm * mass_kg;
    }

    public String massOfDino_Gramm(double mass_kg) {
        return "Граммы : " + gramm * mass_kg;
    }

    public String massOfDino_Ton(double mass_kg) {
        return "Тонны : " + ton * mass_kg;
    }
}