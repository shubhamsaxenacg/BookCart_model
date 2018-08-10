package in.capgemini.shop.model;

import java.util.Collection;
import java.util.Map;

import in.capgemini.shop.pojo.Books;

public class BookShopServiceImpl implements BookShopService {
	
	BookShopDAO bookShopDAO = new BookShopDAOImpl();
	static int count=0;
	
	/* (non-Javadoc)
	 * @see in.capgemini.shop.model.BookShopInterface#allBooks()
	 */
	@Override
	public Collection<Books> allBooks(){
		return bookShopDAO.allBooks().values();
	}
	
	/* (non-Javadoc)
	 * @see in.capgemini.shop.model.BookShopInterface#addBookCart(in.capgemini.shop.pojo.Books)
	 */
	@Override
	public int addBookCart(int id) {
		boolean check=true;
		count++;
		
		for(Books books:viewBookCart()) {
			if(books.getBookId()==id) {
				books.setCount(books.getCount()+1);
				check=false;
				break;
							}

			}
		if(check) {
			bookShopDAO.addBookCart(bookShopDAO.allBooks().get(id));
		}		
		return count;
	}
	

	public Collection<Books> viewBookCart() {
		return bookShopDAO.viewBookCart();
		
	}
	

	public void removeBookFromCart(int BookId) {
		
		for(Books books:viewBookCart()) {
			if(books.getBookId()==BookId) {
				if(books.getCount()>1) {
					books.setCount(books.getCount()-1);
				}
				else
					bookShopDAO.removeBookFromCart(books);
				break;
			}

		}
	}


}
