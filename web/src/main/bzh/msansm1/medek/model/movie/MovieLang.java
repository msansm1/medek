package bzh.msansm1.medek.model.movie;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity class for MovieLang
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_movie_lang")
public class MovieLang implements Serializable {


	private static final long serialVersionUID = 7191425040011392361L;

	private Integer movie;
	private Integer lang;

	public MovieLang() {
		super();
	}

	public MovieLang(Integer movie, Integer lang) {
		super();
		this.movie = movie;
		this.lang = lang;
	}

	public Integer getMovie() {
		return movie;
	}

	public void setMovie(Integer movie) {
		this.movie = movie;
	}

	public Integer getLang() {
		return lang;
	}

	public void setLang(Integer lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "MovieLang [movie=" + movie + ", lang=" + lang + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lang == null) ? 0 : lang.hashCode());
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
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
		MovieLang other = (MovieLang) obj;
		if (lang == null) {
			if (other.lang != null)
				return false;
		} else if (!lang.equals(other.lang))
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		return true;
	}

}
