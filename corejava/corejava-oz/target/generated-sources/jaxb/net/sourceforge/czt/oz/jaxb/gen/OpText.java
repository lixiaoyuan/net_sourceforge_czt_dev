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
import net.sourceforge.czt.z.jaxb.gen.SchText;
import net.sourceforge.czt.z.jaxb.gen.Term;
import net.sourceforge.czt.z.jaxb.gen.ZSchText;


/**
 * <p>Java class for OpText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpText">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Term">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}DeltaList" minOccurs="0"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}SchText"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpText", propOrder = {
    "deltaList",
    "schText"
})
public class OpText
    extends Term
{

    @XmlElementRef(name = "DeltaList", namespace = "http://czt.sourceforge.net/object-z", type = JAXBElement.class)
    protected JAXBElement<DeltaList> deltaList;
    @XmlElementRef(name = "SchText", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends SchText> schText;

    /**
     * Gets the value of the deltaList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeltaList }{@code >}
     *     
     */
    public JAXBElement<DeltaList> getDeltaList() {
        return deltaList;
    }

    /**
     * Sets the value of the deltaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeltaList }{@code >}
     *     
     */
    public void setDeltaList(JAXBElement<DeltaList> value) {
        this.deltaList = value;
    }

    /**
     * Gets the value of the schText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SchText }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZSchText }{@code >}
     *     
     */
    public JAXBElement<? extends SchText> getSchText() {
        return schText;
    }

    /**
     * Sets the value of the schText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SchText }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZSchText }{@code >}
     *     
     */
    public void setSchText(JAXBElement<? extends SchText> value) {
        this.schText = value;
    }

}
