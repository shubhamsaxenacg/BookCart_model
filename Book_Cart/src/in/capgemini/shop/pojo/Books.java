package in.capgemini.shop.pojo;

public class Books {
	private int bookId;
	private String bookName;
	private String authorName;
	private String description;
	private String link;
	private int price;
	private int count;
	
	public Books()
	{
		
	}
	

	
	public Books(int bookId, String authorName, String bookName, String link, String description, int price,
			int count) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.description = description;
		this.link = link;
		this.price = price;
		this.count = count;
	}



	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", description="
				+ description + ", link=" + link + ", price=" + price + ", count=" + count + "]";
	}

	
}

