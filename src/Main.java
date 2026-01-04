import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        // создаём сотрудников
        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("Paul", "McCartney", "Developer", 30000.00));
        people.add(new Employee("George", "Harrison", "Designer", 25000.00));

        // создаём студентов
        people.add(new Student("Ringo", "Starr", 3.0));
        people.add(new Student("Mick", "Jagger", 2.5));
        people.add(new Student("Keith", "Richards", 3.5));

        // сортируем по доходу (compareTo)
        Collections.sort(people);

        // печатаем данные
        printData(people);
    }

    public static void printData(List<Person> people) {
        for (Person p : people) {
            System.out.printf("%s earns %.2f tenge\n", p.toString(), p.getPaymentAmount());
        }
    }
}
