//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:17 AM UTC 
//


package net.sourceforge.czt.zeves.jaxb.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NormalizationKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NormalizationKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Command"/>
 *     &lt;enumeration value="Conjunctive"/>
 *     &lt;enumeration value="Disjunctive"/>
 *     &lt;enumeration value="Rearrange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NormalizationKind")
@XmlEnum
public enum NormalizationKind {

    @XmlEnumValue("Command")
    COMMAND("Command"),
    @XmlEnumValue("Conjunctive")
    CONJUNCTIVE("Conjunctive"),
    @XmlEnumValue("Disjunctive")
    DISJUNCTIVE("Disjunctive"),
    @XmlEnumValue("Rearrange")
    REARRANGE("Rearrange");
    private final String value;

    NormalizationKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormalizationKind fromValue(String v) {
        for (NormalizationKind c: NormalizationKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}