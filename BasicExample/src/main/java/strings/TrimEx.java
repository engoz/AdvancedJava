package strings;

public class TrimEx {
    public static void main(String[] args) {
        String strWithSpaceTabNewline = " abc def   ghi jkl\n\n\n"
                + "mno    ";
        System.out.println(strWithSpaceTabNewline);
        String formattedStr01 = strWithSpaceTabNewline.replaceAll("\\s", " ");
        System.out.println(":" + formattedStr01 + ":");
    }
}
