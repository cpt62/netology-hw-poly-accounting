import com.obmachevsky.taxes.SimTaxSystemIncome;

public class Main {
    public static void main(String[] args) {
        Company netology = new Company("Netology", new SimTaxSystemIncome());

        int priceOfCourse = 100_000; // Стоимость курса
        int promoCode = 10;          // Промокод
        int expertSalary = -50_000;   // Заработная плата преподавателя (надеюсь не обидел)
        int advertisement = -10_000;  // Стоимость рекламы
        int hosting = -15_000;        // Стоимость хостинга

        // Не стал затевать отдельный массив студентов (оставил их безымянными), а вот массив с наличием промокода - инициализировал.
        boolean[] discount = {true, false, true, false, false};

        // Набираем студентов на курс. Идёт сбор денежных средств за обучение
        for (boolean b : discount) {
            netology.shiftMoney(!b ? priceOfCourse : priceOfCourse - priceOfCourse / 100 * promoCode);
        }

        //Набрали курс. Оплачиваем рекламу, работу экспертов, хостинг сайта
        netology.shiftMoney(expertSalary);
        netology.shiftMoney(advertisement);
        netology.shiftMoney(hosting);

        //Если понадобится изменить систему налогообложения, то следует раскомментировать следующую строку
        //netology.setTaxSystem(new SimTaxSystemIncomeMinConsumption());

        netology.payTaxes();

    }
}
