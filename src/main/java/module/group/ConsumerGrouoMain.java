package module.group;


import module.producer.ProducerThread;

class ConsumerGroupMain {

    public static void main(String[] args){
        String brokers = "120.24.209.240:9092";
        String groupId = "group01";
        String topic = "test";
        int consumerNumber = 1;

        Thread producerThread = new Thread(new ProducerThread(brokers,topic));
        producerThread.start();

        ConsumerGroup consumerGroup = new ConsumerGroup(brokers,groupId,topic,consumerNumber);
        consumerGroup.start();
    }
}
