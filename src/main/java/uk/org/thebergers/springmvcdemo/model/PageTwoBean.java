package uk.org.thebergers.springmvcdemo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageTwoBean extends PageOneBean {
	String email;

	String lastName;
}
