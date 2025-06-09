package Week3Day2;

public class Chrome extends Browser {
    public void openIncognito(){
        System.out.println("Incognito launched Successfully");
    }
    public void clearcache(){
        System.out.println("Cache Cleared Successfully");
    }

    public static void main(String[] args) {
        Chrome objectchrome =new Chrome();
        objectchrome.clearcache();
        objectchrome.openIncognito();
        objectchrome.navigateBack();
        objectchrome.closeBrowser();
        objectchrome.openurl();

    }
}
