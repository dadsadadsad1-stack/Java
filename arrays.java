public class arrays {
    public static void main(String[]args){
       
    int[] meow_age = {5, 99, 23, 47, 12};
     int biggest = meow_age[0];
   for (int i=1; i < meow_age.length; i++){
    if (meow_age[i] > biggest){
        biggest = meow_age[i];
    }
   }
    System.out.println("the biggest is " + biggest);
    }
}
