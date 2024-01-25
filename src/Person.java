public class Person implements Payable,Comparable<Person>{
    private int id;
    private static int id_gen = 1;
    public String name;
    public String surname;

    Person() {
        id = id_gen++;
    }
    // automatic id generator

    Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition(){
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person next) {
        return Double.compare(this.getPaymentAmount(), next.getPaymentAmount());
    }
    //compares first object with next object by amount of money they make
}