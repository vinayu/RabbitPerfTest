package rabbitproducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pivotal.io.rabbitmq.perftest.RabbitPerfTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RabbitPerfTest.class)
public class RabbitProducerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
