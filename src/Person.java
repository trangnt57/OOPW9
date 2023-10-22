import javax.xml.stream.FactoryConfigurationError;

public class Person {
    private String name;

    public Person(String _name){
        this.name = _name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name;
    }

    public boolean equals(Object o){
        if(o == null)
            return false;
        if(!(o instanceof Person))
            return false;
        Person p = (Person) o;
        return this.name.equals(p.getName());
    }

    public boolean equals(Person p){
        if(p == null)
            return false;
        return this.name.equals(p.getName());
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
}
