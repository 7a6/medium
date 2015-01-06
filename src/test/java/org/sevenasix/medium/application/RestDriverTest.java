package org.sevenasix.medium.application;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;

@ComponentScan ({"org.sevenasix.medium.actors", "org.sevenasix.medium.registrar"})
@EnableAutoConfiguration
public class RestDriverTest {

    boolean connected = false;

    @Before
    public void setup(){
        if(!connected){
            SpringApplication.run(RestDriverTest.class, new String[0]);
            connected = true;
        }
    }

    @Test
    public void checkNameExists() throws IOException {

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String studentName = "TestStudent";

        URL url = new URL("http://localhost:8080/student?name=" + studentName);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        System.out.println("conn = " + conn.getResponseCode() + ", msg = " + conn.getResponseMessage());
        ReadableByteChannel byteChannel = Channels.newChannel(conn.getInputStream());

        StringBuilder stringBuilder = new StringBuilder();
        int bytesReadCount = 0;
        while((bytesReadCount = byteChannel.read(buffer)) > 0){
            byte[] data = new byte[bytesReadCount];
            System.arraycopy(buffer.array(), 0, data, 0, bytesReadCount);
            buffer.clear();
            stringBuilder.append(new String(data, Charset.forName("US-ASCII")));

        }
        assertTrue(stringBuilder.toString().contains(studentName));
    }

}
