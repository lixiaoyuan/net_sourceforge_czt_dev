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
 * <p>Java class for ActionSignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionSignature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}CircusSignature">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}SignatureList"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}CommunicationList"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ChannelSetList"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}NameSetList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionSignature", propOrder = {
    "signatureList",
    "communicationList",
    "channelSetList",
    "nameSetList"
})
public class ActionSignature
    extends CircusSignature
{

    @XmlElementRef(name = "SignatureList", namespace = "http://czt.sourceforge.net/circus", type = JAXBElement.class)
    protected JAXBElement<? extends SignatureList> signatureList;
    @XmlElementRef(name = "CommunicationList", namespace = "http://czt.sourceforge.net/circus", type = JAXBElement.class)
    protected JAXBElement<? extends CommunicationList> communicationList;
    @XmlElementRef(name = "ChannelSetList", namespace = "http://czt.sourceforge.net/circus", type = JAXBElement.class)
    protected JAXBElement<? extends ChannelSetList> channelSetList;
    @XmlElementRef(name = "NameSetList", namespace = "http://czt.sourceforge.net/circus", type = JAXBElement.class)
    protected JAXBElement<? extends NameSetList> nameSetList;

    /**
     * Gets the value of the signatureList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActionSignatureList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcessSignatureList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZSignatureList }{@code >}
     *     {@link JAXBElement }{@code <}{@link SignatureList }{@code >}
     *     
     */
    public JAXBElement<? extends SignatureList> getSignatureList() {
        return signatureList;
    }

    /**
     * Sets the value of the signatureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActionSignatureList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcessSignatureList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZSignatureList }{@code >}
     *     {@link JAXBElement }{@code <}{@link SignatureList }{@code >}
     *     
     */
    public void setSignatureList(JAXBElement<? extends SignatureList> value) {
        this.signatureList = value;
    }

    /**
     * Gets the value of the communicationList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CircusCommunicationList }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommunicationList }{@code >}
     *     
     */
    public JAXBElement<? extends CommunicationList> getCommunicationList() {
        return communicationList;
    }

    /**
     * Sets the value of the communicationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CircusCommunicationList }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommunicationList }{@code >}
     *     
     */
    public void setCommunicationList(JAXBElement<? extends CommunicationList> value) {
        this.communicationList = value;
    }

    /**
     * Gets the value of the channelSetList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChannelSetList }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircusChannelSetList }{@code >}
     *     
     */
    public JAXBElement<? extends ChannelSetList> getChannelSetList() {
        return channelSetList;
    }

    /**
     * Sets the value of the channelSetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChannelSetList }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircusChannelSetList }{@code >}
     *     
     */
    public void setChannelSetList(JAXBElement<? extends ChannelSetList> value) {
        this.channelSetList = value;
    }

    /**
     * Gets the value of the nameSetList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CircusNameSetList }{@code >}
     *     {@link JAXBElement }{@code <}{@link NameSetList }{@code >}
     *     
     */
    public JAXBElement<? extends NameSetList> getNameSetList() {
        return nameSetList;
    }

    /**
     * Sets the value of the nameSetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CircusNameSetList }{@code >}
     *     {@link JAXBElement }{@code <}{@link NameSetList }{@code >}
     *     
     */
    public void setNameSetList(JAXBElement<? extends NameSetList> value) {
        this.nameSetList = value;
    }

}