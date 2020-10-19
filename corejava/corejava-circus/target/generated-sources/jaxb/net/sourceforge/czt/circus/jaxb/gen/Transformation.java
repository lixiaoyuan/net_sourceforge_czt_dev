//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:59 AM UTC 
//


package net.sourceforge.czt.circus.jaxb.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transformation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Transformation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Refinement"/>
 *     &lt;enumeration value="Equivalence"/>
 *     &lt;enumeration value="Simulation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Transformation")
@XmlEnum
public enum Transformation {

    @XmlEnumValue("Refinement")
    REFINEMENT("Refinement"),
    @XmlEnumValue("Equivalence")
    EQUIVALENCE("Equivalence"),
    @XmlEnumValue("Simulation")
    SIMULATION("Simulation");
    private final String value;

    Transformation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Transformation fromValue(String v) {
        for (Transformation c: Transformation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
