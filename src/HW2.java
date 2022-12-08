// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
// https://geekbrainspro.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.
// notion-static.com%2Fdc8fb574-7132-4c30-948b-a8ffa0e0400e%2FUntitled.png?table=block&id=fa2b7115
// -a0d0-4a24-884b-448d82ee9afa&spaceId=2d953187-2ecf-4a5c-9bdf-c2ed4aa196e4&width=2000&userId=&cache=v2

// public static int sum2d(String[][] arr) {
//     int sum = 0;
//     for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < 5; j++) {
//             int val = Integer.parseInt(arr[i][j]);
//             sum += val;
//         }
//     }
//     return sum;
// }


public class HW2 {
    public static void main(String[] args) {
        System.out.println(sum2d(new String[][]{{"0", "1", "2", "3", "4"}, {"4", "3", "2", "1", "0"}}));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
