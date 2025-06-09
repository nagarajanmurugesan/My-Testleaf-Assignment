package Week3Day2;

public class Safari extends Browser {
    public void readerMode() {
        System.out.println("ReaderMode Activated");
    }

    public void fullScreenMode() {
        System.out.println("FullScreenMode Activated");
    }

    public static void main(String[] args) {
        Safari objectnamesafari = new Safari();
        objectnamesafari.fullScreenMode();
        objectnamesafari.readerMode();
        objectnamesafari.navigateBack();
        objectnamesafari.openurl();
        objectnamesafari.closeBrowser();
    }
}
