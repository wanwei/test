package com.esen.spring.sample.test;

public class AnalyseImpl implements Analyse {

	@Override
	public String getResult(String s) {
		if (s == null)
			return null;
		if (s.equals("ww"))
			return "true";
		if (s.equals("wanwei"))
			return "false";

		return null;
	}

}
