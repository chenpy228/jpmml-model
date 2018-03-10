/*
 * Copyright (c) 2018 Villu Ruusmann
 */
package org.jpmml.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class StringUtilTest {

	@Test
	public void trim(){
		String string = "";

		assertSame(string, StringUtil.trim(string));

		string = "token";

		assertSame(string, StringUtil.trim(string));

		string = "\ttoken";

		assertSame(string, StringUtil.trim(string));

		string = "token\n";

		assertEquals("token", StringUtil.trim(string));

		string = "token\r\n";

		assertEquals("token", StringUtil.trim(string));

		string = "\ttoken\n";

		assertEquals("\ttoken", StringUtil.trim(string));

		string = "\ttoken\r\n";

		assertEquals("\ttoken", StringUtil.trim(string));
	}
}