public static String findSmallestString(String word) {
        String smallest = word;
        int n = word.length();

        for (int k = 1; k <= n; k++) {
            String firstPartReversed = new StringBuilder(word.substring(0, k)).reverse().toString() + word.substring(k);
            String lastPartReversed = word.substring(0, n - k) + new StringBuilder(word.substring(n - k)).reverse().toString();

            if (firstPartReversed.compareTo(smallest) < 0) {
                smallest = firstPartReversed;
            }
            if (lastPartReversed.compareTo(smallest) < 0) {
                smallest = lastPartReversed;
            }
        }

        return smallest;
    }

