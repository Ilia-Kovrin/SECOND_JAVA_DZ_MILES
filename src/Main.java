public class Main {
    public static void main(String[] args) {

        // Цена билета //
        int price = 20_000;

        // Количество потраченных рублей для начисления 1 мили //
        int rubels = 20;

        // Формула расчета количества начисленных миль за всю чтоимость билета //
        int miles = price / rubels;

        // Выводим результат на экран//

        System.out.println("Итого начислено " + miles + " миль ");

    }

}

