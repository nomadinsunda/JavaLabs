package com.intheeast.annotations;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.MODULE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

@ClassPreamble (
   author = "John Doe",
   date = "3/17/2002",
   currentRevision = 6,
   lastModified = "4/12/2004",
   lastModifiedBy = "Jane Doe",
   // Note array notation
   reviewers = {"Alice", "Bob", "Cindy"}
)
@SuppressWarnings("Genrration3List")
public class Generation3List {
	
	//@Target({TYPE, 
	//         FIELD, 
	//         METHOD, 
	//         PARAMETER, 
	//         CONSTRUCTOR, 
	//         LOCAL_VARIABLE, 
	//         MODULE})

	
	@SuppressWarnings("a")
	private int a;
	
	@SuppressWarnings("default constructor")
	public Generation3List() {
		
	}
	
	@SuppressWarnings("hello")
	public void hello() {
		@SuppressWarnings("hello local")String hello = "Hello!";
	}
	
//	public void world(@NonNull String world) {
//		
//	}
	
	/**
	 * 이 메서드는 xxxx 입니다.
	 */
	@SuppressWarnings("removal")
	public static void suppressDeprecated() {
		// The constructor Integer(int) has been deprecated since version 9 and marked for removal
		Integer num = new Integer(3);
		
		List<String> lists = new ArrayList<>();
	}

}
