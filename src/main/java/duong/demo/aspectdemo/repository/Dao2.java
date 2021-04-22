package duong.demo.aspectdemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

    public String retrieveValue() {
        return "value from Dao2";
    }
}
