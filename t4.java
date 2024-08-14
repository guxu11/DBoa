public int solution(int[] numbers, int k) {
        int n = numbers.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            int pairs = 0;
            for (int j = i; j < n; j++) {
                frequencyMap.put(numbers[j], frequencyMap.getOrDefault(numbers[j], 0) + 1);
                if (frequencyMap.get(numbers[j]) % 2 == 0) {
                    pairs++;
                }
                if (pairs >= k) {
                    count++;
                }
            }
        }

        return count;
    }
