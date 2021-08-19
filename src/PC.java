public class PC {
    private String moder;
    private CPU cpu;
    private Motherboard motherboard;
    private Ram ram;
    private HardDrive hard;

    public PC() {
    }

    public PC(String moder, CPU cpu, Motherboard motherboard, Ram ram, HardDrive hard) {
        this.moder = moder;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ram = ram;
        this.hard = hard;
    }


    public void setModer(String moder) {
        this.moder = moder;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setHard(HardDrive hard) {
        this.hard = hard;
    }

    public String getModer() {
        return moder;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public HardDrive getHard() {
        return hard;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "PC{" +
                "moder='" + moder + '\'' +
                ", cpu=" + cpu +
                ", motherboard=" + motherboard +
                ", hard=" + hard +
                '}';
    }

    public int getCPUSFrequency(){
        return this.getCpu().getFrequency();
    }

    public void increaseCPUFrequency(int number) {
        this.cpu.setFrequency(getCpu().getFrequency() + number);
    }
    public void decreaseCPUFrequency(int number) {
        this.cpu.setFrequency(getCpu().getFrequency() - number);
    }

    public void increaseCPUGeneration(int gen){
        this.cpu.setGeneration(getCpu().getGeneration() + gen);
    }
    public void decreaseCPUGeneration(int gen){
        this.cpu.setGeneration(getCpu().getGeneration() - gen);
    }

    public void increaseHardDriveVolume(int gb){
        this.hard.setVolume(getHard().getVolume() + gb);
    }
    public void decreaseHardDriveVolume(int gb){
        this.hard.setVolume(getHard().getVolume() - gb);
    }

    public void increaseRamVolume(int mb){
        this.ram.setVolume(getRam().getVolume() + mb);
    }

    public void decreaseRamVolume(int mb){
        this.ram.setVolume((getRam().getVolume() - mb));
    }

    public void increaseRamFrequency(int mhz){
        this.ram.setFrequency(getRam().getFrequency() + mhz);
    }

    public void decreaseRamFrequency(int mhz){
        this.ram.setFrequency(getRam().getFrequency() - mhz);
    }
}
