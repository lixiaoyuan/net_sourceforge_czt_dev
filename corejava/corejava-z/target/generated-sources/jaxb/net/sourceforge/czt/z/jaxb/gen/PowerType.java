//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:37:58 AM UTC 
//


package net.sourceforge.czt.z.jaxb.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Type2">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Type2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerType", propOrder = {
    "type"
})
public class PowerType
    extends Type2
{

    @XmlElementRef(name = "Type2", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends Type2> type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GenParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Type2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProdType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GivenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaType }{@code >}
     *     
     */
    public JAXBElement<? extends Type2> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GenParamType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Type2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProdType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GivenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaType }{@code >}
     *     
     */
    public void setType(JAXBElement<? extends Type2> value) {
        this.type = value;
    }

}
