public static String classNameNormalize(String className) {
		String s = new String(className);
		int n;
		while (true) {
			n = s.indexOf(".");
			s = s.substring(n + 1, s.length());
			if (n == -1) {
				return s;
			} 
		} 
	}