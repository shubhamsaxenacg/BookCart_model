package in.capgemini.shop.model;

import java.util.Collection;
import java.util.Map;

import in.capgemini.shop.pojo.Books;

public interface BookShopDAO {

	Map<Integer, Books> allBooks();

	void addBookCart(Books book);

	Collection<Books> viewBookCart();

	void removeBookFromCart(Books book);

}