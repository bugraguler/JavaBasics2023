package com.classes.class025;

public interface WebDriver {
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();
}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Chrome driver opens browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome driver closes browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome driver maximize the window");
    }
}

class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Firefox driver opens browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox driver closes browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Firefox driver maximize the window");
    }
}

class TaskTester {
    public static void main(String[] args) {
        /*WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.openBrowser();
        chromeDriver.maximizeWindow();
        chromeDriver.closeBrowser();
        WebDriver firefoxDriver= new FirefoxDriver();
        firefoxDriver.openBrowser();
        firefoxDriver.maximizeWindow();
        firefoxDriver.closeBrowser();
         */
    WebDriver webDriver[]={new ChromeDriver(),new FirefoxDriver()};
        for (WebDriver w:webDriver) {
            w.openBrowser();
            w.maximizeWindow();
            w.closeBrowser();
        }

    }
}