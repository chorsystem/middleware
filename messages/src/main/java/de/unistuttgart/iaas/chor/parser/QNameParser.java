package de.unistuttgart.iaas.chor.parser;

import javax.xml.namespace.QName;

public class QNameParser{


	 public static String printQName(QName value) {
	       
		 
		 return value.toString();
	    }
	 
	    public static QName parseQName(String value) {
	        return QName.valueOf(value);
	    }
	

}
