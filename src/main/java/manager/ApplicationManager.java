package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    HelperUser helperUser;
    HelperContact contact;

    public void init(){
        wd=new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        helperUser = new HelperUser(wd);
        contact = new HelperContact(wd);

    }

    public void stop(){
       // wd.quit();
    }

    public HelperUser getHelperUser() {
        return helperUser;
    }

    public HelperContact contact() {
        return contact;
    }
}
