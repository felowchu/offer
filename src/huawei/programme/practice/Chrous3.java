package huawei.programme.practice;

import java.util.Scanner;

public class Chrous3 {
    public static void main(String[] aStrings) {
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(Main2.class.getClassLoader().getResourceAsStream("data2.txt"));
        while (scanner.hasNext()) {
            // �ܵ�Ǯ��
            int total = scanner.nextInt();
            // ϣ��������Ʒ�ĸ���
            int num = scanner.nextInt();
            // ÿ����Ʒ�ļ۸�
            int[] price = new int[num + 1];
            // ÿ����Ʒ��Ȩ��
            int[] value = new int[num + 1];
            // ���������Ǹ���
            int[] check = new int[num + 1];

            // ÿһ������0
            price[0] = 0;
            value[0] = 0;
            check[0] = 0;

            // ��ȡ��������
            for (int i = 1; i <= num; i++) {
                price[i] = scanner.nextInt();
                value[i] = scanner.nextInt();
                check[i] = scanner.nextInt();
            }

            // �������
            // �д�����Ʒ�������д���Ǯ��
            int[][] result = new int[num + 1][total + 1];
            // ��һ�и�0
            for (int j = 0; j <= num; j++) {
                result[j][0] = 0;
            }

            for (int i = 1; i <= total; i++) {
                for (int j = 1; j <= num; j++) {

                    // ����Ǹ���
                    if (check[j] > 0) {

                        // result[j-1][i-price[j]] ��ʾʹ��i-price[j]����Ǯ���������j-1����Ʒ�����ֵ

                        // �ܵ�Ǯ����(��ǰ��Ʒ+��������)����Ҫ��Ǯ��
                        if (i > price[j] + price[check[j]]) {
                            int w = result[j - 1][i - price[j]] + value[j] * price[j];
                            result[j][i] = w > result[j - 1][i] ? w : result[j - 1][i];
                        }

                    } else {
                        // ��Ǯ������������
                        if (i >= price[j]) {
                            int w = result[j - 1][i - price[j]] + value[j] * price[j];
                            result[j][i] = w > result[j - 1][i] ? w : result[j - 1][i];
                        }
                    }

                }
            }
            System.out.println(result[num][total]);
        }
        scanner.close();
    }
}
