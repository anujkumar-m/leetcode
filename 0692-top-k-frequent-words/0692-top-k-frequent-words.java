class Pair{
    String str;
    int count;
    Pair(String str, int count){
        this.str = str;
        this.count = count;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.count != b.count){
                return b.count - a.count;
            }
                return (a.str).compareTo(b.str);
        });
        for(String str : map.keySet()){
            pq.add(new Pair(str, map.get(str)));
        }

        List<String> ans = new ArrayList<>();
        for(int i = 0; i < k; i++){
            ans.add(pq.poll().str);
        }
        return ans;
    }
}