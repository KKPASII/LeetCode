class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);

            String key = new String(charArr);

            if (map.containsKey(key)) {
                map.get(key).add(str);
            }
            else {
                // map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}