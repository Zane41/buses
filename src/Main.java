import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введи Н");
        int n = vvod.nextInt();
        System.out.println("Введи маршруты");
        int[] order = new int[n];
        for (int i = 0; i < n; i++)
            order[i] = vvod.nextInt();
        int maxTimer = 1, temp = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (j != n - 1) {
                    if (order[i] != order[j])
                        temp++;
                    else {
                        if (temp > maxTimer)
                            maxTimer = temp;
                        temp = 1;
                    }
                }
                else {
                    if (order[i] != order[j]) {
                        temp=1;
                    }
                    else {
                        if (temp > maxTimer) {
                            maxTimer = temp;
                            temp = 1;
                            }

                        }
                    }

            }
        }
        System.out.println(maxTimer);
    }
}