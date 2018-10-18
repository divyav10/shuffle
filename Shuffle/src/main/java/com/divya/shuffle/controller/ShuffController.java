package com.divya.shuffle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divya.shuffle.chk.RandomizeList;
import com.divya.shuffle.data.Songs;

@RestController
@RequestMapping("/songs")

public class ShuffController {

	//private static Songs songs;
	//private static RandomizeList randomizeList;
	 //static List<T> list= new ArrayList <T>();
	@GetMapping("/playList")
	public static<T> List<T> getShuffleSongs() { 
		return RandomizeList.shuffle(Songs.createSong());
	}
	
	@GetMapping("/playList/prev/{song}")
	public static<T> T getprevSongs(@PathVariable T song) {
		return RandomizeList.getPrev(RandomizeList.shuffle(Songs.createSong()), song);
	}
	
	@GetMapping("/playList/next/{song}")
	public static<T> T getnextSongs(@PathVariable T song) {
		return RandomizeList.getNext(RandomizeList.shuffle(Songs.createSong()), song);
	}
	
}
