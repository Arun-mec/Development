class Main {
    public static void main(String[] args) {
        
        String str = "HAI";
        str = encrypt(str, 3);
        System.out.println(str);
        
    }
    
    public static String encrypt(String input, int idx) {
        int nwIdx = idx % 26;
        char[] charArr = new char[input.length()];
        
        for(int i=0; i<input.length();i++) {
            int letterPsn = input.charAt(i) + nwIdx;
            if (letterPsn>122) {
                letterPsn = 97+ (letterPsn%122);
            }
            
            charArr[i] = (char) letterPsn;
        }
        
        return new String(charArr);
    }
    
}