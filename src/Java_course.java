import java.util.Random;

public class Java_course {

    public static void main(String args[]) {

        int[][] mas2d = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                mas2d[i][j] = rand.nextInt(100);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(mas2d[i][j] + " ");
            System.out.println();
        }
    }
}