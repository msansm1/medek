package bzh.msansm1.medek.persistence.dao.user.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bzh.msansm1.medek.persistence.dao.user.FriendDAO;
import bzh.msansm1.medek.persistence.dao.user.LoanDAO;
import bzh.msansm1.medek.persistence.dao.user.UserAlbumDAO;
import bzh.msansm1.medek.persistence.dao.user.UserBookDAO;
import bzh.msansm1.medek.persistence.dao.user.UserDAO;
import bzh.msansm1.medek.persistence.dao.user.UserMovieDAO;
import bzh.msansm1.medek.persistence.dao.user.UserTvDAO;
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

public class UserProxyImpl implements UserProxy {

	@Autowired
	private FriendDAO friendDao;

	@Autowired
	private LoanDAO loanDao;
	
	@Autowired
	private UserAlbumDAO userAlbumDao;

	@Autowired
	private UserBookDAO userBookDao;

	@Autowired
	private UserDAO userDao;

	@Autowired
	private UserMovieDAO userMovieDao;

	@Autowired
	private UserTvDAO userTvDao;

	@Override
	public void createFriend(Friend friend) {
		friendDao.create(friend);
	}

	@Override
	public void updateFriend(Friend friend) {
		friendDao.update(friend);
	}

	@Override
	public void deleteFriend(Friend friend) {
		friendDao.delete(friend);
	}

	@Override
	public List<Friend> getFriendByUserId(int userId) {
		return friendDao.findFriendByUserId(userId);
	}

	@Override
	public List<Friend> getAllFriend() {
		return friendDao.findAllFriend();
	}

	@Override
	public List<Friend> getAllFriend(String filter, String sidx, String sord) {
		return friendDao.findAllFriend(filter, sidx, sord);
	}

	@Override
	public Integer createLoan(Loan loan) {
		return loanDao.create(loan);
	}

	@Override
	public void updateLoan(Loan loan) {
		loanDao.update(loan);
	}

	@Override
	public void deleteLoan(Loan loan) {
		loanDao.delete(loan);
	}

	@Override
	public Loan getLoanById(Integer id) {
		return loanDao.findLoanById(id);
	}

	@Override
	public List<Loan> getLoanByFriend(int userId, int friendId) {
		return loanDao.findLoanByFriend(userId, friendId);
	}

	@Override
	public List<Loan> getLoanByLoaner(int userId) {
		return loanDao.findLoanByLoaner(userId);
	}

	@Override
	public List<Loan> getAllLoan() {
		return loanDao.findAllLoan();
	}

	@Override
	public List<Loan> getAllLoan(String filter, String sidx, String sord) {
		return loanDao.findAllLoan(filter, sidx, sord);
	}

	@Override
	public void createUserAlbum(UserAlbum userAlbum) {
		userAlbumDao.create(userAlbum);
	}

	@Override
	public void updateUserAlbum(UserAlbum userAlbum) {
		userAlbumDao.update(userAlbum);
	}

	@Override
	public void deleteUserAlbum(UserAlbum userAlbum) {
		userAlbumDao.delete(userAlbum);
	}

	@Override
	public UserAlbum getUserAlbumById(Integer id) {
		return userAlbumDao.findUserAlbumById(id);
	}

	@Override
	public List<UserAlbum> getAllUserAlbum() {
		return userAlbumDao.findAllUserAlbum();
	}

	@Override
	public void createUserBook(UserBook userBook) {
		userBookDao.create(userBook);
	}

	@Override
	public void updateUserBook(UserBook userBook) {
		userBookDao.update(userBook);
	}

	@Override
	public void deleteUserBook(UserBook userBook) {
		userBookDao.delete(userBook);
	}

	@Override
	public UserBook getUserBookById(Integer id) {
		return userBookDao.findUserBookById(id);
	}

	@Override
	public List<UserBook> getAllUserBook() {
		return userBookDao.findAllUserBook();
	}

	@Override
	public Integer createUser(User user) {
		return userDao.create(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.update(user);
	}

	@Override
	public void deleteUser(User user) {
		userDao.delete(user);
	}

	@Override
	public User getUserById(Integer id) {
		return userDao.findUserById(id);
	}

	@Override
	public User getUserByLogin(String login) {
		List<User> res = userDao.findUserByLogin(login);
		User result = null;
		for (User r : res) {
			result = r;
		}
		return result;
	}

	@Override
	public List<User> getAllUser() {
		return userDao.findAllUser();
	}

	@Override
	public List<User> getAllUser(String filter, String sidx, String sord) {
		return userDao.findAllUser(filter, sidx, sord);
	}

	@Override
	public void createUserMovie(UserMovie userMovie) {
		userMovieDao.create(userMovie);
	}

	@Override
	public void updateUserMovie(UserMovie userMovie) {
		userMovieDao.update(userMovie);
	}

	@Override
	public void deleteUserMovie(UserMovie userMovie) {
		userMovieDao.delete(userMovie);
	}

	@Override
	public UserMovie getUserMovieById(Integer id) {
		return userMovieDao.findUserMovieById(id);
	}

	@Override
	public List<UserMovie> getAllUserMovie() {
		return userMovieDao.findAllUserMovie();
	}

	@Override
	public void create(UserTv userTv) {
		userTvDao.create(userTv);
	}

	@Override
	public void update(UserTv userTv) {
		userTvDao.update(userTv);
	}

	@Override
	public void delete(UserTv userTv) {
		userTvDao.delete(userTv);
	}

	@Override
	public UserTv getUserTvById(Integer id) {
		return userTvDao.findUserTvById(id);
	}

	@Override
	public List<UserTv> getAllUserTv() {
		return userTvDao.findAllUserTv();
	}

}
