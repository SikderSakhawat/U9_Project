public class PhysicalHardDrive extends LVM{
    private String name;
    private int size;
    private String UUID;

    public PhysicalHardDrive(String n, String UUID, int GB) {
        super(n, UUID);
        size = GB;
    }

    public int getSize() {
        return size;
    }
}
