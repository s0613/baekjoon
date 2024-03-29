import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CoordinateCompression_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N을 입력 받음
        int N = Integer.parseInt(br.readLine());

        // 좌표들을 저장할 배열
        int[] coords = new int[N];
        // 좌표의 압축 결과를 저장할 배열
        int[] result = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            coords[i] = Integer.parseInt(st.nextToken());
        }

        // 좌표들을 복사하여 정렬
        int[] sortedCoords = coords.clone();
        Arrays.sort(sortedCoords);

        // 중복을 제거하고 각 좌표에 대응하는 인덱스를 매핑
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int coord : sortedCoords) {
            if (!map.containsKey(coord)) {
                map.put(coord, index++);
            }
        }

        // 원본 좌표들에 대해 압축된 좌표 인덱스 찾기
        for (int i = 0; i < N; i++) {
            result[i] = map.get(coords[i]);
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
