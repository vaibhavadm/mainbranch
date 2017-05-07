/**
 * 
 */
package org.vaibhav.spring.mvc.propertyeditor;

import java.beans.PropertyEditorSupport;

/**
 * @author VAIBHAVREDDYGUDDETI
 *May 4, 2017
 */
//Custom propertyEditor
public class StudentNamePropertyEditor extends PropertyEditorSupport{
	
	public void setAsText(String studentName){
		if(studentName.contains("Mr.") || studentName.contains("Mrs.")){
			setValue(studentName);
		}else{
			setValue("Mrs. "+ studentName);
		}
	}
}
