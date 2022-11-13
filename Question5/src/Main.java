import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11};
        int[] values = {1,4,5,10};
        int[] output = getStartOfEachValues(arr, values);
        for (int i=0; i<output.length; i++){
            System.out.println(output[i]);
        }
    }

    // arr = [0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11]
    // values = [1,4,5,10]
    // output = [5, -1, 12, 17]
    private static int[] getStartOfEachValues(int[] arr, int[] values){
        int[] indexes = new int[values.length];
        Arrays.sort(values);
        int idx = 0;
        int arrIdx = 0;
        for (int i = 0; i < values.length; i++) {
            if (arrIdx > arr.length - 1) break;
            while (arr[arrIdx] < values[i]) {
                arrIdx++;
                if (arrIdx > arr.length - 1) break;
            }
            if (arr[arrIdx] == values[i]) {
                indexes[idx] = arrIdx;
                idx++;
            } else if (arr[arrIdx] > values[i]) {
                indexes[idx] = -1;
                idx++;
            }
        }
        return indexes;
    }
}