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
 * <p>Java class for RewriteKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RewriteKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Simplify"/>
 *     &lt;enumeration value="Rewrite"/>
 *     &lt;enumeration value="Reduce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RewriteKind")
@XmlEnum
public enum RewriteKind {

    @XmlEnumValue("Simplify")
    SIMPLIFY("Simplify"),
    @XmlEnumValue("Rewrite")
    REWRITE("Rewrite"),
    @XmlEnumValue("Reduce")
    REDUCE("Reduce");
    private final String value;

    RewriteKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RewriteKind fromValue(String v) {
        for (RewriteKind c: RewriteKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}