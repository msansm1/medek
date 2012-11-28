package bzh.msansm1.medek.model.music;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity class for AlbumArtist
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_album_artist")
public class AlbumArtist implements Serializable{

	private static final long serialVersionUID = 6788582023763712635L;

	private Integer album;
	private Integer artist;
	private Integer type;

	public AlbumArtist() {
		super();
	}

	public AlbumArtist(Integer album, Integer artist, Integer type) {
		super();
		this.album = album;
		this.artist = artist;
		this.type = type;
	}

	public Integer getAlbum() {
		return album;
	}

	public void setAlbum(Integer album) {
		this.album = album;
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
		return "AlbumArtist [album=" + album + ", artist=" + artist + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((album == null) ? 0 : album.hashCode());
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
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
		AlbumArtist other = (AlbumArtist) obj;
		if (album == null) {
			if (other.album != null)
				return false;
		} else if (!album.equals(other.album))
			return false;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
