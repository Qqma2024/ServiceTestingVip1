public class WeworkConfig {
    public String userName="admin";
    public String password="1234";

    private static WeworkConfig weworkConfig;
//    单列模式
    public static WeworkConfig getInstance(){
        if (weworkConfig == null) {
            weworkConfig=new WeworkConfig();
        }
        return weworkConfig;
    }
}
