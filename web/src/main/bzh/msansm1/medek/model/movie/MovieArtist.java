package bzh.msansm1.medek.model.movie;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity class for MovieArtist
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_movie_artist")
public class MovieArtist implements Serializable {

	private static final long serialVersionUID = -1378810256072647586L;

	private Integer movie;
	private Integer artist;
	private Integer type;

	public MovieArtist() {
		super();
	}

	public MovieArtist(Integer movie, Integer artist, Integer type) {
		super();
		this.movie = movie;
		this.artist = artist;
		this.type = type;
	}

	public Integer getmovie() {
		return movie;
	}

	public void setmovie(Integer movie) {
		this.movie = movie;
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
		return "MovieArtist [movie=" + movie + ", artist=" + artist
				+ ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
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
		MovieArtist other = (MovieArtist) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
