public class Main {
    public static void main(String[] args) {
        int amount = 22149; // стоимость билета
        int miles = 20; // количество рублей для одной мили
        int bonus = amount / miles; // расчет количества бонусных миль
        System.out.println("Итоговый бонус: " + bonus);
    }
}