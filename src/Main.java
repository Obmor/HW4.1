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

        System.out.println();
        System.out.println();

        int age = 30;
        int salary1 = 80_000;
        int wantedSum = 60000;
        double baseRate = 0.1;
        double monthlyPayment = wantedSum * baseRate;
        double maxPayment = salary1 * 0.5;
        double ageLower23 = 0.01;
        double ageLower30 = 0.005;
        double salaryUpper80K = 0.007;
        if (age < 23 && salary1 > monthlyPayment * ageLower23 && maxPayment > wantedSum * (ageLower23 + baseRate) / 1.2
                && salary1 < 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * (ageLower23 + baseRate) / 1.2 + " рублей. Одобрено." +
                    " 1");
        } else if (age < 23 && salary1 > monthlyPayment * ageLower23 && maxPayment < wantedSum * (ageLower23 + baseRate)
                / 1.2 && salary1 < 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * (ageLower23 + baseRate) / 1.2 + " рублей. Отказано." +
                    " 2");
        } else if (age < 23 && salary1 > monthlyPayment * (ageLower23 - salaryUpper80K) && maxPayment > wantedSum * (
                ageLower23 + baseRate) / 1.2 && salary1 >= 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * (ageLower23 + baseRate - salaryUpper80K) / 1.2 +
                    " рублей" +
                    ". Одобрено. 3");
        } else if (age < 23 && salary1 > monthlyPayment * (ageLower23 - salaryUpper80K) && maxPayment < wantedSum *
                (ageLower23 + baseRate - salaryUpper80K) / 1.2 && salary1 >= 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * (ageLower23 + baseRate - salaryUpper80K) / 1.2 +
                    " рублей. Отказано. 4");
        } else if (age >= 23 && age < 30 && salary1 > monthlyPayment * ageLower30 && maxPayment > wantedSum *
                (ageLower30 + baseRate) / 1.2 && salary1 < 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * (float) (ageLower30 + baseRate) / 1.2 +
                    " рублей. Одобрено. 5");
        } else if (age >= 23 && age < 30 && salary1 > monthlyPayment * ageLower30 && maxPayment < wantedSum *
                (ageLower30 + baseRate) / 1.2 && salary1 < 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * (float) (ageLower30 + baseRate) / 1.2 +
                    " рублей. Отказано. 6");
        } else if (age >= 23 && age < 30 && salary1 > monthlyPayment * ageLower30 && maxPayment > wantedSum *
                (ageLower30 + baseRate - salaryUpper80K) / 1.2 && salary1 >= 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * (ageLower30 + baseRate - salaryUpper80K) / 1.2 +
                    " рублей. Одобрено. 7");
        } else if (age >= 23 && age < 30 && salary1 > monthlyPayment * ageLower30 && maxPayment < wantedSum *
                (ageLower30 + baseRate - salaryUpper80K) / 1.2 && salary1 >= 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * (ageLower30 + baseRate - salaryUpper80K) / 1.2 +
                    " рублей. Отказано. 8");
        } else if (age >= 30 && salary1 > monthlyPayment && maxPayment > wantedSum *
                (ageLower30 + baseRate) / 1.2 && salary1 < 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * baseRate / 1.2 +
                    " рублей. Одобрено. 9");
        } else if (age >= 30 && salary1 > monthlyPayment && maxPayment < wantedSum *
                (ageLower30 + baseRate) / 1.2 && salary1 < 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * baseRate / 1.2 +
                    " рублей. Отказано. 10");
        } else if (age >= 30 && salary1 > monthlyPayment && maxPayment > wantedSum *
                (baseRate - salaryUpper80K) / 1.2 && salary1 >= 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * (baseRate - salaryUpper80K) / 1.2 +
                    " рублей. Одобрено. 11");
        } else if (age >= 30 && salary1 > monthlyPayment && maxPayment < wantedSum *
                (baseRate - salaryUpper80K) / 1.2 && salary1 >= 80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment +
                    " рублей. " + "Платеж по кредиту " + wantedSum * (baseRate - salaryUpper80K) / 1.2 +
                    " рублей. Отказано. 12");
        }
    }
}