enum Professions {
    BACK_END_DEVELOPER,
    FRONT_END_DEVELOPER,
    FULL_STACK_DEVELOPER
}

class Developer{
    String name;
    String surname;
    int age;
    String id;
    String role;

    public Developer(String name, String surname, int age, String id, String role) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.role = role;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}



public class Java44 {

    void checkRole(Developer dev){
        if(dev.getRole() == "FULL_STACK_DEVELOPER" || dev.getRole() == "BACK_END_DEVELOPER"){
            System.out.println(dev.getName()+" Viva el Back");
        }
        if(dev.getRole() == "FRONT_END_DEVELOPER"){
            System.out.println(dev.getName()+" JS es una 💩 es mejor utlizar TypeScript");
        }
    }

    public static void main(String[] args) {
        Developer Hector = new Developer("Hector", "Marcos", 33, "111111111A", Professions.FULL_STACK_DEVELOPER.toString());
        Developer Pedro = new Developer("Pedro", "Asdf", 30,"111111111A", Professions.BACK_END_DEVELOPER.toString());
        Developer Celia = new Developer("Celia", "Fdsa", 24, "111111111A", Professions.FRONT_END_DEVELOPER.toString());
        Java44 java44 = new Java44();
        java44.checkRole(Hector);
        java44.checkRole(Pedro);
        java44.checkRole(Celia);
    }
}
