class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String result = "";
        for(String str : arr) {
            if(map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        List<String> resultList = new ArrayList<>();
        for(String key : map.keySet()) {
            if(map.get(key) == 1) {
                resultList.add(key);
            }
        }
        if(resultList.size() >= k) {
            result = resultList.get(k-1);
        }
            
        return result;
        
    }
}