package com.si.selenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadCookieInfo {

	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");

		File f = new File("browser.data");

		try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr);) {
			String line;

			while ((line = br.readLine()) != null) {
				StringTokenizer str = new StringTokenizer(line, ";");

				while (str.hasMoreTokens()) {
					String name = str.nextToken();
					String value = str.nextToken();
					String domain = str.nextToken();
					String path = str.nextToken();

					Date expiry = null;
					String dt = str.nextToken();

					if (!dt.equals("null")) {
						expiry = DateFormat.getDateInstance().parse(dt);
					}

					boolean isSecure = Boolean.parseBoolean(str.nextToken());

					Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
					driver.manage().addCookie(ck);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		driver.get("http://www.facebook.com");
	}

}
