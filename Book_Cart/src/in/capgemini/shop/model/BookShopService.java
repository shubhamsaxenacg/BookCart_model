package in.capgemini.shop.model;

import java.util.Collection;

import in.capgemini.shop.pojo.Books;

public interface BookShopService {

	Collection<Books> allBooks();

	/* (non-Javadoc)
	 * @see in.capgemini.shop.model.BookShopDAO#addBookCart(in.capgemini.shop.pojo.Books)
	 */
	int addBookCart(int id);

	/* (non-Javadoc)
	 * @see in.capgemini.shop.model.BookShopDAO#viewBookCart()
	 */
	Collection<Books> viewBookCart();

	/* (non-Javadoc)
	 * @see in.capgemini.shop.model.BookShopDAO#removeBookFromCart(int)
	 */
	void removeBookFromCart(int BookId);

	

}