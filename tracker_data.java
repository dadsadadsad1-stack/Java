import java.util.ArrayList;

public class tracker_data{
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>();
        ArrayList<String> std = new ArrayList<>();
        score.add(12); score.add(122); score.add(1212);
        std.add("trollvm");  std.add("larp");  std.add("retard");
        int total = 0;
        int high = score.get(0);
        for (int i = 0; i<score.size(); i++){
            if (score.get(i) > high){
                high = score.get(i);
            }
            total = total + score.get(i);
        }
         for (int meow = 0; meow<score.size(); meow++){
        System.out.println(std.get(meow) + " got " + score.get(meow));

     }
            double average = (double) total / score.size();
            System.out.println("The average is " + average);
            System.out.println("The highest score is " + high);

    
        


   
    }
}
