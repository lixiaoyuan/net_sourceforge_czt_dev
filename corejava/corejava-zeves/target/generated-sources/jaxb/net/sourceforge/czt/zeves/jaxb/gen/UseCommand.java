//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:17 AM UTC 
//


package net.sourceforge.czt.zeves.jaxb.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.sourceforge.czt.z.jaxb.gen.RefExpr;


/**
 * <p>Java class for UseCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UseCommand">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zeves}InstantiationCommand">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}RefExpr"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseCommand", propOrder = {
    "theoremRef"
})
public class UseCommand
    extends InstantiationCommand
{

    @XmlElementRef(name = "RefExpr", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<RefExpr> theoremRef;

    /**
     * Gets the value of the theoremRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RefExpr }{@code >}
     *     
     */
    public JAXBElement<RefExpr> getTheoremRef() {
        return theoremRef;
    }

    /**
     * Sets the value of the theoremRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RefExpr }{@code >}
     *     
     */
    public void setTheoremRef(JAXBElement<RefExpr> value) {
        this.theoremRef = value;
    }

}