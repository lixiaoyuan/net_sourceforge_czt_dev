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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParallelActionIte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParallelActionIte">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}ParActionIte">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ChannelSet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParallelActionIte", propOrder = {
    "channelSet"
})
@XmlSeeAlso({
    AlphabetisedParallelActionIte.class
})
public class ParallelActionIte
    extends ParActionIte
{

    @XmlElementRef(name = "ChannelSet", namespace = "http://czt.sourceforge.net/circus", type = JAXBElement.class)
    protected JAXBElement<? extends ChannelSet> channelSet;

    /**
     * Gets the value of the channelSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CircusChannelSet }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChannelSet }{@code >}
     *     
     */
    public JAXBElement<? extends ChannelSet> getChannelSet() {
        return channelSet;
    }

    /**
     * Sets the value of the channelSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CircusChannelSet }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChannelSet }{@code >}
     *     
     */
    public void setChannelSet(JAXBElement<? extends ChannelSet> value) {
        this.channelSet = value;
    }

}