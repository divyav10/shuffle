package com.divya.shuffle;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.divya.shuffle.chk.RandomizeList;
import com.divya.shuffle.data.Songs;

@SpringBootApplication
public class ShuffleApplication {
	
	public static <T> void main(String[] args) {
		SpringApplication.run(ShuffleApplication.class, args);
		//to test
		List<T> songlist= Songs.createSong();
		System.out.println("songlist "+ songlist);
		List<T> shufflesonglist= RandomizeList.shuffle(songlist);
		System.out.println("shufflesonglist "+ shufflesonglist);
		T prev= RandomizeList.getPrev(shufflesonglist,(T) "song11");
		System.out.println("prev "+ prev);
		T next= RandomizeList.getNext(shufflesonglist,(T) "song11");
		System.out.println("next "+ next);
		
		
	}
}

