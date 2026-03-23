class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = deck.length -1; i >= 0; i--){
            if(!dq.isEmpty()) dq.addFirst(dq.removeLast());

            dq.addFirst(deck[i]);

        }
        int ind = 0;
        
        for(int i = 0;i < deck.length; i++ ){
            deck[i] = dq.removeFirst();
        }
        return deck;
    }
}