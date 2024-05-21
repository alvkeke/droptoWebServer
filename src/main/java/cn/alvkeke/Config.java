package cn.alvkeke;

public class Config {

    public static final String apiBase = "/api/";
    public static String getApiPath(String name) {
        return apiBase + name + "/";
    }
}
