import java.util.ArrayList;

public class Other {

    public void printAlpha(char[] charArray) {
        for(int i = 0 ; i < charArray.length ; i ++) {
            System.out.println(charArray[i]);
        }
    }

    // generate a list of a random size with numbers up to that number
    public ArrayList<Integer> addItUp(int x) {
        ArrayList<Integer> numbas = new ArrayList<Integer>();
        for(int i = 0 ; i <= x ; i ++) {
            numbas.add(i);
        }
        return numbas;
    }

}
