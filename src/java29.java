public class java29 {
    static void courseTable(String name, String surname, String course, String year){
        System.out.printf("%s\t%s\t%s\t%s\n","Name","Surname","Course","Year");
        System.out.println("----------------------------");
        System.out.printf("%s\t%s\t%s\t%s\n",name,surname,course,year);
    }

    static void courseAltTable(String name, String surname, String course, String year){
        System.out.printf("%s\t%s\t%s\t%s\n","Name","Surname","Course","Year");
        System.out.println("----------------------------");
        System.out.printf("%4$s\t%3$s\t%2$s\t%1$s\n",name,surname,course,year);
    }
    public static void main(String[] args) {
        courseAltTable("Hector","Marcos","Java","2022");
    }
}