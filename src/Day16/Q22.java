package Day16;

import java.util.HashMap;

public class Q22 {
    public static boolean isMember(HashMap<String, String> member, String username, String password) {
        //TODO..
        if(member == null) return false;

        String pwd = member.getOrDefault(username, null);
        if(pwd == null) return false;

        return password.equals(pwd);
    }
}
