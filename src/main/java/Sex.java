import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Sex implements AddressProvider{
    MALE("man", "Mars"),
    FEMALE("woman", "Venus");

    private final String readableSex;
    private final String address;

    @Override
    public String getAddress() {
        return address;
    }
}
