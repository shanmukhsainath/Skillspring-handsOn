public class ProxyInternet implements Internet {
    private RealInternet realInternet;
    private String blockedSite;

    public ProxyInternet() {
        realInternet = new RealInternet();
        blockedSite = "games.com";
    }

    public void connectTo(String siteName) {
        // Proxy controls access before calling the real object.
        if (siteName.equalsIgnoreCase(blockedSite)) {
            System.out.println("Access denied for " + siteName);
        } else {
            realInternet.connectTo(siteName);
        }
    }
}
