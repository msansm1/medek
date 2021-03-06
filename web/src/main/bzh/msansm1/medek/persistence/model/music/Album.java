package bzh.msansm1.medek.persistence.model.music;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for Album
 * 
 * @author sguinard
 *
 */

@Entity
@Table(name = "ALBUM")
public class Album  implements Serializable{

	private static final long serialVersionUID = 4406561318293069222L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String cover;
	private Date releaseDate;
	private Integer genre;
	private Integer nbTracks;
	private Integer support;
	private Boolean isSigned;

	public Album() {
		super();

	}

	public Album(Integer id, String title, String cover, Date releaseDate,
			Integer genre, Integer nbTracks, Integer support, Boolean isSigned) {
		super();
		this.id = id;
		this.title = title;
		this.cover = cover;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.nbTracks = nbTracks;
		this.support = support;
		this.isSigned = isSigned;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Integer getGenre() {
		return genre;
	}
	public void setGenre(Integer genre) {
		this.genre = genre;
	}

	public Integer getNbTracks() {
		return nbTracks;
	}

	public void setNb_tracks(Integer nbTracks) {
		this.nbTracks = nbTracks;
	}
	public Integer getSupport() {
		return support;
	}
	public void setSupport(Integer support) {
		this.support = support;
	}
	public Boolean getIsSigned() {
		return isSigned;
	}
	public void setIsSigned(Boolean isSigned) {
		this.isSigned = isSigned;
	}
	@Override
	public String toString() {
		return "Album [id=" + id + ", title=" + title + ", cover=" + cover
				+ ", releaseDate=" + releaseDate + ", genre=" + genre
				+ ", nbTracks=" + nbTracks + ", support=" + support
				+ ", isSigned=" + isSigned + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((isSigned == null) ? 0 : isSigned.hashCode());
		result = prime * result
				+ ((nbTracks == null) ? 0 : nbTracks.hashCode());
		result = prime * result
				+ ((releaseDate == null) ? 0 : releaseDate.hashCode());
		result = prime * result + ((support == null) ? 0 : support.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Album other = (Album) obj;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isSigned == null) {
			if (other.isSigned != null)
				return false;
		} else if (!isSigned.equals(other.isSigned))
			return false;
		if (nbTracks == null) {
			if (other.nbTracks != null)
				return false;
		} else if (!nbTracks.equals(other.nbTracks))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		if (support == null) {
			if (other.support != null)
				return false;
		} else if (!support.equals(other.support))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
