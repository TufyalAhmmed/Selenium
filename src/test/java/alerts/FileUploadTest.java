package alerts;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\IT BD\\Selenium\\resources\\chromedriver.exe");
       assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe","Uploaded");
    }
}
