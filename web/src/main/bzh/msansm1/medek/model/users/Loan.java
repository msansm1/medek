package bzh.msansm1.medek.model.users;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for loan
 * 
 * @author sguinard
 *
 */

@Entity
@Table(name = "med_loan")
public class Loan implements Serializable{

	private static final long serialVersionUID = -1198559424775887923L;

	@Id
	@GeneratedValue
	private Integer id;
	private Integer user;
	private Integer friend;
	private String name;
	private Integer book;
	private Integer movie;
	private Integer tvshow;
	private Date date_start;
	private Date date_end;
	private String med_loancol;

	public Loan(){
		super();
	}

	public Loan(Integer id, String login, Integer user, Integer friend, String name, Integer book, Integer movie, Integer tvshow, Date date_start, Date date_end, String med_loancol){
		super();
		this.id = id;
		this.user = user;
		this.friend = friend;
		this.name = name;
		this.book = book;
		this.movie = movie;
		this.tvshow = tvshow;
		this.date_start = date_start;
		this.date_end = date_end;
		this.med_loancol = med_loancol;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getFriend() {
		return friend;
	}

	public void setFriend(Integer friend) {
		this.friend = friend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBook() {
		return book;
	}

	public void setBook(Integer book) {
		this.book = book;
	}

	public Integer getMovie() {
		return movie;
	}

	public void setMovie(Integer movie) {
		this.movie = movie;
	}

	public Integer getTvshow() {
		return tvshow;
	}

	public void setTvshow(Integer tvshow) {
		this.tvshow = tvshow;
	}

	public Date getDate_start() {
		return date_start;
	}

	public void setDate_start(Date date_start) {
		this.date_start = date_start;
	}

	public Date getDate_end() {
		return date_end;
	}

	public void setDate_end(Date date_end) {
		this.date_end = date_end;
	}

	public String getMed_loancol() {
		return med_loancol;
	}

	public void setMed_loancol(String med_loancol) {
		this.med_loancol = med_loancol;
	}

	@Override
	public String toString() {
		return "Loan [id=" + id + ", user=" + user + ", friend=" + friend
				+ ", name=" + name + ", book=" + book + ", movie=" + movie
				+ ", tvshow=" + tvshow + ", date_start=" + date_start
				+ ", date_end=" + date_end + ", med_loancol=" + med_loancol
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result
				+ ((date_end == null) ? 0 : date_end.hashCode());
		result = prime * result
				+ ((date_start == null) ? 0 : date_start.hashCode());
		result = prime * result + ((friend == null) ? 0 : friend.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((med_loancol == null) ? 0 : med_loancol.hashCode());
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tvshow == null) ? 0 : tvshow.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (date_end == null) {
			if (other.date_end != null)
				return false;
		} else if (!date_end.equals(other.date_end))
			return false;
		if (date_start == null) {
			if (other.date_start != null)
				return false;
		} else if (!date_start.equals(other.date_start))
			return false;
		if (friend == null) {
			if (other.friend != null)
				return false;
		} else if (!friend.equals(other.friend))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (med_loancol == null) {
			if (other.med_loancol != null)
				return false;
		} else if (!med_loancol.equals(other.med_loancol))
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tvshow == null) {
			if (other.tvshow != null)
				return false;
		} else if (!tvshow.equals(other.tvshow))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
