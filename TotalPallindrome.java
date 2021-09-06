import java.util.*;

class TotalPallindrome {

    static boolean isPallindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String... args) {
        String str = "malayalam";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                if (isPallindrome(ss) == true) {
                    if (map.containsKey(ss)) {
                        map.put(ss, map.get(ss) + 1);
                    } else {
                        map.put(ss, 1);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            System.out.println(key + " " + entry.getValue());
        }

    }
}
