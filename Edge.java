package Week3Day2;

public class Edge extends Browser {
    public void takeSnap() {
        System.out.println("Taken snap Successfully");
    }

    public void clearCookies() {
        System.out.println("Cookies Cleared Successfully");
    }


    public static void main(String[] args) {
        Edge objectnameedge = new Edge();
        objectnameedge.takeSnap();
        objectnameedge.clearCookies();
        objectnameedge.closeBrowser();
        objectnameedge.openurl();
        objectnameedge.navigateBack();
    }
}