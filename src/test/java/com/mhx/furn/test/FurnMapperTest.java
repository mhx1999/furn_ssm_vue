package com.mhx.furn.test;

import com.mhx.furn.Bean.Furn;
import com.mhx.furn.Bean.Msg;
import com.mhx.furn.Dao.FurnMapper;
import com.mhx.furn.Service.FurnService;
import com.mhx.furn.Service.impl.FurnServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author 马海鑫
 * @version 1.0
 */
public class FurnMapperTest {

private  ApplicationContext ioc;
private FurnService furnService;

@Before
public void init(){
    ioc =new ClassPathXmlApplicationContext("spring.xml");
    furnService = ioc.getBean(FurnService.class);
}
    @Test
    public void serviceTest(){

   ;
        Furn furn = new Furn(null, "mhxtest", "mhx22", new BigDecimal(100), 100, 100, "assets/images/product-image/14.jpg");
            furnService.save(furn);
            Msg success = Msg.success();
        System.out.println(success);
        }

}
