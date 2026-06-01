class Solution {
    public int similarPairs(String[] words) {
        HashMap<String, Integer> hs = new HashMap<>();

        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            StringBuilder sb = new StringBuilder();
            sb.append(arr[0]);

            for (int i = 1; i < arr.length; i++) {
                char w = arr[i];

                if (arr[i - 1] != w) {
                    sb.append(w);
                }
            }

            String key = sb.toString();
            hs.put(key, hs.getOrDefault(key, 0) + 1);
        }

        int answer = 0;

        for (int value : hs.values()) {
            answer += value * (value - 1) / 2;
        }

        return answer;
    }
}