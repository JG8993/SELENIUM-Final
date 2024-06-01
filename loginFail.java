public class loginFail {
  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://letsusedata.com/");
    driver.findElement(By.id("txtUser")).click();
    driver.findElement(By.id("txtUser")).clear();
    driver.findElement(By.id("txtUser")).sendKeys("test1");
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("Test1234");
    driver.findElement(By.id("javascriptLogin")).click();
  }
}
