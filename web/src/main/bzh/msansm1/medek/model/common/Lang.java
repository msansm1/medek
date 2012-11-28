package bzh.msansm1.medek.model.common;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for Lang
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_lang")
public class Lang implements Serializable{

	private static final long serialVersionUID = -1747270275393690670L;

	@Id
	@GeneratedValue
	private Integer id;
	private String lang;

	public Lang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lang(Integer id, String lang) {
		super();
		this.id = id;
		this.lang = lang;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "Lang [id=" + id + ", lang=" + lang + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lang == null) ? 0 : lang.hashCode());
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
		Lang other = (Lang) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lang == null) {
			if (other.lang != null)
				return false;
		} else if (!lang.equals(other.lang))
			return false;
		return true;
	}

}
