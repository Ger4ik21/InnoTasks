package javacore.facade;

public class Main {
    public static void main(String[] args) {
        UserManager userFacade = new UserManager();
        UserData userData = userFacade.getUserData("example");
    }
}
