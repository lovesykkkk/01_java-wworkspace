package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class FileCharRun {
	// 자동완성 주석 해제 code templates => method, catch
	public static void main(String [] args) {
		FileCharDao dao = new FileCharDao();
		//dao.fileSave();
		dao.fileRead();
	}
}
