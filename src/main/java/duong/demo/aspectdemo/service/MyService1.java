package duong.demo.aspectdemo.service;

import duong.demo.aspectdemo.repository.Dao1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyService1 {

    private final Dao1 dao;

    public MyService1(Dao1 dao) {
        this.dao = dao;
    }

    public String calculateSomething() {
        log.info("I'm doing some maths and will return you a value");
        return dao.retrieveValue();
    }
}
