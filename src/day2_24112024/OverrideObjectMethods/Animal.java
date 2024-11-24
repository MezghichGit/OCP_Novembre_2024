package day2_24112024.OverrideObjectMethods;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Animal {
	int age;
	String nom;
	@Override
	public String toString() {
		//return "Animal [age=" + age + ", nom=" + nom + "]";
		//return ToStringBuilder.reflectionToString(this);
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
