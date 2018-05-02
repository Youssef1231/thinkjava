package chapter5;

public class Exercise4 {
    public Exercise4() {
        System.out.println("this is a constructor without parameter");
    }

    public Exercise4(String str) {

        System.out.println("this is a constructor with parameter: " + str);
    }


    public static void main(String[] args) {
        new Exercise4("we could be happy");
     }
}
