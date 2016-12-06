package external.resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class BannerLoader implements ResourceLoaderAware {
	private ResourceLoader resourceLoader;

	public BannerLoader() {

	}

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	public void showBanner() throws IOException {
		//Resource banner = resourceLoader.getResource("file:C:/devenv/eclipse_workspaces/PracticeWorkspace/SpringCore/src/main/java/external/resources/banner.txt");
		Resource banner = resourceLoader.getResource("classpath:external/resources/banner.txt");
		//C:\devenv\eclipse_workspaces\PracticeWorkspace\SpringCore\src\main\java\external\resources
		InputStream in = banner.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		while( true ){
			String line = reader.readLine();
			if( line == null) break;
			System.out.println(line);
		}
		reader.close();
	}
}
