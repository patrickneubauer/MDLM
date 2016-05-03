package at.ac.tuwien.big.xmltext;


import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class DatatypeValueConverter extends DefaultTerminalConverters {
	@ValueConverter(rule = "String0")
	public IValueConverter<String> String() {
		return new IValueConverter<String>() {

			@Override
			public String toValue(String string, INode node) throws ValueConverterException {
				String regex = "/^[A-z]+$/";
				//Pattern p = Pattern.compile(regex);
				return regex;
			}

			@Override
			public String toString(String value) throws ValueConverterException {
				return value;
			}
		};
	}
}


