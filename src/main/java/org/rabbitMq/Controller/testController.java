package org.rabbitMq.Controller;

import org.rabbitMq.sender.FanoutSender;
import org.rabbitMq.sender.Person1Sender;
import org.rabbitMq.sender.Person4Sender;
import org.rabbitMq.sender.Person5Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//testController.java
@Controller
public class testController {
    @Autowired
    Person1Sender person1Sender;
    @Autowired
    Person4Sender person4Sender;
    @Autowired
    Person5Sender person5Sender;
    @Autowired
    FanoutSender fanoutSender;
    @RequestMapping("/")
    @ResponseBody
    public String test() throws InterruptedException {
//        测试RabbitMQ的简单使用[不能直接解掉注释使用，若要测试，请看Person1Sender.java]
//        person1Sender.send();



//        测试一对多
//        for (int i = 0; i < 50; i++) {
//            person1Sender.send(i);
//        }



//        测试多对多
//        for (int i = 0; i < 50; i++) {
//            person1Sender.send(i);
//            person4Sender.send(i);
//        }



//        测试topic类型
//        person5Sender.send1();
//        Thread.sleep(1000);
//        System.out.println("==========================");
//        person5Sender.send2();
//        Thread.sleep(1000);
//        System.out.println("==========================");
//        person5Sender.send3();
//        Thread.sleep(1000);
//        System.out.println("==========================");
//        person5Sender.send4();



//        测试fanout类型
//        fanoutSender.send1();
//        Thread.sleep(1000);
//        System.out.println("==========================");
//        fanoutSender.send2();
//        Thread.sleep(1000);
//        System.out.println("==========================");
//        fanoutSender.send3();
        return "test";
    }
}
