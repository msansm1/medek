package bzh.msansm1.medek.persistence.dao.user.proxy;

import java.util.List;

import bzh.msansm1.medek.persistence.model.users.Friend;
import bzh.msansm1.medek.persistence.model.users.Loan;
import bzh.msansm1.medek.persistence.model.users.User;
import bzh.msansm1.medek.persistence.model.users.UserAlbum;
import bzh.msansm1.medek.persistence.model.users.UserBook;
import bzh.msansm1.medek.persistence.model.users.UserMovie;
import bzh.msansm1.medek.persistence.model.users.UserTv;

/**
 * DAO proxy class interface for table User and relatives
 * 
 * @author sguinard
 * 
 */

public interface UserProxy {

	// Friend
	void createFriend(Friend friend);

	void updateFriend(Friend friend);

	void deleteFriend(Friend friend);

	List<Friend> getFriendByUserId(int userId);

	List<Friend> getAllFriend();

	List<Friend> getAllFriend(String filter, String sidx, String sord);

	// Loan
	Integer createLoan(Loan loan);

	void updateLoan(Loan loan);

	void deleteLoan(Loan loan);

	Loan getLoanById(Integer id);

	List<Loan> getLoanByFriend(int userId, int friendId);

	List<Loan> getLoanByLoaner(int userId);

	List<Loan> getAllLoan();

	List<Loan> getAllLoan(String filter, String sidx, String sord);

	// UserAlbum
	void createUserAlbum(UserAlbum userAlbum);

	void updateUserAlbum(UserAlbum userAlbum);

	void deleteUserAlbum(UserAlbum userAlbum);

	UserAlbum getUserAlbumById(Integer id);

	List<UserAlbum> getAllUserAlbum();

	// UserBook
	void createUserBook(UserBook userBook);

	void updateUserBook(UserBook userBook);

	void deleteUserBook(UserBook userBook);

	UserBook getUserBookById(Integer id);

	List<UserBook> getAllUserBook();

	// User
	Integer createUser(User user);

	void updateUser(User user);

	void deleteUser(User user);

	User getUserById(Integer id);

	User getUserByLogin(String login);

	List<User> getAllUser();

	List<User> getAllUser(String filter, String sidx, String sord);

	// UserMovie
	void createUserMovie(UserMovie userMovie);

	void updateUserMovie(UserMovie userMovie);

	void deleteUserMovie(UserMovie userMovie);

	UserMovie getUserMovieById(Integer id);

	List<UserMovie> getAllUserMovie();

	// UserTv
	void create(UserTv userTv);

	void update(UserTv userTv);

	void delete(UserTv userTv);

	UserTv getUserTvById(Integer id);

	List<UserTv> getAllUserTv();

}
