import java.util.*;

class Problem4 {
    public static void main(String[] args) {
       
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        
        System.out.print("{");
        boolean first = true;
        for (int key : countMap.keySet()) {
            if (!first) System.out.print(", ");
            System.out.print(key + ": " + countMap.get(key));
            first = false;
        }
        System.out.println("}");
    }
}
