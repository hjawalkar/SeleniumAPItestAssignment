package pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeSuite;
import utilities.ConfigReader;
import utilities.ConfigWriter;

/*Blaze demo browser automation
 * Created script by Hanumanth 
 * Date:06-10-2021
 */
public abstract class BasePage {

    public WebDriver driver;
    private static Logger _log = LoggerFactory.getLogger(BasePage.class);

    //Constructor
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    @BeforeSuite(alwaysRun = true)
    void Config() {
        ConfigWriter.setPropertyValue("logger.file", "webLogger", ConfigReader.get("config.path"));
    }
}
