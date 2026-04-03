
import com.obmachevsky.deal.Deal;
import com.obmachevsky.deal.Expenditure;
import com.obmachevsky.deal.Sale;
import com.obmachevsky.taxes.SimTaxSystemIncome;
import com.obmachevsky.taxes.SimTaxSystemIncomeMinConsumption;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Создаем компанию "Нетология"
        Company netology = new Company("Нетология", new SimTaxSystemIncome());

        // В качестве реализации, будет выступать продажа услуги обучения на курсе "Java разработчик с нуля"
        int priceOfCourse = 100_000; // стоимость курса

        //В качестве трат, будут фигурировать: ЗП преподавателя, реклама компании, хостинг сайта компании
        int expertSalary = 150_000; // ЗП преподавателя
        int advertising = 75_000;   // Траты на рекламу
        int hosting = 40_000;       // Хостинг сайта

        // Предположим, что на курс необходимо набрать 5 слушателей
        Deal[] deals = {
                new Sale("место на курсе \"Java разработчик с нуля\"", priceOfCourse),
                new Sale("место на курсе \"Java разработчик с нуля\"", priceOfCourse),
                new Sale("место на курсе \"Java разработчик с нуля\"", priceOfCourse),
                new Sale("место на курсе \"Java разработчик с нуля\"", priceOfCourse),
                new Sale("место на курсе \"Java разработчик с нуля\"", priceOfCourse),
                new Expenditure("заработная плата преподавателя", expertSalary),
                new Expenditure("реклама компании", advertising),
                new Expenditure("хостинг сайта компании", hosting),
        };

        // Если необходимо перейти на другую налоговую систему, следует закомментировать строку.
        netology.setTaxSystem(new SimTaxSystemIncomeMinConsumption());

        netology.applyDeals(deals);

    }
}
