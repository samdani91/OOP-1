 class Student extends Person{

     Student(String firstName, String lastName, int age) {
         super(firstName, lastName, age);
     }

     @Override
     public String getFullName(){
         return getFirstName()+","+getLastName();
     }
 }
