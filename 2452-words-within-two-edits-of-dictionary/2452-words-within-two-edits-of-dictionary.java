class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for (String query : queries) {
            for (String dic : dictionary) {
                int count = 0;
                for (int i = 0; i < query.length(); i++) {
                    if (query.charAt(i) != dic.charAt(i)) {
                        count++;
                    }
                }
                if (count <= 2) {
                    ans.add(query);
                    break;
                }
            }

        }
        return ans;
    }
}