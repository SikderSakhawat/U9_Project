import java.util.ArrayList;

public class VolumeGroup extends LVM{
    private ArrayList<PhysicalVolumes> PVs;
    private ArrayList<LogicalVolumes> LVs;

    public VolumeGroup(String n, String UUID) {
        super(n, UUID);
    }


}
