package org.lprog.domain.drone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Status {

    public static Status Flying = new Status("FLYN");
    public static Status Idle = new Status("IDLE");
    public static Status Charging = new Status("CHRG");
    public static Status Maintenance = new Status("MNTC");
    public static Status Unavailable = new Status("UNAV");

    public final String value;

    private Status (String value) {
        this.value = value;
    }

}
