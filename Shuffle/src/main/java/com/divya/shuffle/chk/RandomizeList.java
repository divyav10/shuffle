package com.divya.shuffle.chk;

import java.util.Arrays; 
import java.util.Collections; 
import java.util.List; 
import java.util.Random;
 
public class RandomizeList { 
	
	public static<T> List<T> shuffle(List<T> list)
	{
		Random random = new Random();
		for (int i = list.size() - 1; i >= 1; i--)
		{
			int j = random.nextInt(i + 1);
			T obj = list.get(i);
			list.set(i, list.get(j));
			list.set(j, obj);
		}
		return list;
	}
	public static<T> List<T> inbuiltshuffle(List<T> list)
	{
		Collections.shuffle(list);
		return list;
	}
	public static<T> T getPrev(List<T> list, T song) 
	{
		T prev;
		int index=0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(song)) {
				index=i;
			}
		}
		if(index==0) {
			prev = null;
		}			
		else {
			prev = list.get(index-1);
		}
		return prev;
	}
	public static<T> T getNext(List<T> list, T song) 
	{
		T next;
		int index=0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(song)) {
				index=i;
			}
		}
		if(index==list.size()-1) {
			next = null;
		}			
		else {
			next = list.get(index+1);
		}
		return next;
	}
} 
	


