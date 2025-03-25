package de.exercises.zeichenketten;

public class StringBuilder_2 {
    public static void main(String[] args) {
        StringBuilder tabelleHTML = new StringBuilder();
        tabelleHTML.append("<table>\r\n");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                tabelleHTML.append("   <tr bgcolor=\"#cccccc\">\r\n");
            } else {
                tabelleHTML.append("   <tr bgcolor=\"#ffffff\">\r\n");
            }

            tabelleHTML.append("     <td>Row" + i + "</td>\r\n");
            tabelleHTML.append("     <td>xxxxxx</td>\r\n");
            tabelleHTML.append("   <tr>\r\n");
        }

        tabelleHTML.append("</table>\r\n");

        System.out.println(tabelleHTML.toString());
    }
}
