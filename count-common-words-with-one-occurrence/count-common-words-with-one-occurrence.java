class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> word1Map = new HashMap<>();
        HashMap<String, Integer> word2Map = new HashMap<>();
        int result = 0;
        for(String word1 : words1) {
            if(word1Map.containsKey(word1)) {
                word1Map.put(word1, word1Map.get(word1) + 1);
            } else {
                word1Map.put(word1, 1);
            }
        }
        for(String word2 : words2) {
            if(word2Map.containsKey(word2)) {
                word2Map.put(word2, word2Map.get(word2) + 1);
            } else {
                word2Map.put(word2, 1);
            }
        }
        HashMap<String, Integer> resultMap = new HashMap<>();
        for(String key : word1Map.keySet()) {
            if(word1Map.get(key) == 1) {
                if(resultMap.containsKey(key)) {
                    resultMap.put(key, word2Map.get(key) + 1);
                } else {
                    resultMap.put(key, 1);
                }
            }
        }
        for(String key : word2Map.keySet()) {
            if(word2Map.get(key) == 1) {
                if(resultMap.containsKey(key)) {
                    resultMap.put(key, word2Map.get(key) + 1);
                } else {
                    resultMap.put(key, 1);
                }
            }
        }
        for(String key : resultMap.keySet()) {
            if(resultMap.get(key) == 2)
                result++;
        }
        return result;
        
    }

}