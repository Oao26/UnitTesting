package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    List<Integer> list;
    @BeforeEach
    public void helper(){
        list = Arrays.asList(1,2,4,2,5);
    }
    @Test
    public void deduplicate() {
        List<Integer> expected = Arrays.asList(1,2,4,5);
        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> distinct = deduplicator.deduplicate(list, new ListSorter());

        Assertions.assertEquals(expected, distinct);
    }

    @Test
    public void deduplicate_bug(){
        list = Arrays.asList(1,2,4,2);
        List<Integer> expected = Arrays.asList(1,2,4);
        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> distinct = deduplicator.deduplicate(list, new ListSorter());

        Assertions.assertEquals(expected, distinct);
    }
}
