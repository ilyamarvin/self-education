public class WhileLoops {
    public static void main(String[] args) {
        boolean t = true;
        int i = 1;

        while (t) {
            System.out.println("Iteration = " + i);
            if (i != 5) {
                i++;
            } else {
                t = false;
            }
        }

        // Цикл for
        int j = 1;
        while (j<=10) {
            System.out.println("Hello " + j);
            j++;
        }
    }
}
