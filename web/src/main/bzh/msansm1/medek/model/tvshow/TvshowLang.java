package bzh.msansm1.medek.model.tvshow;

import java.io.Serializable;

/**
 * Entity class for MovieLang
 * 
 * @author sguinard
 * 
 */

public class TvshowLang implements Serializable {


	private static final long serialVersionUID = 7191425040011392361L;

	private Integer tvshow;
	private Integer lang;

	public TvshowLang() {
		super();
	}

	public TvshowLang(Integer tvshow, Integer lang) {
		super();
		this.tvshow = tvshow;
		this.lang = lang;
	}

	public Integer getTvshow() {
		return tvshow;
	}

	public void setTvshow(Integer tvshow) {
		this.tvshow = tvshow;
	}

	public Integer getLang() {
		return lang;
	}

	public void setLang(Integer lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "MovieLang [tvshow=" + tvshow + ", lang=" + lang + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lang == null) ? 0 : lang.hashCode());
		result = prime * result + ((tvshow == null) ? 0 : tvshow.hashCode());
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
		TvshowLang other = (TvshowLang) obj;
		if (lang == null) {
			if (other.lang != null)
				return false;
		} else if (!lang.equals(other.lang))
			return false;
		if (tvshow == null) {
			if (other.tvshow != null)
				return false;
		} else if (!tvshow.equals(other.tvshow))
			return false;
		return true;
	}

}
