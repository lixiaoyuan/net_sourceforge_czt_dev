//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:17 AM UTC 
//


package net.sourceforge.czt.zeves.jaxb.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NormalizationCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NormalizationCommand">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zeves}WrappedCommand">
 *       &lt;attribute name="NormalizationKind" type="{http://czt.sourceforge.net/zeves}NormalizationKind" default="Command" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NormalizationCommand")
public class NormalizationCommand
    extends WrappedCommand
{

    @XmlAttribute(name = "NormalizationKind")
    protected NormalizationKind normalizationKind;

    /**
     * Gets the value of the normalizationKind property.
     * 
     * @return
     *     possible object is
     *     {@link NormalizationKind }
     *     
     */
    public NormalizationKind getNormalizationKind() {
        if (normalizationKind == null) {
            return NormalizationKind.COMMAND;
        } else {
            return normalizationKind;
        }
    }

    /**
     * Sets the value of the normalizationKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link NormalizationKind }
     *     
     */
    public void setNormalizationKind(NormalizationKind value) {
        this.normalizationKind = value;
    }

}
