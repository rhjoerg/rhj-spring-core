package ch.rhj.spring.io;

import static ch.rhj.spring.io.Resources.classPathResource;
import static ch.rhj.spring.io.Resources.resourceToString;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ResourcesTests {

	@Test
	public void testCtor() {

		new Resources();
	}

	@Test
	public void testResourceToString() throws Exception {

		String expected = "hello, world!";
		String actual = resourceToString(classPathResource("/hello.txt"));

		assertEquals(expected, actual);
	}
}
