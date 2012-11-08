package bzh.msansm1.medek.spring.json;

import java.util.List;
import java.util.Vector;

import org.apache.log4j.Logger;

import bzh.msansm1.medek.model.Error;

public class JsonError extends JsonResponse {

	private static Logger logger = Logger.getLogger(JsonError.class);

	private List<String> errors;

	public JsonError(String error) {
		super();
		errors = new Vector<String>();
		if (error != null) {
			errors.add(error);
		}
		else {
			errors.add("Unidentified error");
			logger.error(new Exception("Unidentified error"));
		}
	}

	public JsonError(List<String> errors) {
		super();
		this.errors = errors;
	}

	public JsonError(Error error) {
		super();
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

}
