class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> hm = new HashMap();

        int id = 0;
        for (String sc : strs) {
            char[] temp = sc.toCharArray();
            Arrays.sort(temp);
            String key = String.valueOf(temp);
            if (!hm.containsKey(key))
                hm.put(key, new ArrayList());
            hm.get(key).add(sc);
        }
        return new ArrayList(hm.values());
    }
}