package duong.demo.aspectdemo.service;

import duong.demo.aspectdemo.model.CustomAnnotation;
import duong.demo.aspectdemo.repository.Dao2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyService2 {

    private final Dao2 dao;

    public MyService2(Dao2 dao) {
        this.dao = dao;
    }

    public String calculateSomething() {
        log.info("Calculate something from service 2!!!!");
        return dao.retrieveValue();
    }

    @CustomAnnotation
    public void myAnnotatedMethod() throws Exception {
        log.info("Throwing exception from an annotated method!!!");
        throw new Exception("Exception");
    }
}
