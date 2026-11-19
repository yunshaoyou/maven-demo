package com.yunshao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * 单元测试：验证依赖可用与逻辑正确。
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testTrimWithCommonsLang3() {
        assertEquals("maven demo", StringUtils.trim("  maven demo  "));
    }
}
