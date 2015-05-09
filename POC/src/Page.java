import java.util.ArrayList;
import java.util.List;

// Stores a "Page" for the website, which stores the id, contained article, and comments
public class Page {
	protected int id;
	private Article article; 
	private List<Comment> comments = new ArrayList<Comment>(); 
	
	public Page(Article article) {
		this(article, null); 
	}
	
	public Page(Article article, List<Comment> comments) {
		this.article = article;
		this.comments = comments;
	}
	
	public int getID() {
		return id; 
	}
	
	public Article getArticle() {
		return article; 
	}
	
	public List<Comment> getComments() {
		return new ArrayList<Comment>(comments); 
	}
}
