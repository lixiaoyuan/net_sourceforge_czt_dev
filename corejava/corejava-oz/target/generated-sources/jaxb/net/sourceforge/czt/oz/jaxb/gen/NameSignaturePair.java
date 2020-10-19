//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:27 AM UTC 
//


package net.sourceforge.czt.oz.jaxb.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.sourceforge.czt.z.jaxb.gen.Name;
import net.sourceforge.czt.z.jaxb.gen.Signature;
import net.sourceforge.czt.z.jaxb.gen.Term;
import net.sourceforge.czt.z.jaxb.gen.ZName;
import net.sourceforge.czt.zpatt.jaxb.gen.JokerName;


/**
 * <p>Java class for NameSignaturePair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameSignaturePair">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Term">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Name" minOccurs="0"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Signature"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameSignaturePair", propOrder = {
    "name",
    "signature"
})
public class NameSignaturePair
    extends Term
{

    @XmlElementRef(name = "Name", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends Name> name;
    @XmlElementRef(name = "Signature", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<Signature> signature;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JokerName }{@code >}
     *     {@link JAXBElement }{@code <}{@link Name }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZName }{@code >}
     *     
     */
    public JAXBElement<? extends Name> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JokerName }{@code >}
     *     {@link JAXBElement }{@code <}{@link Name }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZName }{@code >}
     *     
     */
    public void setName(JAXBElement<? extends Name> value) {
        this.name = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Signature }{@code >}
     *     
     */
    public JAXBElement<Signature> getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Signature }{@code >}
     *     
     */
    public void setSignature(JAXBElement<Signature> value) {
        this.signature = value;
    }

}