package org.sevenasix.medium;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNull;

public class DataSourceTest {

    @Autowired
    ComboPooledDataSource comboPooledDataSource;

    @Test
    public void testDataConfig(){
        assertNull(comboPooledDataSource);
    }
}
