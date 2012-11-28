package bzh.msansm1.medek.model.movie;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for Movie
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_movie")
public class Movie implements Serializable {

	private static final long serialVersionUID = 6935653641568982451L;

	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	private String description;
	private Date releaseDate;
	private String cover;
	private Integer support;
	private Integer genre;
	private String length;
	private Boolean isCollector;
	
	public Movie() {
		super();
	}

	public Movie(Integer id, String title, String description,
			Date releaseDate, String cover, Integer support, Integer genre,
			String length, Boolean isCollector) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.releaseDate = releaseDate;
		this.cover = cover;
		this.support = support;
		this.genre = genre;
		this.length = length;
		this.isCollector = isCollector;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public Integer getSupport() {
		return support;
	}

	public void setSupport(Integer support) {
		this.support = support;
	}

	public Integer getGenre() {
		return genre;
	}

	public void setGenre(Integer genre) {
		this.genre = genre;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public Boolean getIsCollector() {
		return isCollector;
	}

	public void setIsCollector(Boolean isCollector) {
		this.isCollector = isCollector;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", description="
				+ description + ", releaseDate=" + releaseDate + ", cover="
				+ cover + ", support=" + support + ", genre=" + genre
				+ ", length=" + length + ", isCollector=" + isCollector + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((isCollector == null) ? 0 : isCollector.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
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
		Movie other = (Movie) obj;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
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
		if (isCollector == null) {
			if (other.isCollector != null)
				return false;
		} else if (!isCollector.equals(other.isCollector))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
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
