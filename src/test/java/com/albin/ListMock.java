package com.albin;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

public class ListMock {

	@Test
	public void test() {
		 List listMock=mock(List.class);
		 System.out.println("Size : "+listMock.size());
		 when(listMock.size()).thenReturn(2);
		 System.out.println("Size : "+listMock.size());
		 assertEquals(2, listMock.size());
		 System.out.println(listMock.get(0));
	}

}
