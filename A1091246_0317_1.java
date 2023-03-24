import java.util.Scanner;

public class A1091246_0317_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取 n 和 m
        System.out.print("請輸入 n：");
        int n = scanner.nextInt();
        System.out.print("請輸入 m：");
        int m = scanner.nextInt();

        // 建立二維陣列並儲存數值
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }

        // 使用 for-each 迴圈讀出陣列內的資料
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


