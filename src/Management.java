import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Management {
    public static void main(String[] args){
        Person p1 = new Person("A");
        Person p2 = new Person("B");
        Person p3 = new Person("A");

        ArrayList<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(p1);
        listOfPerson.add(p2);
        listOfPerson.add(p3);


        Management mn = new Management();
        mn.printList(listOfPerson);
        System.out.println("--------------------");
        listOfPerson = mn.removeDuplicate(listOfPerson);
        mn.printList(listOfPerson);
    }

    public void printList(ArrayList<Person> listOfPerson){
        for (Person p: listOfPerson) {
            System.out.println(p);
        }
    }

    public ArrayList<Person> removeDuplicate(ArrayList<Person> listOfPerson){
        HashSet<Person> unique = new HashSet<>(listOfPerson);
        listOfPerson.clear();
        listOfPerson.addAll(unique);
        return listOfPerson;
    }
}

