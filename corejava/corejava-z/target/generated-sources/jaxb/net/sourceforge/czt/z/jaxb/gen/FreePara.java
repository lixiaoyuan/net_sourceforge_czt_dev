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
 * <p>Java class for FreePara complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreePara">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Para">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}FreetypeList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreePara", propOrder = {
    "freetypeList"
})
public class FreePara
    extends Para
{

    @XmlElementRef(name = "FreetypeList", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends FreetypeList> freetypeList;

    /**
     * Gets the value of the freetypeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FreetypeList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZFreetypeList }{@code >}
     *     
     */
    public JAXBElement<? extends FreetypeList> getFreetypeList() {
        return freetypeList;
    }

    /**
     * Sets the value of the freetypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FreetypeList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZFreetypeList }{@code >}
     *     
     */
    public void setFreetypeList(JAXBElement<? extends FreetypeList> value) {
        this.freetypeList = value;
    }

}
