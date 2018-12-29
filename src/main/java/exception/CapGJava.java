package exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CapGJava extends Exception {

	static Logger logger = LoggerFactory.getLogger(CapGJava.class);

	private static final long serialVersionUID = 1L;

	public CapGJava() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */

	final static String msg = "Found cutom exception";

	public CapGJava(String message, Throwable cause, Throwable customCause) {
		super(message.concat(msg), cause);
		// TODO Auto-generated constructor stub
		logger.info(message);
		logger.info(cause.toString());
		logger.info(customCause.toString());
	}

	/**
	 * @param cause
	 */
	public CapGJava(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
