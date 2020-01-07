package fr.epsi.todolist2020.service.util;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;

public class DozerUtils {
	
	public static <T, U> List<U> map(final Mapper mapper, final List<T> source, final Class<U> destType) {

	    final List<U> dest = new ArrayList<U>();

	    for (T element : source) {
	        dest.add(mapper.map(element, destType));
	    }

	    return dest;
	}

}
