package duong.demo.aspectdemo;

import duong.demo.aspectdemo.service.MyService1;
import duong.demo.aspectdemo.service.MyService2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class AspectDemoApplicationTests {

    @Autowired
    MyService1 service1;

    @Autowired
    MyService2 service2;

    @Test
    void invokeCalculateMethod() {
        log.info(service1.calculateSomething());
        log.info(service2.calculateSomething());
        try {
            service2.myAnnotatedMethod();
        } catch (Exception e) {
            log.info("Throwing exception");
        }
    }

}
