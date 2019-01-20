package com.java.myrotiuk.qubit.message;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Ivan on 20.01.2019. All rights reserved.
 */
public class ShowMessageServiceTest {
    @Test
    public void shouldShowFreedomRocksAsItIsDividedBy3And5() throws Exception {
        assertThat(ShowMessageService.show(15), is("FreedomRocks"));
    }

    @Test
    public void shouldShowRocksAsItIsDividedBy5() throws Exception {
        assertThat(ShowMessageService.show(5), is("Rocks"));
    }

    @Test
    public void shouldShowFreedomAsItIsDividedBy3() throws Exception {
        assertThat(ShowMessageService.show(9), is("Freedom"));
    }

    @Test
    public void shouldShowFreedomRocksAsItIsDividedNegativeNumBy3And5() throws Exception {
        assertThat(ShowMessageService.show(-15), is("FreedomRocks"));
    }

    @Test
    public void shouldShowRocksAsItIsDividedNegativeNumBy5() throws Exception {
        assertThat(ShowMessageService.show(-5), is("Rocks"));
    }

    @Test
    public void shouldShowFreedomAsItIsDividedNegativeNumBy3() throws Exception {
        assertThat(ShowMessageService.show(-9), is("Freedom"));
    }

    @Test
    public void shouldShowFreedomAndRocksAsItIsDividedBy3And5() throws Exception {
        assertThat(ShowMessageService.show(0), is("FreedomRocks"));
    }

}