/**
 * Created by jcarter on 15/12/15.
 */
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        String port = System.getenv().get("PORT");
        int int_port = Integer.parseInt(port);
        port(int_port);
        get("/hello", (req, res) -> "Hello gradle");
    }
}

