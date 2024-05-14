package collectionframework.assignment;

public class Employee{
    String name;
    int age;
    String country;
    Employee(String name,int age,String country){
        this.name=name;
        this.age=age;
        this.country=country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }

    public String getCountry(){
        return country;
    }


}
