public class Main {
    public static void main(String[] args) {
        Internet officeInternet = new ProxyInternet();

        officeInternet.connectTo("cognizant.com");
        officeInternet.connectTo("games.com");
    }
}
