public class Lot {
    private String brand;
    private Integer randomAccessMemory;
    private Integer hardDiskDrive;
    private String operatSystem;
    private String colore;
    private Integer price;
    private Integer stock;

    public Lot(String brand, Integer randomAccessMemory, Integer hardDiskDrive, String operatSystem, String colore,
            Integer price, Integer stock) {
        this.brand = brand;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDiskDrive = hardDiskDrive;
        this.operatSystem = operatSystem;
        this.colore = colore;
        this.price = price;
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public Integer getHardDiskDrive() {
        return hardDiskDrive;
    }

    public String getOperatSystem() {
        return operatSystem;
    }

    public String getColore() {
        return colore;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer changePrice(int price) {
        return price;
    }

    public Integer changeStock(int stock) {
        return stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        String result = "Бренд  " + brand + "\n" + "ОЗУ " + randomAccessMemory + "\n" + "Объем ЖД " + hardDiskDrive
                + "\n" +
                "Операционная система " + operatSystem + "\n" + "Цвет " + colore + "\n" + "Цена " + price + "\n"
                + "Остаток " + stock;
        return result;
    }
}

