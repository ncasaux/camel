/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ganglia;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GangliaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GangliaEndpoint target = (GangliaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "dmax": target.getConfiguration().setDmax(property(camelContext, int.class, value)); return true;
        case "groupname":
        case "groupName": target.getConfiguration().setGroupName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "metricname":
        case "metricName": target.getConfiguration().setMetricName(property(camelContext, java.lang.String.class, value)); return true;
        case "mode": target.getConfiguration().setMode(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode.class, value)); return true;
        case "prefix": target.getConfiguration().setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "slope": target.getConfiguration().setSlope(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetricSlope.class, value)); return true;
        case "spoofhostname":
        case "spoofHostname": target.getConfiguration().setSpoofHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tmax": target.getConfiguration().setTmax(property(camelContext, int.class, value)); return true;
        case "ttl": target.getConfiguration().setTtl(property(camelContext, int.class, value)); return true;
        case "type": target.getConfiguration().setType(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetricType.class, value)); return true;
        case "units": target.getConfiguration().setUnits(property(camelContext, java.lang.String.class, value)); return true;
        case "wireformat31x":
        case "wireFormat31x": target.getConfiguration().setWireFormat31x(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "dmax": return int.class;
        case "groupname":
        case "groupName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "metricname":
        case "metricName": return java.lang.String.class;
        case "mode": return info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode.class;
        case "prefix": return java.lang.String.class;
        case "slope": return info.ganglia.gmetric4j.gmetric.GMetricSlope.class;
        case "spoofhostname":
        case "spoofHostname": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "tmax": return int.class;
        case "ttl": return int.class;
        case "type": return info.ganglia.gmetric4j.gmetric.GMetricType.class;
        case "units": return java.lang.String.class;
        case "wireformat31x":
        case "wireFormat31x": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GangliaEndpoint target = (GangliaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "dmax": return target.getConfiguration().getDmax();
        case "groupname":
        case "groupName": return target.getConfiguration().getGroupName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "metricname":
        case "metricName": return target.getConfiguration().getMetricName();
        case "mode": return target.getConfiguration().getMode();
        case "prefix": return target.getConfiguration().getPrefix();
        case "slope": return target.getConfiguration().getSlope();
        case "spoofhostname":
        case "spoofHostname": return target.getConfiguration().getSpoofHostname();
        case "synchronous": return target.isSynchronous();
        case "tmax": return target.getConfiguration().getTmax();
        case "ttl": return target.getConfiguration().getTtl();
        case "type": return target.getConfiguration().getType();
        case "units": return target.getConfiguration().getUnits();
        case "wireformat31x":
        case "wireFormat31x": return target.getConfiguration().isWireFormat31x();
        default: return null;
        }
    }
}

