public class Device {
    private String id = "";
    private String model = "";
    private int year;

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

    public void printInfo() {
        System.out.println("设备编号：" + (id.isEmpty() ? "未登记" : id));
        System.out.println("设备型号：" + model);
        System.out.println("投用年份：" + year);
    }
}
