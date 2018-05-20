package module.thread;

import org.apache.kafka.clients.consumer.ConsumerRecord;


public class ConsumerThreadHandler implements Runnable {
    private ConsumerRecord consumerRecord;

    public ConsumerThreadHandler(ConsumerRecord consumerRecord){
        this.consumerRecord = consumerRecord;
    }

    @Override
    public void run() {
        System.out.println("Consumer Message:"+consumerRecord.value()+",Partition:"+consumerRecord.partition()+"Offset:"+consumerRecord.offset());
    }
}
