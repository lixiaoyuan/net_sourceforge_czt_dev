//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:59 AM UTC 
//


package net.sourceforge.czt.circus.jaxb.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}CircusType">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ProcessSignature"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessType", propOrder = {
    "processSignature"
})
public class ProcessType
    extends CircusType
{

    @XmlElementRef(name = "ProcessSignature", namespace = "http://czt.sourceforge.net/circus", type = JAXBElement.class)
    protected JAXBElement<ProcessSignature> processSignature;

    /**
     * Gets the value of the processSignature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessSignature }{@code >}
     *     
     */
    public JAXBElement<ProcessSignature> getProcessSignature() {
        return processSignature;
    }

    /**
     * Sets the value of the processSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessSignature }{@code >}
     *     
     */
    public void setProcessSignature(JAXBElement<ProcessSignature> value) {
        this.processSignature = value;
    }

}