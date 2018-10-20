public class Task5 {
    private boolean isVes = false;

    public void dateOfTheNextDay(int day, int month, int year) {

        if (month == 1) {
            if (day < 31) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }

        } else if (month == 2) {
            if (isVesokosny(year)) {
                if (day < 29) {
                    System.out.println(++day + " " + month + " " + year);
                } else {
                    day = 1;
                    System.out.println(day + " " + (++month) + " " + year);
                }
            } else if (day < 28) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }

        } else if (month == 3) {
            if (day < 31) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }

        } else if (month == 4) {
            if (day < 30) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }

        } else if (month == 5) {
            if (day < 31) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }

        } else if (month == 6) {
            if (day < 30) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }

        } else if (month == 7) {
            if (day < 31) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }

        } else if (month == 8) {
            if (day < 31) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }

        } else if (month == 9) {
            if (day < 30) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }

        } else if (month == 10) {
            if (day < 31) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }

        } else if (month == 11) {
            if (day < 30) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }

        } else if (month == 12) {
            if (day < 31) {
                System.out.println(++day + " " + month + " " + year);
            } else {
                day = 1;
                System.out.println(day + " " + (++month) + " " + year);
            }
        }
    }

    private boolean isVesokosny(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                isVes = true;
            }
        } else {
            isVes = false;
        }
        return isVes;
    }
}
