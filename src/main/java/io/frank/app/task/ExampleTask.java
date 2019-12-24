package io.frank.app.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * @author : Frank F
 * @ClassName: ExampleTask
 * @Descripsion :
 * @Date : 2019-12-25 00:08
 * @Version :  0.0.1
 */


@Configuration
public class ExampleTask {
    private final static Logger logger = LoggerFactory.getLogger(ExampleTask.class);

    @Scheduled(fixedRate = 2000)
    public void printDate() {
        logger.info("now {}", new Date());
    }
}
