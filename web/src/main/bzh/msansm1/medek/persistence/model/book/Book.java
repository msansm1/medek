package bzh.msansm1.medek.persistence.model.book;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for Book
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "BOOK")
public class Book implements Serializable {

	private static final long serialVersionUID = 4202253006395867418L;

	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	private Integer editor;
	private Integer collection;
	private String cover;
	private String description;
	private Date publicationDate;
	private Integer genre;
	private Integer type;
	private Integer lang;
	private Boolean isSigned;
	private String series;
	private Integer bookNb;
	private Boolean isSerieDone;

	public Book() {
		super();
	}

	public Book(Integer id, String title, Integer editor, Integer collection,
			String cover, String description, Date publicationDate,
			Integer genre, Integer type, Integer lang, Boolean isSigned,
			String series, Integer bookNb, Boolean isSerieDone) {
		super();
		this.id = id;
		this.title = title;
		this.editor = editor;
		this.collection = collection;
		this.cover = cover;
		this.description = description;
		this.publicationDate = publicationDate;
		this.genre = genre;
		this.type = type;
		this.lang = lang;
		this.isSigned = isSigned;
		this.series = series;
		this.bookNb = bookNb;
		this.isSerieDone = isSerieDone;
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

	public Integer getEditor() {
		return editor;
	}

	public void setEditor(Integer editor) {
		this.editor = editor;
	}

	public Integer getCollection() {
		return collection;
	}

	public void setCollection(Integer collection) {
		this.collection = collection;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Integer getGenre() {
		return genre;
	}

	public void setGenre(Integer genre) {
		this.genre = genre;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getLang() {
		return lang;
	}

	public void setLang(Integer lang) {
		this.lang = lang;
	}

	public Boolean getIsSigned() {
		return isSigned;
	}

	public void setIsSigned(Boolean isSigned) {
		this.isSigned = isSigned;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Integer getBookNb() {
		return bookNb;
	}

	public void setBookNb(Integer bookNb) {
		this.bookNb = bookNb;
	}

	public Boolean getIsSerieDone() {
		return isSerieDone;
	}

	public void setIsSerieDone(Boolean isSerieDone) {
		this.isSerieDone = isSerieDone;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", editor=" + editor
				+ ", collection=" + collection + ", cover=" + cover
				+ ", description=" + description + ", publicationDate="
				+ publicationDate + ", genre=" + genre + ", type=" + type
				+ ", lang=" + lang + ", isSigned=" + isSigned + ", series="
				+ series + ", bookNb=" + bookNb + ", isSerieDone="
				+ isSerieDone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookNb == null) ? 0 : bookNb.hashCode());
		result = prime * result
				+ ((collection == null) ? 0 : collection.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((editor == null) ? 0 : editor.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((isSerieDone == null) ? 0 : isSerieDone.hashCode());
		result = prime * result
				+ ((isSigned == null) ? 0 : isSigned.hashCode());
		result = prime * result + ((lang == null) ? 0 : lang.hashCode());
		result = prime * result
				+ ((publicationDate == null) ? 0 : publicationDate.hashCode());
		result = prime * result + ((series == null) ? 0 : series.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Book other = (Book) obj;
		if (bookNb == null) {
			if (other.bookNb != null)
				return false;
		} else if (!bookNb.equals(other.bookNb))
			return false;
		if (collection == null) {
			if (other.collection != null)
				return false;
		} else if (!collection.equals(other.collection))
			return false;
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
		if (editor == null) {
			if (other.editor != null)
				return false;
		} else if (!editor.equals(other.editor))
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
		if (isSerieDone == null) {
			if (other.isSerieDone != null)
				return false;
		} else if (!isSerieDone.equals(other.isSerieDone))
			return false;
		if (isSigned == null) {
			if (other.isSigned != null)
				return false;
		} else if (!isSigned.equals(other.isSigned))
			return false;
		if (lang == null) {
			if (other.lang != null)
				return false;
		} else if (!lang.equals(other.lang))
			return false;
		if (publicationDate == null) {
			if (other.publicationDate != null)
				return false;
		} else if (!publicationDate.equals(other.publicationDate))
			return false;
		if (series == null) {
			if (other.series != null)
				return false;
		} else if (!series.equals(other.series))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
