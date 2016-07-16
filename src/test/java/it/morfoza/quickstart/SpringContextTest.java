package it.morfoza.quickstart;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class SpringContextTest {

    @Test
    public void isBootingUp() {
        AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
        assertNotNull(context);
    }
}
