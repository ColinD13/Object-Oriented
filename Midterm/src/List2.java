import java.util.Arrays;

public class List2 {
    public static void main(String[] args) {
        Food[] foods = new Food[5];

        foods[0]= new Food("Hotdog",200);
        foods[1]= new JunkFood("Chocolate",250,200,100);
        foods[2]= new Food("Wrap",100);
        foods[3]= new JunkFood("Pizza",300,200,100);
        foods[4]= new Food("Salad",50);

        for (int i = 0; i < foods.length - 1; i++) {
            for (int j = 0; j < foods.length - i - 1; j++) {
                if (foods[j].getCalories() > foods[j + 1].getCalories()) {
                    // swap arr[j+1] and arr[j]
                    Food temp = foods[j];
                    foods[j]=foods[j+1];
                    foods[j + 1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(foods));
    }
}
