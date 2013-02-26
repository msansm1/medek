package bzh.msansm1.medek.persistence.dao.user;

/**
 * 
 * @author sguinard
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.users.Loan;

@Component
public class LoanDAOImpl implements LoanDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Loan loan) {
		template.persist(loan);
		template.refresh(loan);
		return loan.getId();
	}

	@Override
	public void update(Loan loan) {
		template.merge(loan);
	}

	@Override
	public void delete(Loan loan) {
		template.delete(loan);
	}

	@Override
	public Loan findLoanById(Integer id) {
		return template.load(Loan.class, id);
	}

	@Override
	public List<Loan> findLoanByFriend(int userId, int friendId) {
		return template.find("SELECT l FROM LOAN l WHERE l.USER='" + userId
				+ "' and l.FRIEND='" + friendId + "'");
	}

	@Override
	public List<Loan> findLoanByLoaner(int userId) {
		return template.find("SELECT l FROM LOAN l WHERE l.USER='" + userId
				+ "'");
	}

	@Override
	public List<Loan> findAllLoan() {
		return template.loadAll(Loan.class);
	}

	@Override
	public List<Loan> findAllLoan(String filter, String sidx, String sord) {
		return template.find("SELECT l FROM LOAN l " + filter
				+ " ORDER BY l."
				+ sidx + " " + sord);
	}

}
