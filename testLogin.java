public class testLogin {

  @Test
  public void successfulLogin() throws Exception {
    driver.Navigate().GoToUrl("https://letsusedata.com/");
    driver.findElement(By.id("txtUser")).click();
    driver.findElement(By.id("txtUser")).clear();
    driver.findElement(By.id("txtUser")).sendKeys("test1");
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("Test12456");
    driver.findElement(By.id("javascriptLogin")).click();
  }
}