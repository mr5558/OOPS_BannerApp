import java.util.HashMap;
import java.util.Map;

public class UC8 {

    public static void main(String[] args) {

        // Store character patterns using HashMap
        Map<Character, String[]> bannerMap = new HashMap<>();

        bannerMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        bannerMap.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        });

        bannerMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        String word = "OOPS";

        renderBanner(word, bannerMap);
    }

    public static void renderBanner(String word, Map<Character, String[]> bannerMap) {

        int height = bannerMap.get('O').length;

        for (int row = 0; row < height; row++) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                String[] pattern = bannerMap.get(ch);
                System.out.print(pattern[row] + "  ");
            }
            System.out.println();
        }
    }
}