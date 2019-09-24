import org.skm.app.WebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * Created by zjuskm
 * 2019-09-22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = WebApplication.class)
public class DataSourceTest {
    @Autowired
    ApplicationContext applicationContext;


    @Test
    public void testDataSource() throws Exception {
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getClass().getName());
    }
}
