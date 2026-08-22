class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if(len1!= len2){
            return false;
        }
        int a[] = new int[26];
        for(int i=0; i<len1; i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i =0 ; i<len2; i++){
            a[t.charAt(i)-'a']--;
        }

        for(int i=0 ; i < 26;i++){
            if(a[i] != 0){
                return false;
            }
        }

        return true;

    }
}
