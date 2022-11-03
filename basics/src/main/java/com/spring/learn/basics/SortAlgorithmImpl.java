package com.spring.learn.basics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortAlgorithmImpl {

	Logger logger = LoggerFactory.getLogger(SortAlgorithmImpl.class);
	@Autowired
	@Qualifier("quick")
	SortAlgorithm sortAlgorithm;

	//
	// public SortAlgorithmImpl(SortAlgorithm sortAlgorithm) {
	// super();
	// this.sortAlgorithm = sortAlgorithm;
	// }

	public int findNumber(int[] numbers, int numbertobeFind) {

		// Sort
		System.out.println(sortAlgorithm);
		numbers = sortAlgorithm.sort(numbers);
		return 2;
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("Post construct{}", sortAlgorithm);

	}

	@PreDestroy
	public void preDestroy() {
		logger.info("PRE Destroy {}", sortAlgorithm);

	}

}
