public class Main {
    public static void main(String[] args) {
        int balanceBefore = 100;
        int summaReplenishment = 1100;
        int minLimit = 100;
        int limitBonus = 100;
        int bonusSumma;
        if (summaReplenishment > minLimit) {
            bonusSumma = summaReplenishment / limitBonus;
        } else {
            bonusSumma = 0;
        }
        System.out.println("Итоговая сумма :");
        System.out.println(balanceBefore + summaReplenishment + bonusSumma);
        System.out.println("Сумма баллов : " + summaReplenishment / limitBonus);

    }
}