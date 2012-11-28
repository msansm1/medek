package bzh.msansm1.medek.model.tvshow;

import java.io.Serializable;

/**
 * Entity class for MovieArtist
 * 
 * @author sguinard
 * 
 */

public class TvshowArtist implements Serializable {

	private static final long serialVersionUID = -1378810256072647586L;

	private Integer tvshow;
	private Integer artist;
	private Integer type;

	public TvshowArtist() {
		super();
	}

	public TvshowArtist(Integer tvshow, Integer artist, Integer type) {
		super();
		this.tvshow = tvshow;
		this.artist = artist;
		this.type = type;
	}

	public Integer getTvshow() {
		return tvshow;
	}

	public void setTvshow(Integer tvshow) {
		this.tvshow = tvshow;
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
		return "MovieArtist [tvshow=" + tvshow + ", artist=" + artist
				+ ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((tvshow == null) ? 0 : tvshow.hashCode());
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
		TvshowArtist other = (TvshowArtist) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (tvshow == null) {
			if (other.tvshow != null)
				return false;
		} else if (!tvshow.equals(other.tvshow))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
