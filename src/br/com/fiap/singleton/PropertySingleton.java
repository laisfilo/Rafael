package br.com.fiap.singleton;

import java.io.IOException;

import java.util.Properties;

public class PropertySingleton {
		private static Properties p;
		private static final String ARQ = "/arquivos.properties";
		public static Properties getInstance() {
			if (p == null){
				try {
					p = new Properties();					
					p.load(PropertySingleton.class.getResourceAsStream(ARQ));
				} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return p;
	}
}

