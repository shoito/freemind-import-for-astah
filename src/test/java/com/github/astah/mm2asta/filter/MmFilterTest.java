package com.github.astah.mm2asta.filter;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class MmFilterTest {

	@Test
	public void acceptOnlyMmFiles() {
		MmFilter filter = new MmFilter();
		File mm = new File("hoge.mm");
		boolean mmAccepted = filter.accept(mm);
		assertTrue(mmAccepted);
		
		mm = new File("hoge.mx");
		mmAccepted = filter.accept(mm);
		assertFalse(mmAccepted);
		
		mm = new File("fuga/hoge.mx");
		mmAccepted = filter.accept(mm);
		assertFalse(mmAccepted);
	}
}
