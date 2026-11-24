public class TemperatureSensor {
    private String id = "";
    private double upperLimit;
    private double reading;

    public TemperatureSensor() {}

    public TemperatureSensor(String id, double upperLimit) {
        setId(id);
        setUpperLimit(upperLimit);
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("传感器编号不能为空，拒绝登记。");
            return;
        }
        this.id = id;
    }

    public void setUpperLimit(double upperLimit) {
        if (!(upperLimit > 0 && upperLimit >= reading)) {
            System.out.println("量程上限必须为正数且不小于当前读数，拒绝更新。");
            return;
        }
        this.upperLimit = upperLimit;
    }

    public void setReading(double reading) {
        if (!(reading >= 0 && reading <= upperLimit)) {
            System.out.println("读数超出[0, " + upperLimit + "]，拒绝更新。");
            return;
        }
        this.reading = reading;
    }

    public String getId() {
        return id;
    }

    public double getReading() {
        return reading;
    }

    public void printInfo() {
        System.out.println("传感器编号：" + (id.isEmpty() ? "未登记" : id));
        System.out.println("量程上限（℃）：" + upperLimit);
        System.out.println("当前读数（℃）：" + reading);
    }
}
