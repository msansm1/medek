package bzh.msansm1.medek.persistence.dao.user;

import java.util.List;

import bzh.msansm1.medek.persistence.model.users.Loan;

/**
 * Loan table DAO class interface.
 * 
 * @author sguinard
 *
 */
public interface LoanDAO {
	
	Integer create(Loan loan);
	
	void update(Loan loan);
	
	void delete(Loan loan);
	
	Loan findLoanById(Integer id);
	
	List<Loan> findLoanByFriend(int userId, int friendId);
	
	List<Loan> findLoanByLoaner(int userId);
	
	List<Loan> findAllLoan();

	List<Loan> findAllLoan(String filter, String sidx, String sord);

}
