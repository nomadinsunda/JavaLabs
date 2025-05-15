package com.intheeast.annotations;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.MODULE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;

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

}
