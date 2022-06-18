class Person {
    String name;
    String surname;
    String document;
    String type;

    public Person(String name, String surname, String document, String type) {
        this.name = name;
        this.surname = surname;
        this.document = document;
        this.type = type;
    }
}

class Client extends Person {
    String category;
    String code;

    public Client(String name, String surname, String document, String type) {
        super(name, surname, document, type);
    }

    public void generateCode(){
        System.out.println("Your code: 43242432");
    }
}

class Employee2 extends Person {
    String contract;
    float salary;
    public void getSalary(){
        System.out.println("His salary is "+salary);
    }

    public Employee2(String name, String surname, String document, String type, String contract, float salary) {
        super(name, surname, document, type);
        this.contract = contract;
        this.salary = salary;
    }
}


public class Java35 {

}
