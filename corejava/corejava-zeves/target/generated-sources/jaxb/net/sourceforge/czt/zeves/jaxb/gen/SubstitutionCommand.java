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
 * <p>Java class for SubstitutionCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstitutionCommand">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zeves}ComplexCommand">
 *       &lt;attribute name="SubstitutionKind" type="{http://czt.sourceforge.net/zeves}SubstitutionKind" default="Equality" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstitutionCommand")
public class SubstitutionCommand
    extends ComplexCommand
{

    @XmlAttribute(name = "SubstitutionKind")
    protected SubstitutionKind substitutionKind;

    /**
     * Gets the value of the substitutionKind property.
     * 
     * @return
     *     possible object is
     *     {@link SubstitutionKind }
     *     
     */
    public SubstitutionKind getSubstitutionKind() {
        if (substitutionKind == null) {
            return SubstitutionKind.EQUALITY;
        } else {
            return substitutionKind;
        }
    }

    /**
     * Sets the value of the substitutionKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstitutionKind }
     *     
     */
    public void setSubstitutionKind(SubstitutionKind value) {
        this.substitutionKind = value;
    }

}