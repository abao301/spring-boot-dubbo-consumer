package com.jiutong.bnote;

import com.jiutong.bnote.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class AppTest{

    @Autowired
   private DemoService demoService;

    @Test
    public void testRemote(){
       String str = demoService.sayHello("aaaa");
        System.out.println("返回结果:"+str);
    }
}
