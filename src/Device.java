public class Device {
    private String id = "";
    private String model = "";
    private int year;
    private final TemperatureSensor[] sensors = new TemperatureSensor[2];

    public Device() {}

    public Device(String id, String model, int year) {
        setId(id);
        setModel(model);
        setYear(year);
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("设备编号不能为空，拒绝登记。");
            return;
        }
        this.id = id;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            System.out.println("设备型号不能为空，拒绝登记。");
            return;
        }
        this.model = model;
    }

    public void setYear(int year) {
        if (year <= 0) {
            System.out.println("投用年份必须为正整数，拒绝登记。");
            return;
        }
        this.year = year;
    }

    public void attachSensor(TemperatureSensor sensor) {
        if (sensor == null) {
            System.out.println("传感器不能为空，拒绝挂接。");
            return;
        }
        for (int i = 0; i < sensors.length; i++) {
            if (sensors[i] == null) {
                sensors[i] = sensor;
                return;
            }
        }
        System.out.println("已挂接2支传感器，拒绝继续挂接。");
    }

    public void replaceSensor(int position, TemperatureSensor sensor) {
        if (position < 1 || position > 2 || sensor == null) {
            System.out.println("位置须为1或2，传感器不能为空，拒绝更换。");
            return;
        }
        if (sensors[position - 1] == null) {
            System.out.println("该位置未挂接传感器，拒绝更换。");
            return;
        }
        sensors[position - 1] = sensor;
    }

    public void printInfo() {
        System.out.println("设备编号：" + (id.isEmpty() ? "未登记" : id));
        System.out.println("设备型号：" + model);
        System.out.println("投用年份：" + year);
        if (sensors[0] == null) {
            System.out.println("未挂接传感器");
        } else {
            for (int i = 0; i < sensors.length; i++) {
                if (sensors[i] != null) {
                    System.out.println("传感器" + (i + 1) + "：" + sensors[i].getId());
                    System.out.println("当前读数（℃）：" + sensors[i].getReading());
                }
            }
        }
    }
}
