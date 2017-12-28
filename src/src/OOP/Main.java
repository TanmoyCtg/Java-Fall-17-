package OOP;

public class Main {
    boolean x = true;
    int i = 1;
    void simple(){
        if (x){
            while (true){
                if (i %2 != 0){
                    System.out.println("Odd");
                }
                else{
                    System.out.println("Event");
                }
            }
        }

    }
    public static void main(String[] args) {
	// write your code here
        Main d = new Main();

    }
}
