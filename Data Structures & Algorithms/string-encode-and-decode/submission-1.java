class Solution {

    public String encode(List<String> strs) {
        StringBuilder st = new StringBuilder();
        for (String str : strs) {
            st.append(str).append("*.*"); 
        }
        System.out.println(st);
        return st.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        StringBuilder st = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '*' && chars[i+1] == '.' && chars[i+2] == '*') {
                i += 2;
                strs.add(st.toString());
                st = new StringBuilder();
            } else {
                st.append(chars[i]);
            }
        }
        return strs;
    }
}
