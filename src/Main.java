public class Main {
    public static void main(String[] args) {

        CPU cpu = new CPU("i7", 2000, 5, "intel");
        Motherboard motherboard = new Motherboard("b560","MSI");
        HardDrive hardDrive = new HardDrive("western digital", 4000,Type.HDD);
        Ram ram = new Ram(8000, "goodRam", "l56", 3600);




        PC pc = new PC("Ultra PC",cpu,motherboard,ram,hardDrive);
        System.out.println("Default CPU frequency: " + pc.getCPUSFrequency());
        System.out.println("Default CPU Generation: " + pc.getCpu().getGeneration());

        System.out.println("----------------------------------------------------------");
        pc.setCPUModel("Ryzen7");
        System.out.println("new CPU model: " + pc.getCpu().getModel());
        pc.increaseCPUFrequency(200);
        System.out.println("increased CPU Frequency: " + pc.getCPUSFrequency());
        System.out.println("----------------------------------------------------------");
        pc.decreaseCPUFrequency(100);
        System.out.println("decreased CPU frequency: " + pc.getCPUSFrequency());
        System.out.println("----------------------------------------------------------");
        pc.increaseCPUGeneration(1);
        System.out.println("increased CPU Generation: " + pc.getCpu().getGeneration());
        System.out.println("----------------------------------------------------------");
        pc.decreaseCPUGeneration(1);
        System.out.println("decreased CPU Generation: " + pc.getCpu().getGeneration());
        System.out.println("----------------------------------------------------------");
        pc.changeCPUProducer("AMD");
        System.out.println("new CPU producer" + pc.getCpu().getProducer());
        System.out.println("----------------------------------------------------------");

        pc.increaseHardDriveVolume(2000);
        System.out.println("increased HardDrive Volume: " + pc.getHard().getVolume());


    }
}
