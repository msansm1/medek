package bzh.msansm1.medek.model.tvshow;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for Tvshow
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_tvshow")
public class Tvshow implements Serializable {

	private static final long serialVersionUID = -4640826872738684370L;

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
	private Integer season;
	private String series;
	private Boolean serie_done;
	
	public Tvshow() {
		super();
	}

	public Tvshow(Integer id, String title, String description,
			Date releaseDate, String cover, Integer support, Integer genre,
			String length, Integer season, String series, Boolean serie_done) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.releaseDate = releaseDate;
		this.cover = cover;
		this.support = support;
		this.genre = genre;
		this.length = length;
		this.season = season;
		this.series = series;
		this.serie_done = serie_done;
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

	public Integer getSeason() {
		return season;
	}

	public void setSeason(Integer season) {
		this.season = season;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Boolean getSerie_done() {
		return serie_done;
	}

	public void setSerie_done(Boolean serie_done) {
		this.serie_done = serie_done;
	}

	@Override
	public String toString() {
		return "Tvshow [id=" + id + ", title=" + title + ", description="
				+ description + ", releaseDate=" + releaseDate + ", cover="
				+ cover + ", support=" + support + ", genre=" + genre
				+ ", length=" + length + ", season=" + season + ", series="
				+ series + ", serie_done=" + serie_done + "]";
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
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result
				+ ((releaseDate == null) ? 0 : releaseDate.hashCode());
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		result = prime * result
				+ ((serie_done == null) ? 0 : serie_done.hashCode());
		result = prime * result + ((series == null) ? 0 : series.hashCode());
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
		Tvshow other = (Tvshow) obj;
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
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		if (serie_done == null) {
			if (other.serie_done != null)
				return false;
		} else if (!serie_done.equals(other.serie_done))
			return false;
		if (series == null) {
			if (other.series != null)
				return false;
		} else if (!series.equals(other.series))
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
