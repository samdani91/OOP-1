public class Person {
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName(){
        return firstName+" "+lastName;
    }

    public boolean canVote(){
        if(age>=18) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Name:"+getFullName()+" "+"Age:"+age;
    }
}
