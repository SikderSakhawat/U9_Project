import java.util.UUID;

public class UUIDGenerator {
    public static String randUUID(){
        UUID u = UUID.randomUUID();
        return u.toString();
    }
}
