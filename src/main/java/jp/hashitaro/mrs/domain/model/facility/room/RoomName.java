package jp.hashitaro.mrs.domain.model.facility.room;

/**
 * 会議室名
 */
public class RoomName {
    String value;

    public RoomName(String value) {
        this.value = value;
    }

    public RoomName() {
    }

    public String value() {
        return value;
    }
}