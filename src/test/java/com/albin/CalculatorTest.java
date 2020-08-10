package com.albin;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;

public class CalculatorTest {
Calculator c=null;
 //CalculatorService service=mock(CalculatorService.class);

//To use Annotations ...
@Mock
CalculatorService service;

@Rule public MockitoRule rule=MockitoJUnit.rule();



@Before
public void setUp() {
	
	c=new Calculator(service);
}
	@Test
	public void testAdd() {
		when(service.add(5, 2)).thenReturn(7);
		//System.out.println(((CalServiceImpl)service).x);
		System.out.println(service.getA());
		assertEquals(14, c.compute(5, 2));
		verify(service).add(5, 2);//This is to verify whether calculator really called the service or not
		//In other words is there any interactions with mock or not ...
	}

}
