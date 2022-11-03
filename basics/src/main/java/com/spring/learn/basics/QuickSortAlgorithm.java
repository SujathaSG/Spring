package com.spring.learn.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

}
