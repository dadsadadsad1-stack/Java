public class footballer {
    public static void main(String[]args){
       
  footballer meow = new footballer();
  meow.name = "Ronaldo";
  meow.issaving = true;
  meow.position = "Goalkeeper";
  meow.age = 40;

  meow.name();
meow.detail();


footballer meow2 = new footballer();
meow2.name = "Messi";
meow2.issaving = false;
meow2.position = "Striker";
meow2.age = 35;

meow2.name();
meow2.detail();

    }

}

class footballer{
    String name;
    boolean issaving;
    String position;
    int age;

    void name(){
        System.out.println("player name is " + name);

    }

    void detail(){
        System.out.println("The player is a " + position + " and is " + age + " years old.");
    }

}
