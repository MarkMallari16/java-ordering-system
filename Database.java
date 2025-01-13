package mallari_markchristian_g_2;

import java.util.HashMap;

public class Database {

    public static HashMap<Integer, String[]> userDb = new HashMap<Integer, String[]>();
    public static HashMap<Integer, String[]> productDb = new HashMap<Integer, String[]>();
    public static HashMap<Integer, String[]> orderDb = new HashMap<Integer, String[]>();

    public static void addAdmin() {
        int adminId = 1000;
        String[] adminRegInfos = {"", "", "admin", "admin123", "admin"};
        userDb.put(adminId, adminRegInfos);
    }
}
