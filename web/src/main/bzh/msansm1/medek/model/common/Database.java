package bzh.msansm1.medek.model.common;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for Database
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_database")
public class Database implements Serializable {

	private static final long serialVersionUID = -9018973639479187268L;

	@Id
	@GeneratedValue
	private Integer id;
	private String version;

	public Database() {
		super();
	}

	public Database(Integer id, String version) {
		super();
		this.id = id;
		this.version = version;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Database [id=" + id + ", version=" + version + "]";
	}

}
