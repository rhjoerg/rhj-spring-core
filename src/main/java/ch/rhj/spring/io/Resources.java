package ch.rhj.spring.io;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author Roger H. Jörg
 */
public class Resources {

	public static ClassPathResource classPathResource(String path) {

		return new ClassPathResource(path);
	}

	public static byte[] resourceToBytes(Resource resource) throws IOException {

		try (InputStream input = resource.getInputStream()) {

			return IOUtils.toByteArray(input);
		}
	}

	public static String resourceToString(Resource resource, Charset charset) throws IOException {

		return new String(resourceToBytes(resource), charset);
	}

	public static String resourceToString(Resource resource) throws IOException {

		return resourceToString(resource, UTF_8);
	}
}
