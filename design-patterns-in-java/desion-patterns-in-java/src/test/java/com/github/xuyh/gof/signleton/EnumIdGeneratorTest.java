package com.github.xuyh.gof.signleton;

import com.github.xuyh.gof.singleton.EnumIdGenerator;

import org.junit.jupiter.api.Test;

public class EnumIdGeneratorTest {
    @Test
    public void test() {
        EnumIdGenerator idGenerator = EnumIdGenerator.INSTANCE;
        System.out.println(idGenerator.getId());
        System.out.println(idGenerator.getId());
        System.out.println(idGenerator.getId());
    }
}
