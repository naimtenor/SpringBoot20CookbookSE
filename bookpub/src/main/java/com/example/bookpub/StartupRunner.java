package com.example.bookpub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.bookpub.repository.BookRepository;

public class StartupRunner implements CommandLineRunner {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	/*// 데이터 소스 정보를 출력
	@Autowired
	private DataSource ds;

	@Override
	public void run(String... args) throws Exception {
		logger.info("DataSource: " + ds.toString());
	}*/

	// 책의 개수를 출력
	@Autowired
	private BookRepository bookRepository;

	public void run(String... args) throws Exception {
		logger.info("책의 개수 : " + bookRepository.count());
	}
}
