class Employee3 {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return null;
    }
}

class Manager extends Employee3 {
    public String toString(){
        return null;
    }
}

class TeamMember extends Employee3 {
    public String toString(){
        return null;
    }
}

class TeamLeader extends TeamMember {
    public String toString(){
        return null;
    }
}

class Barista extends TeamMember {
    public String toString(){
        return null;
    }
}

public class Java36 {
}
