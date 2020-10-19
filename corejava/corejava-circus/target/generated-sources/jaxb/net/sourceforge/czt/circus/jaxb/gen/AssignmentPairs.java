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
import net.sourceforge.czt.z.jaxb.gen.ExprList;
import net.sourceforge.czt.z.jaxb.gen.NameList;
import net.sourceforge.czt.z.jaxb.gen.Term;
import net.sourceforge.czt.z.jaxb.gen.ZExprList;
import net.sourceforge.czt.z.jaxb.gen.ZNameList;
import net.sourceforge.czt.zpatt.jaxb.gen.JokerExprList;
import net.sourceforge.czt.zpatt.jaxb.gen.JokerNameList;


/**
 * <p>Java class for AssignmentPairs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignmentPairs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Term">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}NameList"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}ExprList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentPairs", propOrder = {
    "lhs",
    "rhs"
})
public class AssignmentPairs
    extends Term
{

    @XmlElementRef(name = "NameList", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends NameList> lhs;
    @XmlElementRef(name = "ExprList", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends ExprList> rhs;

    /**
     * Gets the value of the lhs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ZNameList }{@code >}
     *     {@link JAXBElement }{@code <}{@link NameList }{@code >}
     *     {@link JAXBElement }{@code <}{@link JokerNameList }{@code >}
     *     
     */
    public JAXBElement<? extends NameList> getLHS() {
        return lhs;
    }

    /**
     * Sets the value of the lhs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ZNameList }{@code >}
     *     {@link JAXBElement }{@code <}{@link NameList }{@code >}
     *     {@link JAXBElement }{@code <}{@link JokerNameList }{@code >}
     *     
     */
    public void setLHS(JAXBElement<? extends NameList> value) {
        this.lhs = value;
    }

    /**
     * Gets the value of the rhs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JokerExprList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExprList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZExprList }{@code >}
     *     
     */
    public JAXBElement<? extends ExprList> getRHS() {
        return rhs;
    }

    /**
     * Sets the value of the rhs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JokerExprList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExprList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZExprList }{@code >}
     *     
     */
    public void setRHS(JAXBElement<? extends ExprList> value) {
        this.rhs = value;
    }

}
