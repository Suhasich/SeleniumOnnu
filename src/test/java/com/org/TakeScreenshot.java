package com.org;

import java.io.File;

import org.openqa.selenium.OutputType;

public interface TakeScreenshot {

	File getScreenshotAs(OutputType<File> file);

}
