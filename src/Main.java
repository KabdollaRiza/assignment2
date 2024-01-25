import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        //to insert all the students and employees to this list

        persons.add(new Employee("John","Lennon","empolyee",27045.78));
        persons.add(new Employee("George","Harrison","employee",50000.00));
        persons.add(new Employee("Diana","Kabdolla","Political Scientist",500000));
        persons.add(new Student("Ringo","Starr",2.65));
        persons.add(new Student("Paul","McCartney",3.2));
        persons.add(new Student("Riza","Kabdolla",2.9));
        //adding to array list


        Collections.sort(persons);
        //this method sorts the objects by the amount of money that they make

        printData(persons);
        //calling the method to print data
    }

    public static void printData(Iterable<Person> iterable){
        for(Person person: iterable){
            System.out.println(person.toString()+ " earns " + person.getPaymentAmount());
        }
    }
    //method to print data
}