package api;

import api.Jersey.*;
import config.Config;
import endpoints.Endpoints;

import javax.ws.rs.core.Form;

public class UsersApiClient {

    static String mergedURL(String s, String s1) {
        return String.join("/", s, s1);
    }

    static String mergedURL(String s, String s1, String s2) {
        return String.join("/", s, s1, s2);
    }

    public static boolean get_list_users() {
        return request.get(mergedURL(Config.BASE_URL, Endpoints.USERS_URL)).status();
    }

    public static boolean get_one_user(int id) {
        return request.get(mergedURL(Config.BASE_URL, Endpoints.USERS_URL, String.valueOf(id))).status();
    }

    public static boolean get_register_user(Form user) {
        return request.get(mergedURL(Config.BASE_URL, Endpoints.USERS_URL)).status();
    }

    public static boolean post_create_user(Form user) throws Exception {
        return new post(mergedURL(Config.BASE_URL, Endpoints.USERS_URL)).status(user);
    }

    public static boolean post_register_user(Form user) throws Exception {
        return new post(mergedURL(Config.BASE_URL, Endpoints.REGISTER_URL)).status(user);
    }

    public static boolean post_register_user_unsuccessful(Form user) throws Exception {
        return new post(mergedURL(Config.BASE_URL, Endpoints.REGISTER_URL)).status(user);
    }

    public static boolean put_update_user(Form user, int id) {
        return new put(mergedURL(Config.BASE_URL, Endpoints.USERS_URL, String.valueOf(id))).status(user);
    }

    public static boolean patch_update_user(Form user, int id) throws Exception {
        return new patch(mergedURL(Config.BASE_URL, Endpoints.USERS_URL, String.valueOf(id))).status(user);
    }

    public static boolean delete_user(int id) {
        return new delete(mergedURL(Config.BASE_URL, Endpoints.USERS_URL, String.valueOf(id))).status();
    }
}
