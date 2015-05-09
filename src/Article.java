// Stores data for the Article, which contains the title, date, imgURL, text
public class Article {
	protected int id; 
	private String title; 
	private String date; 
	private String imgURL;
	private String text; 
	private String author;
	
	public Article(String title, String author, String date, String imgURL, String text) {
		this.title = title; 
		this.date = date; 
		this.imgURL = imgURL;
		this.text = text;
		this.author = author;
	}
	
	public String getTitle() {
		return title; 
	}
	
	public String getDate() {
		return date;
	}
	
	public String getImgURL() {
		return imgURL;
	}
	
	public String getText() {
		return text;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String toString() {
		return "Title " + title + "\nDate: " + date + "\nimgURL: " + imgURL + "\nText: " + text + "\nAuthor: " + author;   
	}
}
