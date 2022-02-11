package utilities;

import java.util.Set;

public class SeleniumUtils {
    public void switchWindow(){
        String currentWindow = WebDriverUtils.getDriver().getWindowHandle();
        Set<String> allWindows = WebDriverUtils.getDriver().getWindowHandles();

        for(String eachWindow : allWindows){
            if(!eachWindow.equals(currentWindow)){
                WebDriverUtils.getDriver().switchTo().window(eachWindow);
            }
        }
    }
}
