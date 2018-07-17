package com.example.bookpub;

import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.bookpub.entity.Author;
import com.example.bookpub.entity.Book;
import com.example.bookpub.entity.Publisher;
import com.example.bookpub.repository.AuthorRepository;
import com.example.bookpub.repository.BookRepository;
import com.example.bookpub.repository.PublisherRepository;

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
	@Autowired 
	private AuthorRepository authorRepository;
    @Autowired 
    private PublisherRepository publisherRepository;

	public void run(String... args) throws Exception {
		//logger.info("책의 개수 : " + bookRepository.count());
//		logger.info("도서 관리 시스템에 오신 것을 환영합니다.");
//        Author author = new Author("Alex", "Antonov");
//        author = authorRepository.save(author);
//        Publisher publisher = new Publisher("Packt");
//        publisher = publisherRepository.save(publisher);
//        Book book = new Book("978-1-78528-415-1", "Spring Boot Recipes", author, publisher);
//        bookRepository.save(book);
	}
	
	// 예약 작업 실행기를 사용한 주기적 책의 개수 출력
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public void run() {
		logger.info("책의 개수 : " + bookRepository.count());
	}
}
