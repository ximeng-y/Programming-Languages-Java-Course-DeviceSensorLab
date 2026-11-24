public class LabDemo {
    public static void main(String[] args) {
        Device device1 = new Device();
        device1.setId("D001");
        device1.setModel("PUMP-A");
        device1.setYear(2020);
        Device device2 = new Device("D002", "HEATER-B", 2022);

        TemperatureSensor sensor1 = new TemperatureSensor();
        sensor1.setId("T001");
        sensor1.setUpperLimit(150.0);
        TemperatureSensor sensor2 = new TemperatureSensor("T002", 100.0);
        TemperatureSensor sensor3 = new TemperatureSensor("T003", 200.0);

        System.out.println("===== F1、F2：设备登记与传感器初始状态 =====");
        device1.printInfo();
        device2.printInfo();
        sensor1.printInfo();
        sensor2.printInfo();
        sensor3.printInfo();
        new Device("", "PUMP-A", 2020).printInfo();
        new Device(null, "PUMP-A", 2020).printInfo();

        System.out.println("===== F3、F4：更新读数与查询信息 =====");
        sensor1.setReading(85.0);
        sensor1.setReading(160.0);
        sensor1.printInfo();
        sensor1.setReading(-1.0);
        sensor1.printInfo();
        sensor1.setReading(0.0);
        sensor1.printInfo();
        sensor1.setReading(150.0);
        sensor1.printInfo();
        sensor1.setReading(85.0);
        sensor2.setReading(40.0);
        sensor3.setReading(60.0);
    }
}
