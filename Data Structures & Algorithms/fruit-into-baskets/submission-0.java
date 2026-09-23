class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> BasCount = new HashMap<>();
        int maxFruits = 0;
        int left = 0;
        
        for (int right = 0; right < fruits.length; right++) {  // .length not .length()
            BasCount.put(fruits[right], BasCount.getOrDefault(fruits[right], 0) + 1);  // Add BasCount.
            
            while (BasCount.size() > 2) {
                BasCount.put(fruits[left], BasCount.get(fruits[left]) - 1);  // Add BasCount.
                if (BasCount.get(fruits[left]) == 0) {
                    BasCount.remove(fruits[left]);
                }
                left++;  // ← INSIDE while loop
            }
            
            maxFruits = Math.max(maxFruits, right - left + 1);  // ← INSIDE for loop
        }
        
        return maxFruits;
    }
}