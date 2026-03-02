public class UC6 {

    // Helper methods for each character
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    public static String[] getP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        // Array initialization using helper methods
        String[][] word = { getO(), getO(), getP(), getS() };

        // Print banner
        for (int i = 0; i < 7; i++) {
            for (String[] letter : word) {
                System.out.print(letter[i] + "  ");
            }
            System.out.println();
        }
    }
}