import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class PageTest {
	public static void main(String[] args) throws IOException {
		File input = new File("test.html");
		Document doc = Jsoup.parse(input, "UTF-8"); 
		Element p = doc.body().child(0); 
		p.empty();
		p.appendText("Da new text wow"); 
		System.out.println("Before: " + p);
		System.out.println(doc.toString());
		System.out.println("\n\n");
		
		PrintWriter writer = new PrintWriter("test.html", "UTF-8");
		writer.println(doc.toString());
		writer.close();
		
		File again = new File("test.html");
		Document againDoc = Jsoup.parse(again, "UTF-8", "test.html"); 
		System.out.println(againDoc);
	}
}
