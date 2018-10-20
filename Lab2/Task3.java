public class Task3 {
    public boolean isGlasn(char ch) {
        switch (ch) {
            case 'а':
            case 'е':
            case 'э':
            case 'о':
            case 'ы':
            case 'я':
            case 'и':
            case 'ю':
            case 'ё':
                return true;
            default:
                return false;
        }
    }

    public void isGlasn2(String str) {
        if (str.matches("^(?i:[аеёиоуыэюя]).*")) { //регулярное выражения ^ начало строки ?i любой регистр и .* для проверки только первой буквы
            System.out.println("Первая буква гласная : " + str);
        } else
            System.out.println("Первая буква согласная " + str);
    }

    public void isGlasn3(Character str) {
        char[] c = new char[]{'а', 'е', 'ё', 'я', 'и', 'о', 'у', 'ы', 'э'};
        for (char cheeker : c) {
            if (str.equals(cheeker)) {
                System.out.println("Глассная : " + cheeker);
            }
        }
    }

    public void isGlasn4(char ch) {
        if (ch == 'а') {
            System.out.println("Глассная " + ch);
        } else if (ch == 'я') {
            System.out.println("Глассная " + ch);
        } else if (ch == 'и') {
            System.out.println("Глассная " + ch);
        } else if (ch == 'о') {
            System.out.println("Глассная " + ch);
        } else if (ch == 'ё') {
            System.out.println("Глассная " + ch);
        } else if (ch == 'е') {
            System.out.println("Глассная " + ch);
        } else if (ch == 'у') {
            System.out.println("Глассная " + ch);
        } else if (ch == 'ы') {
            System.out.println("Глассная " + ch);
        } else if (ch == 'э') {
            System.out.println("Глассная " + ch);
        }else {
            System.out.println("Согласная " + ch);
        }

    }


}
