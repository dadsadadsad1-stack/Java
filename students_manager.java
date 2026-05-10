import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;


public class students_manager{
    public static void main(String[]args){
  try{     
Studentsmanager meow = new Studentsmanager();
meow.addstudent(new Student("retard",12,12.0));
meow.addstudent(new Student("larp",12,12.0));
meow.addstudent(new Student("trollvm",12,12.0));



System.out.println("MEOW --- ALL STUDENTS --- MEOW");
meow.printall();

System.out.println("---HERE OUR LARPERRR---");
Student found = meow.findstudent("larp");
if ( found != null ){
    found.display();
}


System.out.println("----CLASSS AVERAGEEE----");
System.out.println("here is average of students in this class " + meow.getavg());

System.out.println("---removing retard---");
meow.removestudent("retard");

System.out.println("---- FINAL REPORT OF STUDENTS IN THIS CLASS ----");
meow.printall();
meow.save_to_file();
  } catch(Exception e){
    System.out.println("Something went wrong meowww please check the student hasmap properly for an bug or syntax error fuck you  "+ e.getMessage());
  }
 

}
}
abstract class person {
    String name;
    int age;

    person(String name, int age){
    this.name = name;
    this.age = age;
    }

    public String  getname(){
        return name ;
    }
    public int getage(){
        return age;
    }

    abstract void display();
}
    class Student extends person{
        private double grade;

        Student(String name , int age , double grade){
            super(name,age);
            this.grade = grade;

        }
        public double getgrade(){
            return grade;
        }

        public void display(){
            System.out.println(
            "Name: " + name + 
            " Age: " + age + 
            " Grade: " + grade);
        }

    }


    interface Manageable{
        void addstudent(Student s);
        void removestudent(String name);
        Student findstudent(String name );
        void printall();
        double getavg();
    }


    class Studentsmanager implements Manageable {
        private HashMap <String, Student> students = new HashMap<>();
        

        public void addstudent(Student s){
            students.put(s.getname(),s);
          System.out.println("added " + s.getname() + " to the class " +" total "+ students.size()); 
        }
  public void removestudent(String name){
    if (students.containsKey(name)){
        students.remove(name);
        System.out.println("student removed");
    }  else{
            System.out.println("student not found");
        }
    
    }
     public Student findstudent(String name){
        return students.get(name);
     }
 
     public void printall(){
      if(students.isEmpty()){
        System.out.println("bradar i cant see any students");
        return;
      }
       
       for (String key : students.keySet()){
        students.get(key).display();
       }
     }
    

public double getavg(){
    double sum = 0;
    for(String key : students.keySet()){
        sum += students.get(key).getgrade();
    }
    return sum/students.size();


}

public void save_to_file(){

    try{
        FileWriter mywriter = new FileWriter("Students_report.txt");
        for (String key : students.keySet()){
            mywriter.write(students.get(key).getname()+"----"+students.get(key).getage()+"----"+students.get(key).getgrade()+"\n");
        }
        mywriter.close();
        System.out.println("Saved to file");
        } catch(IOException e){
            System.out.println("hmm well i think something went wrong while saving the report please check : "+ e.getMessage());
        }
    }
}


    
