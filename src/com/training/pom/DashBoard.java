package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	private WebDriver driver; 
	
	public DashBoard(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[contains(text(),'User list')]")
	private  WebElement userList;
	
	@FindBy(xpath="//*[contains(text(),'qwerty@gmail.com')]/parent::td/following::td[4]/a/img[@title='Edit']")
	private  WebElement editIcon;
	
	@FindBy(xpath="//*[contains(text(), 'Add a user')]")
	private  WebElement addUser;
	
	@FindBy(id="firstname")
	private WebElement firstName;
	
	@FindBy(id="lastname")
	private WebElement lastName; 
	
	@FindBy(id="email")
	private WebElement emailId;
	
	@FindBy(id="phone")
	private WebElement phoneNumber;
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(xpath="//*[contains(text(),'Enter password')]")
	private  WebElement radioButton;
	
	@FindBy(id="password")
	private  WebElement passWord;
	
	@FindBy(xpath="//*[@class = 'filter-option-inner-inner' and text() = 'Learner']")
	private  WebElement validCredential;
	
	@FindBy(xpath="//*[@class = 'text' and text () ='Trainer']")
	private  WebElement listBox;
	
	@FindBy(xpath="//*[@type = 'submit']")
	private  WebElement addButton;
	
	@FindBy(xpath="//*[contains(text(), 'Course list')]")
	private  WebElement courseList;
	
	@FindBy(xpath="  //*[contains(text(),'APITESTING')]//parent::td/following::td[5]/a/img[@title='Delete']")
	private  WebElement deleteButton;
	
	@FindBy(xpath="//*[@id='course-search-keyword']")
	private  WebElement enterCourse;
	
	@FindBy(xpath="//*[@id = 'search_simple_submit']")
	private  WebElement searchCourse;
	
	@FindBy(xpath="//td[@class = 'title']/a")
	private  WebElement helloProject;
	
	@FindBy(xpath="//*[contains(text(), 'Assessments')]")
	private  WebElement assessments;
	
	@FindBy(xpath="//*[contains(text(), 'Create a course')]")
	private  WebElement createCourse;
	
	@FindBy(xpath="//*[@id='update_course_title']")
	private  WebElement courseTitle;
	
	@FindBy(xpath="//*[@id = 'update_course_submit']")
	private  WebElement addCourse;
	
	public  void clickuserList() {
		this.userList.click();
	} 
	
	public  void clickeditIcon() {
		this.editIcon.click();
	}
	
	public  void clickaddUser() {
		this.addUser.click();
	}
	 
	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
}
	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
}
	public void sendEmailId(String emailId) {
		this.emailId.clear();
		this.emailId.sendKeys(emailId);
}
	public void sendPhoneNumber(String phoneNumber){
		this.phoneNumber.clear();
		this.phoneNumber.sendKeys(phoneNumber);
	}
		public void sendUserName(String sendusername){
			this.userName.clear();
			this.userName.sendKeys(sendusername);
		}
		public  void clickradioButton() {
			this.radioButton.click();
		}
		public void sendPassWord(String sendpassWord){
			this.passWord.clear();
			this.passWord.sendKeys(sendpassWord);
		}
		public void clickValidCredential(){
			this.validCredential.click();
		}
		public void clickListBox(){
			this.listBox.click();
		}
		public void clickAddButton(){
			this.addButton.click();
		}
		public  void clickCourseList() {
			this.courseList.click();
		} 
		public  void clickDeleteButton() {
			this.deleteButton.click();
		} 
		
		public void sendEnterCourse(String sendenterCourse){
			this.enterCourse.clear();
			this.enterCourse.sendKeys(sendenterCourse);
		}	
		public void clickSearchCourse(){
			this.searchCourse.click();
		}
		public void clickHelloProject(){
			this.helloProject.click();
		}
		public void clickAssessments(){
			this.assessments.click();
		}
		public void clickCreateCourse(){
			this.createCourse.click();
		}
		public void sendCourseTitle(String sendcourseTitle){
			this.courseTitle.clear();
			this.courseTitle.sendKeys(sendcourseTitle);
		}
		public void clickAddCourse(){
			this.addCourse.click();
		}
}

