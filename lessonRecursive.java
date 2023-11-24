import java.util.*;

public class lessonRecursive {
    public static int calculateStringLength(String str) {
        
        if (str.isEmpty()) {
            return 0;
        } else {
           
            return 1 + calculateStringLength(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String myString = "meirbek";
        int length = calculateStringLength(myString);
        System.out.println("length of the string: " + length);
		}
}