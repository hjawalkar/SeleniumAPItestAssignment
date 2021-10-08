package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*Blaze demo browser automation
 * Created script by Hanumanth 
 * Date:06-10-2021
 */
public class HelperUtil {

    private WebDriver driver;

    public HelperUtil(WebDriver driver){
        this.driver = driver;
    }

    public void navigatePage(String url) {
        driver.get(url);
    }

    public void selectByValue(WebElement dropDownWebElement, String value) {
        //Select by value text on the dropDownWebElement
        LogUtil.debug("[DEBUG] Selecting the drop-down based on the value: '"+value+"', on the WebElement: "+dropDownWebElement);
        Select select = new Select(dropDownWebElement);
        select.selectByValue(value);
    }
}
