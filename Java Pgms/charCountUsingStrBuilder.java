// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static String countString(String str) {
        // [] charArr = new char[2*str.length()];
        StringBuilder res = new StringBuilder();
        int count = 1, j = 0;
        for (int i=0;i<str.length()-1;i++) {
            if (str.charAt(i)==str.charAt(i+1)) {
                count++;
            }
            else {
                // charArr[j] = Character.forDigit(count, 10);
                // charArr[j+1] = str.charAt(i);
                // j+=2;
                res.append(count).append(str.charAt(i));
                count = 1;
            }
        }
        
        // charArr[j] = Character.forDigit(count, 10);
        // charArr[j+1] = str.charAt(str.length()-1);
        
        res.append(count).append(str.charAt(str.length()-1));
        
        
        // return new String(charArr);
        return res;
     }
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String input = "HHAAIIIOOOOO";
        System.out.println(countString(input));
    }
}