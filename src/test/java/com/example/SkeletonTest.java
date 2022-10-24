package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SkeletonTest {

    @Test
    public void isSupposedToFail() throws Exception {
        assertThat(1+1).isEqualTo(3);
    }

}
