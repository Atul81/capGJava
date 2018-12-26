package orikaModel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ma.glasnost.orika.MapperFacade;

public class LogMapping {
	public static void main(String... a) throws ParseException {

		MapperFacade mapperFacade = new Mapping();
		Logger logger = LoggerFactory.getLogger(Mapping.class);

		Name name = new Name("Atul", "Pandey");
		String dOB = "MM-dd-yyyy";
		DateFormat dateFormat = new SimpleDateFormat(dOB, Locale.ENGLISH);

		Date date = dateFormat.parse("06-30-1996");
		ArrayList<Name> knownAliases = new ArrayList<Name>();
		knownAliases.add(new Name("Shujaat", "Ali"));
		knownAliases.add(new Name("Mamta", "Baboria"));
		knownAliases.add(new Name("Divya", "Srivastav"));

		Source source = new Source(name, date, knownAliases);

		Dest map = mapperFacade.map(source, Dest.class);
		
		logger.info(map.getFirstName());

	}
}
