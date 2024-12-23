package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="UIConnect"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(xpath = "//textarea[@title='Search']")
	public WebElement q_Textarea;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='University of ProvarUniversity of Provarhttps://provar.me']")
	public WebElement UniversityOfProvar;
			
}
