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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.sourceforge.czt.z.jaxb.gen.Box;
import net.sourceforge.czt.z.jaxb.gen.Name;
import net.sourceforge.czt.z.jaxb.gen.Term;
import net.sourceforge.czt.z.jaxb.gen.ZName;
import net.sourceforge.czt.zpatt.jaxb.gen.JokerName;


/**
 * <p>Java class for Operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Term">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Name"/>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}OpExpr"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Box" type="{http://czt.sourceforge.net/zml}Box" default="SchBox" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operation", propOrder = {
    "name",
    "opExpr"
})
public class Operation
    extends Term
{

    @XmlElementRef(name = "Name", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends Name> name;
    @XmlElementRef(name = "OpExpr", namespace = "http://czt.sourceforge.net/object-z", type = JAXBElement.class)
    protected JAXBElement<? extends OpExpr> opExpr;
    @XmlAttribute(name = "Box")
    protected Box box;

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
     * Gets the value of the opExpr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistConjOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpPromotionExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExChoiceOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpExpr2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link RenameOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssoParallelOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link HideOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeqOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParallelOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConjOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnonOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScopeEnrichOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistSeqOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistChoiceOpExpr }{@code >}
     *     
     */
    public JAXBElement<? extends OpExpr> getOpExpr() {
        return opExpr;
    }

    /**
     * Sets the value of the opExpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistConjOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpPromotionExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExChoiceOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpExpr2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link RenameOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssoParallelOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link HideOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeqOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParallelOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConjOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnonOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScopeEnrichOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistSeqOpExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistChoiceOpExpr }{@code >}
     *     
     */
    public void setOpExpr(JAXBElement<? extends OpExpr> value) {
        this.opExpr = value;
    }

    /**
     * Gets the value of the box property.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getBox() {
        if (box == null) {
            return Box.SCH_BOX;
        } else {
            return box;
        }
    }

    /**
     * Sets the value of the box property.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setBox(Box value) {
        this.box = value;
    }

}