package bzh.msansm1.medek.model.artist;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for Artist
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_artist")
public class Artist implements Serializable {

	private static final long serialVersionUID = -3765881623100962736L;

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String firstname;
	private Integer type;
	private String nationality;
	private String picture;
	private String biolink;

	public Artist() {
		super();
	}

	public Artist(Integer id, String name, String firstname, Integer type,
			String nationality, String picture, String biolink) {
		super();
		this.id = id;
		this.name = name;
		this.firstname = firstname;
		this.type = type;
		this.nationality = nationality;
		this.picture = picture;
		this.biolink = biolink;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getBiolink() {
		return biolink;
	}

	public void setBiolink(String biolink) {
		this.biolink = biolink;
	}

	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", firstname="
				+ firstname + ", type=" + type + ", nationality=" + nationality
				+ ", picture=" + picture + ", biolink=" + biolink + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((biolink == null) ? 0 : biolink.hashCode());
		result = prime * result
				+ ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + ((picture == null) ? 0 : picture.hashCode());
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
		Artist other = (Artist) obj;
		if (biolink == null) {
			if (other.biolink != null)
				return false;
		} else if (!biolink.equals(other.biolink))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (picture == null) {
			if (other.picture != null)
				return false;
		} else if (!picture.equals(other.picture))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
