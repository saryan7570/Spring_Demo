package com.cg.editor;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

public class SqlDateEditor extends PropertyEditorSupport {

	public SqlDateEditor() {
		super();
	}
	
	public String getAsText() {
		return getValue().toString();
	}
	
	public void setAsText(String text) {
		if(text.equalsIgnoreCase("getDate()")){
			Date date = new Date(System.currentTimeMillis());
			setValue(date);
		}
		else {
			setValue(Date.valueOf(text));
		}
	}
}