
public class  inheritance {
    public static void main(String[]args){
        luraph meow = new luraph("troll",14,"larper", "memorycorruption");
        retard meow2 = new retard("retard", 12, "dad", true);
        meow.detail();
        meow.name();
        meow2.detail();
        meow2.name();



    }
}

class footballer {
    String name;
    int age;
    String team;
    boolean isRetard;

    footballer(String name, int age, String team, boolean isRetard) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.isRetard = isRetard;
    }

    void detail() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    void name() {
        System.out.println("Player: " + name);
    }
}

class luraph extends footballer {
    String skill;
    luraph(String name, int age, String team, String skill) {
        super(name, age, team, false);
      
    }

    void detail() {
        System.out.println(name + " this guy is obfuscating"  );
    }
}    

class retard extends footballer {
    String skill;
    retard(String name, int age, String team, boolean isRetard) {
        super(name, age, team, isRetard);
    }

    void detail() {
        System.out.println("Is this guy retard ? " + isRetard);
    }
}
