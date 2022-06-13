/**
 * 
 */
package SeleniumSessoins;

import java.net.URL;

/**
 * @author ASUS
 *
 */
public interface Util {
	
	String CHROME_BROWSER = "chrome";
	String FIREFOX_BROWSER = "firefox";
	String SAFARI_BROWSER = "safari";
	
	public void navigateUrl(URL url);
	
	public void nvaigateUrl(String url);
	
	public String getPageUrl();
	
	public String getPageTitle();
	
	public String getPageSource();
	
	public void closeBrowser();
	
	public void quitBrowser();
	


}
