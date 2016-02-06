package nodomain.freeyourgadget.gadgetbridge.service.devices.pebble;

import java.util.UUID;

class DatalogSession {
    final byte id;
    final int tag;
    final UUID uuid;
    final byte item_type;
    final short item_size;

    DatalogSession(byte id, UUID uuid, int tag, byte item_type, short item_size) {
        this.id = id;
        this.tag = tag;
        this.uuid = uuid;
        this.item_type = item_type;
        this.item_size = item_size;
    }
}