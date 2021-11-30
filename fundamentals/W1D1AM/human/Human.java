package human;
public class Human {

    public void hello() {
        System.out.println("You made a human!");
    }

    public String goodbye() {
        System.out.println("You lost a human!");
        return "Goodbye!";
    }

    public boolean isEqual(String x, String y){
        if(x.equals(y)) {
            return true;
        }
        return false;
    }

    // function isEqual(x,y) {
    //     if(x == y) {
    //         return true;
    //     }
    //     return false;
    // }
}
