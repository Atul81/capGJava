package orikaModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Source {
	private Name name;
	private List<Name> knownAliases;
	private Date birthDate;

	public Source(Name name, Date birthDate, List<Name> knownAliases) {
		this.name = name;
		this.birthDate = (Date) birthDate.clone();
		this.knownAliases = new ArrayList<Name>(knownAliases);
	}

	public List<Name> getKnownAliases() {
		return Collections.unmodifiableList(knownAliases);
	}

	public Name getName() {
		return name;
	}

	public Date getBirthDate() {
		return (Date) birthDate.clone();
	}
}

class Name {
	private String first;
	private String last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}
}