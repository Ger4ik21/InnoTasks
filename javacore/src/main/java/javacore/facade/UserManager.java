package javacore.facade;

public class UserManager {
    private ApiManager apiManager;
    private CacheManager cacheManager;

    public UserManager() {
        apiManager = new ApiManager();
        cacheManager = new CacheManager();
    }

    public UserData getUserData(String userId) {
        UserData userData = cacheManager.getUserData(userId);
        if (userData == null) {
            userData = apiManager.getUserData(userId);
            cacheManager.saveUserData(userId);
        }
        return userData;
    }
}
