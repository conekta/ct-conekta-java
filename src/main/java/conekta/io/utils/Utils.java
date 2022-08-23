package conekta.io.utils;

public class Utils {

    /**
     * Abbreviate an validate de param "next" for the pagination
     *
     * @param next
     * @return
     */
    public static String nextPage(String next) {
        return (next != null ? next : "");
    }
}
