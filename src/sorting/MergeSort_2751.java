package sorting;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort_2751 {
    private static void merge(int[] arr, int left, int middle, int right) {
        // 합병할 두 개의 부분 배열의 크기 계산
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // 임시 배열 생성
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // 임시 배열에 데이터 복사
        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[middle + 1 + j];

        // 두 부분 배열을 합병하여 정렬된 배열로 만듦
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // 남은 요소들을 복사
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // 합병 정렬을 위한 재귀적 메서드
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // 중간 지점 계산
            int middle = (left + right) / 2;

            // 왼쪽과 오른쪽 부분 배열을 재귀적으로 정렬
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // 정렬된 부분 배열들을 합병
            merge(arr, left, middle, right);
        }
    }

    // 합병 정렬을 호출하는 메서드
    public static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    // 배열 출력을 위한 메서드

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i = 0; i < n; i++){
            bufferedWriter.write(String.valueOf(arr[i]));
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
    }
}
