package com.hanwq.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Description: ddrabbitmqhello
 * Created by hanwq on 2019/5/20 18:09
 */
@Component
@RabbitListener(queues = "hello", containerFactory="rabbitListenerContainerFactory")
public class Receiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }

}