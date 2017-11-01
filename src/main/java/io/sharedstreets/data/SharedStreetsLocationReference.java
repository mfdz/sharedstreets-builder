package io.sharedstreets.data;

import com.esri.core.geometry.Point;
import io.sharedstreets.tools.builder.util.UniqueId;

public class SharedStreetsLocationReference {

    public int sequence; // sequential id for LPRs
    public Point point = new Point();
    public Double inboundBearing;
    public Double outboundBearing;
    public Double distanceToNextRef;

    public SharedStreetsIntersection intersection;

}
