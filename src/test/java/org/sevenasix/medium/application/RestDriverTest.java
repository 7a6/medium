package org.sevenasix.medium.application;

import org.junit.Before;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

import static junit.framework.TestCase.assertTrue;

@Configuration
@EnableMongoRepositories
@Import(RepositoryRestMvcConfiguration.class)
@ComponentScan ({"org.sevenasix.medium.actors", "org.sevenasix.medium.registrar", "org.sevenasix.medium.repo"})
public class RestDriverTest {

    boolean connected = false;

    @Before
    public void setup(){
        if(!connected){
            ApplicationContext context = new AnnotationConfigApplicationContext(RestDriverTest.class);
            //context.getMessage()
            //SpringApplication.run(RestDriverTest.class, new String[0]);
            connected = true;
        }
    }

    @Test
    public void checkNameExists() throws IOException {

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String studentName = "TestStudent";

        URL url = new URL("http://localhost:8080/student?name=" + studentName);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        ReadableByteChannel byteChannel = Channels.newChannel(conn.getInputStream());

        StringBuilder stringBuilder = new StringBuilder();
        int bytesReadCount;
        while((bytesReadCount = byteChannel.read(buffer)) > 0){
            byte[] data = new byte[bytesReadCount];
            System.arraycopy(buffer.array(), 0, data, 0, bytesReadCount);
            buffer.clear();
            stringBuilder.append(new String(data, Charset.forName("UTF8")));
        }
        assertTrue(stringBuilder.toString().contains(studentName));
    }

}
