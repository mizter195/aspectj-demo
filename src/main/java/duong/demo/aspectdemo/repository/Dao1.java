package duong.demo.aspectdemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    public String retrieveValue() {
        return "value from dao1";
    }

}
