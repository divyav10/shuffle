package com.divya.shuffle.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Songs {
	
	public static <T> List<T> createSong(){
		 List<T> songlist = new ArrayList<T>();
		 for(int i = 0; i < 100; i++) {
	    	songlist.add(i,(T) ("song"+(i+1)));
	    }
		 return songlist;
	}
	
	
    
	
}
