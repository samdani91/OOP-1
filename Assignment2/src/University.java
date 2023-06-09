import java.util.ArrayList;

public class University {
    private ArrayList<Person> persons;

    University(ArrayList<Person>persons){
        this.persons=persons;
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
        int max=0;
        Person output = null;
        for(Person per:persons){
            if(per.getAge()>max){
                max=per.getAge();
                output=per;
            }
        }
        return output;


    }
    public Person getYoungestPerson(){
        int min=Integer.MAX_VALUE;
        Person output = null;
        for(Person per:persons){
            if(per.getAge()<min){
                min=per.getAge();
                output=per;
            }
        }
        return output;

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
