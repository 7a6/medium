package org.sevenasix.medium;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.sevenasix.medium.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

public class DataSourceTest {



    @Test
    public void testDataConfig(){
        UserRepository repository = mock(UserRepository.class);

        assertNull(repository);
    }
}
