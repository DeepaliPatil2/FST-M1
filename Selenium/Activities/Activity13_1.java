package Java;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;


public class Activity13_1 {
    public static void main(String[] args) throws IOException, CsvException {
     CSVReader reader = new CSVReader(new FileReader("C:\\Training_Workspace\\FST_Selenium\\file1.csv"));
     List<String[]> list = reader.readAll();
     System.out.println("Total number of rows: " + list.size());
     Iterator<String[]> itr = list.iterator();
     while(itr.hasNext()) {
      String[] str = itr.next();

      System.out.print("Values are: ");
      for(int i=0;i<str.length;i++) {
       System.out.print(" " + str[i]);
      }
      System.out.println(" ");
     }
reader.close();
    }
}
