package com.dheepak.learning.java.random.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortExample {

    public static List<String> getSongsList() {
        List<String> songs = new ArrayList<>();
        songs.add("somerault");
        songs.add("cassidy");
        songs.add("havana");
        songs.add("$10");
        songs.add("50 ways");
        songs.add("Cassidy");
        return songs;
    }
    public static void main(String[] args) {
//        List<String> songs = getSongsList();
//        Collections.sort(songs);
//        Collections.sort(songs, String::compareTo);
//        System.out.println(songs);

        Stream.of(1, 1, 2, 3, 5)
                .peek(System.out::println)
                .count();
    }
}
