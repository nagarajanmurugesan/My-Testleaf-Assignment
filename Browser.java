package Week3Day2;

public class Browser {
    public void openurl(){
        System.out.println("URL launched Successfully");
    }
    public void closeBrowser(){
        System.out.println("Browser closed Successfully");
    }
    public void navigateBack(){
        System.out.println("Navigated back Successfully");
    }

    public static void main(String[] args) {
        Browser functions = new Browser();
        functions.closeBrowser();
        functions.navigateBack();
        functions.openurl();
    }
}
