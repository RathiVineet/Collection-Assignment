import java.util.ArrayList;

public class Ans1 {
    public static void main(String[] args) {
        ArrayList<Float> arr = new ArrayList<>();
        arr.add(12.25f);
        arr.add(23.56f);
        arr.add(234.00f);
        arr.add(34f);
        arr.add(50f);
        float sum = 0;
        for (Float f : arr) {
            sum += f;
        }
        System.out.println("Sum : " + sum);
    }
}
