class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] chars = t.toCharArray();
    
    for (int i = 0; i < s.length(); i++) {
        char needed = s.charAt(i);
        boolean found = false;
    
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] == needed) {
                chars[j] = '*';  
                found = true;
                break;
            }
        }
        if (!found) {
            return false;
        }
    }
    
    return true;
    }
}
