public class Main {
    public static void main(String[] args) {
        int ageOfClient = 22;
        int salary = 80000;
        if (ageOfClient < 23 && salary >= 50000 && salary < 80000) {
            System.out.println("До 23, 50-80 лимит " + salary * 2 / 100 * 120);
        } else if (ageOfClient < 23 && salary >= 80000) {
            System.out.println("До 23, от 80 лимита " + salary * 2 / 100 * 150);
        } else if (ageOfClient >= 23 && salary >= 50000 && salary < 80000) {
            System.out.println("После 23, 50-80 лимита " + salary * 3 / 100 * 120);
        } else if (ageOfClient >= 23 && salary >= 80000) {
            System.out.println("После 23, от 80 лимита " + salary * 3 / 100 * 150);
        }


    }
}