package conekta.io.utils;

public class Utils {

    /**
     * Abbreviate an validate de param "next" for the pagination
     *
     * @param next The next page of the customers to be retrieved.
     * @return The next page of the customers to be retrieved.
     */
    public static String nextPage(String next) {
        return (next != null ? next : "");
    }
}
