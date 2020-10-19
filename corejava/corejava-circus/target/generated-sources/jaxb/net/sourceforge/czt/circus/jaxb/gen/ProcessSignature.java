//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:59 AM UTC 
//


package net.sourceforge.czt.circus.jaxb.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.sourceforge.czt.z.jaxb.gen.ZNameList;


/**
 * <p>Java class for ProcessSignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessSignature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}CircusSignature">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}ZNameList"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}SignatureList" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ChannelSetList"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}StateUpdate"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CallUsage" type="{http://czt.sourceforge.net/circus}CallUsage" default="Parameterised" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessSignature", propOrder = {
    "genFormals",
    "signatureList",
    "processChannelSets",
    "stateUpdate"
})
public class ProcessSignature
    extends CircusSignature
{

    @XmlElementRef(name = "ZNameList", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<ZNameList> genFormals;
    @XmlElementRef(name = "SignatureList", namespace = "http://czt.sourceforge.net/circus", type = JAXBElement.class)
    protected List<JAXBElement<? extends SignatureList>> signatureList;
    @XmlElementRef(name = "ChannelSetList", namespace = "http://czt.sourceforge.net/circus", type = JAXBElement.class)
    protected JAXBElement<? extends ChannelSetList> processChannelSets;
    @XmlElementRef(name = "StateUpdate", namespace = "http://czt.sourceforge.net/circus", type = JAXBElement.class)
    protected JAXBElement<StateUpdate> stateUpdate;
    @XmlAttribute(name = "CallUsage")
    protected CallUsage callUsage;

    /**
     * Gets the value of the genFormals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ZNameList }{@code >}
     *     
     */
    public JAXBElement<ZNameList> getGenFormals() {
        return genFormals;
    }

    /**
     * Sets the value of the genFormals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ZNameList }{@code >}
     *     
     */
    public void setGenFormals(JAXBElement<ZNameList> value) {
        this.genFormals = value;
    }

    /**
     * Gets the value of the signatureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ActionSignatureList }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessSignatureList }{@code >}
     * {@link JAXBElement }{@code <}{@link ZSignatureList }{@code >}
     * {@link JAXBElement }{@code <}{@link SignatureList }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends SignatureList>> getSignatureList() {
        if (signatureList == null) {
            signatureList = new ArrayList<JAXBElement<? extends SignatureList>>();
        }
        return this.signatureList;
    }

    /**
     * Gets the value of the processChannelSets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChannelSetList }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircusChannelSetList }{@code >}
     *     
     */
    public JAXBElement<? extends ChannelSetList> getProcessChannelSets() {
        return processChannelSets;
    }

    /**
     * Sets the value of the processChannelSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChannelSetList }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircusChannelSetList }{@code >}
     *     
     */
    public void setProcessChannelSets(JAXBElement<? extends ChannelSetList> value) {
        this.processChannelSets = value;
    }

    /**
     * Gets the value of the stateUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateUpdate }{@code >}
     *     
     */
    public JAXBElement<StateUpdate> getStateUpdate() {
        return stateUpdate;
    }

    /**
     * Sets the value of the stateUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateUpdate }{@code >}
     *     
     */
    public void setStateUpdate(JAXBElement<StateUpdate> value) {
        this.stateUpdate = value;
    }

    /**
     * Gets the value of the callUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CallUsage }
     *     
     */
    public CallUsage getCallUsage() {
        if (callUsage == null) {
            return CallUsage.PARAMETERISED;
        } else {
            return callUsage;
        }
    }

    /**
     * Sets the value of the callUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallUsage }
     *     
     */
    public void setCallUsage(CallUsage value) {
        this.callUsage = value;
    }

}
