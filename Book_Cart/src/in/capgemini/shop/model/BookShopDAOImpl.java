package in.capgemini.shop.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import in.capgemini.shop.pojo.Books;

public class BookShopDAOImpl implements BookShopDAO {
	static Map<Integer,Books> bookMap = new HashMap<>();
	static List<Books> bookList = new ArrayList<Books>();
	
	static Books book1=new Books( 101,"E Balagurusamy", "Object-Oriented Programming C++","eb.jpg", "C++", 348,1);
	static Books book2=new Books(102, "Denis Ritche", "The C language","dr.jpg", "C",223,1) ;
	static Books book3=new Books(103,"Timothy", "Python","t.jpg","Python crash course", 450,1);
	static Books book4=new Books(104, "R. Rao", "Core Python","rr.jpg", "Python++", 535,1);
	
	static {
		bookMap.put(book1.getBookId(), book1);
		bookMap.put(book2.getBookId(), book2);
		bookMap.put(book3.getBookId(),book3);
		bookMap.put(book4.getBookId(),book4);
	}
	
	/* (non-Javadoc)
	 * @see in.capgemini.shop.model.BookShopDAO#allBooks()
	 */
	@Override
	public Map<Integer,Books> allBooks(){
		return bookMap;
	}
	
	/* (non-Javadoc)
	 * @see in.capgemini.shop.model.BookShopDAO#addBookCart(in.capgemini.shop.pojo.Books)
	 */
	@Override
	public void addBookCart(Books book) {
		bookList.add(book);
	}
	
	/* (non-Javadoc)
	 * @see in.capgemini.shop.model.BookShopDAO#viewBookCart()
	 */
	@Override
	public Collection<Books> viewBookCart() {
		return bookList;
		
	}
	
	/* (non-Javadoc)
	 * @see in.capgemini.shop.model.BookShopDAO#removeBookFromCart(int)
	 */
	@Override
	public void removeBookFromCart(Books book) {
		bookList.remove(book);
	}
}
