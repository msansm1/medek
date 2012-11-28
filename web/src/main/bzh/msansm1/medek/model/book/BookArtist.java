package bzh.msansm1.medek.model.book;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity class for BookArtist
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_book_artist")
public class BookArtist implements Serializable {

	private static final long serialVersionUID = -1378810256072647586L;

	private Integer book;
	private Integer artist;
	private Integer type;

	public BookArtist() {
		super();
	}

	public BookArtist(Integer book, Integer artist, Integer type) {
		super();
		this.book = book;
		this.artist = artist;
		this.type = type;
	}

	public Integer getBook() {
		return book;
	}

	public void setBook(Integer book) {
		this.book = book;
	}

	public Integer getArtist() {
		return artist;
	}

	public void setArtist(Integer artist) {
		this.artist = artist;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BookArtist [book=" + book + ", artist=" + artist + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		BookArtist other = (BookArtist) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
