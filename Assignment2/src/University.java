import java.util.ArrayList;
import java.util.Comparator;

public class University {
    private ArrayList<Person> persons=new ArrayList<>();

    University(ArrayList<Person>list){
        persons=list;
    }
    public String getFullName(){
        String result="";

        boolean flag=true;

        for(Person per:persons){
            if(flag){
                result=per.getFullName();
                flag=false;
                continue;
            }
            result=result+","+per.getFullName();
        }
        return result;
    }
    public Person getOldestPerson(){
        persons.sort(Comparator.comparing(Person::getAge).reversed());
        return persons.get(0);

    }
    public Person getYoungestPerson(){
        persons.sort(Comparator.comparing(Person::getAge));
        return persons.get(0);

    }

    public ArrayList<Person> getVoters(){
        ArrayList<Person> temp=new ArrayList<>();

        for(Person per: persons){
            if(per.canVote()) temp.add(per);
        }

        return temp;
    }

    public int getNumberOfEmployees(){
        int count=0;
        for(Person per:persons){
            if(per.getFullName().endsWith("(Employee)")){
                count++;
            }
        }
        return count;
    }
}
