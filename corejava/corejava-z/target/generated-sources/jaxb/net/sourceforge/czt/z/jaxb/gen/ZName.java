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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Name">
 *       &lt;sequence>
 *         &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}StrokeList"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZName", propOrder = {
    "word",
    "strokeList"
})
public class ZName
    extends Name
{

    @XmlElement(name = "Word", required = true)
    protected String word;
    @XmlElementRef(name = "StrokeList", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends StrokeList> strokeList;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the word property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWord() {
        return word;
    }

    /**
     * Sets the value of the word property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWord(String value) {
        this.word = value;
    }

    /**
     * Gets the value of the strokeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ZStrokeList }{@code >}
     *     {@link JAXBElement }{@code <}{@link StrokeList }{@code >}
     *     
     */
    public JAXBElement<? extends StrokeList> getStrokeList() {
        return strokeList;
    }

    /**
     * Sets the value of the strokeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ZStrokeList }{@code >}
     *     {@link JAXBElement }{@code <}{@link StrokeList }{@code >}
     *     
     */
    public void setStrokeList(JAXBElement<? extends StrokeList> value) {
        this.strokeList = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
