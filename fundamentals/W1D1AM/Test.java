import human.Human;

public class Test {
	public static void main(String[] args) {
        
        System.out.println("Hello world!");
        System.out.println("Goodbye world!");
        
        Human mark = new Human();
        mark.hello();
        System.out.println(mark.isEqual("Mark", "Mark"));
	}
}
