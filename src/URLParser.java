import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

// This class is called to take in the text file with links, and adds them to the database
public class URLParser {
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException {
		File data = new File("links.txt"); 
		Scanner input = new Scanner(data); 
		
		while(input.hasNextLine()) {
			String URL = input.nextLine(); 
			Article article = makeArticle(URL); 
			Page page = new Page(article);
			
			System.out.println(article.toString());
			
//			InsertArticle insertArticle = new InsertArticle(article.getTitle(), article.getAuthor(),
//					article.getDate(), article.getText(), article.getImgURL());
	
		}		
		input.close();
	}
	
	// Takes in the URL of a site and returns an Article with appropriate attributes
	// currently only works for the onion
	public static Article makeArticle(String URL) throws IOException {
		Document doc = Jsoup.connect(URL).get();
		Element title = doc.getElementsByTag("h1").get(1);
		Element date = doc.getElementsByClass("content-published").first(); 
		Element img = doc.getElementsByTag("img").first(); 
		Element text = doc.getElementsByClass("content-text").first().child(0); 
		Element author = doc.getElementsByClass("content-text").first().child(0); 
		
		return new Article(title.text(), "YO MOMMA", date.text(), img.attr("src"), text.text()); 	
	}
}
