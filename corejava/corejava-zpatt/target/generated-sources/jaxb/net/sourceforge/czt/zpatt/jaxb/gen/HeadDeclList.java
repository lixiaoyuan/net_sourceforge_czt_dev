//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:12 AM UTC 
//


package net.sourceforge.czt.zpatt.jaxb.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.sourceforge.czt.z.jaxb.gen.DeclList;
import net.sourceforge.czt.z.jaxb.gen.ZDeclList;


/**
 * <p>Java class for HeadDeclList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeadDeclList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}DeclList">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}ZDeclList"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zpatt}JokerDeclList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeadDeclList", propOrder = {
    "zDeclList",
    "jokerDeclList"
})
public class HeadDeclList
    extends DeclList
{

    @XmlElementRef(name = "ZDeclList", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<ZDeclList> zDeclList;
    @XmlElementRef(name = "JokerDeclList", namespace = "http://czt.sourceforge.net/zpatt", type = JAXBElement.class)
    protected JAXBElement<JokerDeclList> jokerDeclList;

    /**
     * Gets the value of the zDeclList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ZDeclList }{@code >}
     *     
     */
    public JAXBElement<ZDeclList> getZDeclList() {
        return zDeclList;
    }

    /**
     * Sets the value of the zDeclList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ZDeclList }{@code >}
     *     
     */
    public void setZDeclList(JAXBElement<ZDeclList> value) {
        this.zDeclList = value;
    }

    /**
     * Gets the value of the jokerDeclList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JokerDeclList }{@code >}
     *     
     */
    public JAXBElement<JokerDeclList> getJokerDeclList() {
        return jokerDeclList;
    }

    /**
     * Sets the value of the jokerDeclList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JokerDeclList }{@code >}
     *     
     */
    public void setJokerDeclList(JAXBElement<JokerDeclList> value) {
        this.jokerDeclList = value;
    }

}