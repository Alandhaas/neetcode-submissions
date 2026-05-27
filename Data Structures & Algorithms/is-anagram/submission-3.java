class Solution {
    public boolean isAnagram(String s, String t) {
        //char[] a=s.toCharArray();
        //char[] b=t.toCharArray();
        //Arrays.sort(a);
        //Arrays.sort(b);
        //return Arrays.equals(a,b);

        if(s.length() != t.length()) return false;

        Hashtable<Character, Integer> hss = new Hashtable<>();
        Hashtable<Character, Integer> hst = new Hashtable<>();

        for (char c : s.toCharArray()) {
            if (!hss.containsKey(c)) {
                hss.put(c, 1);
            } else {
                hss.put(c, hss.get(c) + 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (!hst.containsKey(c)) {
                hst.put(c, 1);
            } else {
                hst.put(c, hst.get(c) + 1);
            }
        }

        for (Character key : hss.keySet()) {
            if(!hss.get(key).equals(hst.get(key))) {
                return false;
            }
        }
        return true;
    }
}
