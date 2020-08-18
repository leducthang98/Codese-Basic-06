public class Lesson08 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2}; // sap xep giam dan: neu 2 so lien ke nhau, so ben trai < so ben phai => doi cho

        // duyet 4 lan mang: lan1: 4321, lan 2 432 lan 3 43, lan 4 4

        for (int i = 0; i < 4; i++) {
            //[1342]
            //[134]
            for (int j = 0; j < 4 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // arr[j] = 1 arr[j+1] = 3
                    int temp = arr[j]; //temp = 1
                    arr[j] = arr[j + 1]; // arr[j] = 3
                    arr[j + 1] = temp; //arr[j+1] = 1
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
}

// \\45 21 5 3 1  ( phan tu truoc < phan tu sau => day xuong )


