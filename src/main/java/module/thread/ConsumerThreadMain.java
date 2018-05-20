package module.thread;


import module.producer.ProducerThread;


public class ConsumerThreadMain {

    public static void main(String[] args){
        String brokers = "120.24.209.240:9092";
        String groupId = "group01";
        String topic = "HelloWorld";
        int consumerNumber = 3;


        Thread producerThread = new Thread(new ProducerThread(brokers,topic));
        producerThread.start();

        ConsumerThread consumerThread = new ConsumerThread(brokers,groupId,topic);
        consumerThread.start(3);


    }
}