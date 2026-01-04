public class Person implements Payable, Comparable<Person> {

    protected static int nextId = 1;

    protected int id;
    protected String name;
    protected String surname;

    public Person() {
        this.id = nextId++;
    }

    public Person(String name, String surname) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Person";
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public int compareTo(Person other) {
        // сортировка по убыванию дохода
        return Double.compare(other.getPaymentAmount(), this.getPaymentAmount());
    }
}

