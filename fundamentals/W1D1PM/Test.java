import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        
        String x = "Hello";
        
        Other other = new Other();
        // other.printAlpha(vowels);
        

        ArrayList<Integer> someNewList = other.addItUp(19);
        System.out.println(someNewList.get(5));
        System.out.println(Arrays.toString(alpha));











    }
}
