import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person one=new Student("samdani","mozumder",22);
        Person two=new Student("Saimon","Bhuiyan",21);
        Person three=new Student("Partha","Devnath",15);

        Person e1=new Employee("Nafiz","Mahmood",26);
        Person e2=new Employee("Jahangir","Alam",60);
        Person e3=new Employee("Mamun","Mozumder",50);

        ArrayList<Person> input=new ArrayList<>();
        input.add(one);
        input.add(two);
        input.add(three);
        input.add(e1);
        input.add(e2);
        input.add(e3);

        University u=new University(input);

        System.out.println("Oldest person:"+"\n"+u.getOldestPerson());
        System.out.println("Youngest person:"+"\n"+u.getYoungestPerson());
        System.out.println("Voters list:"+"\n"+u.getVoters());
        System.out.println("Total employees:"+u.getNumberOfEmployees());
        System.out.println(u.getFullName());


    }
}
