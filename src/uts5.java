
public class uts5 {
    public static String combineStrings(String str1, String str2, String str3) {
        StringBuilder combinedString = new StringBuilder();
        int length = str1.length();
        
        for (int i = 0; i < length; i++) {
            combinedString.append(str1.charAt(i));
            combinedString.append(str2.charAt(i));
            combinedString.append(str3.charAt(i));
        }
        
        return combinedString.toString();
    }
    
    public static void main(String[] args) {
        String result = combineStrings("aa", "bb", "cc");
        System.out.println(result);  
    }
} 

