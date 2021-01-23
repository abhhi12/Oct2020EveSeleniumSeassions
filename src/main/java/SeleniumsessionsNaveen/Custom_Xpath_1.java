package SeleniumsessionsNaveen;

public class Custom_Xpath_1 {

	public static void main(String[] args) {
		//xpath: is a locator
		//two types of xpath:
			//1. absolute xpath:from the parent to child via hierarchy
				///html/body/header/nav/div/div/ul/li[5]/a --risky xpath
			//2. relative xpath: xpath using xpath functions, attribute
					//(custom xpath)
		
		//htmltag[@attr = 'value']
		//input[@id='username']
		//input[@type='email']
		
		//htmltag[@attr1 = 'value' and @attr2 = 'value']
		//input[@id='username' and @type='email']
		//input[@id and @type]
		//input
		//a
		
		//contains():
		//dynamic id:
		//<input "id" = "test_123">
		//<input "id" = "test_133">
		//<input "id" = "test_143">

		//tag[contains(@attr,'value')]
		//input[contains(@id,'username')]
		//input[contains(@id,'user')]
		//input[contains(@id,'test_')]
		
		//aygi-origin-airport
		//KjRP-origin-airport
		//c5W7P-origin-airport
		//input[contains(@id,'-origin-airport')]
		//input[contains(@id,'user') and @type='email']
		//input[contains(@id,'user') and contains(@type,'email')]
		
		//contains() with text():
		//h3[contains(text(),'Companies & Contacts')]	
		//h3[contains(text(),'Companies')]
		//h3[text()='Contact Management']
		//a[text()='Pricing']
		
		//starts-with():
		//h3[starts-with(text(),'Contact')]
		//input[starts-with(@name,'user')]
		
		//parent to child:
		//ul[@class='nav navbar-nav navbar-right']/li/a
		//ul[@class='list-unstyled']//child::li//child::a
		//ul[@class='list-unstyled']//child::li
		
		//ul[@class='footer-nav']//a
		
		//By ele = By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a");--right
		//By ele1 = By.className("nav navbar-nav navbar-right"); --wrong
		//input[@class='form-control private-form__control login-email']
		
		//indexing in xpath:
		// (//div[@class='private-form__input-wrapper']/input)[1]
		//By.xpath("(//div[@class='private-form__input-wrapper']/input)[1]");
		// (//ul[@class='list-unstyled']/li/a)[1]
		// (//ul[@class='list-unstyled']/li/a)[position()=1]
		// (//h3)[19]
		
		//child to parent:
		//backward traversing in xpath: using /..
		//a[text()='Customers']/../../../../../../../..
		//input[@id='username']//parent::div
		//input[@id='username']//ancestor::form

	}

}
