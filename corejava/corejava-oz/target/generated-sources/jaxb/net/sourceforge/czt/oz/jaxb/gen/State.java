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
import net.sourceforge.czt.z.jaxb.gen.AndPred;
import net.sourceforge.czt.z.jaxb.gen.Box;
import net.sourceforge.czt.z.jaxb.gen.Exists1Pred;
import net.sourceforge.czt.z.jaxb.gen.ExistsPred;
import net.sourceforge.czt.z.jaxb.gen.ExprPred;
import net.sourceforge.czt.z.jaxb.gen.Fact;
import net.sourceforge.czt.z.jaxb.gen.FalsePred;
import net.sourceforge.czt.z.jaxb.gen.ForallPred;
import net.sourceforge.czt.z.jaxb.gen.IffPred;
import net.sourceforge.czt.z.jaxb.gen.ImpliesPred;
import net.sourceforge.czt.z.jaxb.gen.MemPred;
import net.sourceforge.czt.z.jaxb.gen.NegPred;
import net.sourceforge.czt.z.jaxb.gen.OrPred;
import net.sourceforge.czt.z.jaxb.gen.Para;
import net.sourceforge.czt.z.jaxb.gen.Pred;
import net.sourceforge.czt.z.jaxb.gen.Pred2;
import net.sourceforge.czt.z.jaxb.gen.QntPred;
import net.sourceforge.czt.z.jaxb.gen.TruePred;
import net.sourceforge.czt.zpatt.jaxb.gen.JokerPred;


/**
 * <p>Java class for State complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="State">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Para">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}PrimaryDecl" minOccurs="0"/>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}SecondaryDecl" minOccurs="0"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Pred" minOccurs="0"/>
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
@XmlType(name = "State", propOrder = {
    "primaryDecl",
    "secondaryDecl",
    "pred"
})
public class State
    extends Para
{

    @XmlElementRef(name = "PrimaryDecl", namespace = "http://czt.sourceforge.net/object-z", type = JAXBElement.class)
    protected JAXBElement<PrimaryDecl> primaryDecl;
    @XmlElementRef(name = "SecondaryDecl", namespace = "http://czt.sourceforge.net/object-z", type = JAXBElement.class)
    protected JAXBElement<SecondaryDecl> secondaryDecl;
    @XmlElementRef(name = "Pred", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends Pred> pred;
    @XmlAttribute(name = "Box")
    protected Box box;

    /**
     * Gets the value of the primaryDecl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrimaryDecl }{@code >}
     *     
     */
    public JAXBElement<PrimaryDecl> getPrimaryDecl() {
        return primaryDecl;
    }

    /**
     * Sets the value of the primaryDecl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrimaryDecl }{@code >}
     *     
     */
    public void setPrimaryDecl(JAXBElement<PrimaryDecl> value) {
        this.primaryDecl = value;
    }

    /**
     * Gets the value of the secondaryDecl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecondaryDecl }{@code >}
     *     
     */
    public JAXBElement<SecondaryDecl> getSecondaryDecl() {
        return secondaryDecl;
    }

    /**
     * Sets the value of the secondaryDecl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecondaryDecl }{@code >}
     *     
     */
    public void setSecondaryDecl(JAXBElement<SecondaryDecl> value) {
        this.secondaryDecl = value;
    }

    /**
     * Gets the value of the pred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TruePred }{@code >}
     *     {@link JAXBElement }{@code <}{@link MemPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImpliesPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link JokerPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Fact }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForallPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExprPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExistsPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link QntPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pred2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link FalsePred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exists1Pred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pred }{@code >}
     *     {@link JAXBElement }{@code <}{@link IffPred }{@code >}
     *     
     */
    public JAXBElement<? extends Pred> getPred() {
        return pred;
    }

    /**
     * Sets the value of the pred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TruePred }{@code >}
     *     {@link JAXBElement }{@code <}{@link MemPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImpliesPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link JokerPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Fact }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForallPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExprPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExistsPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link QntPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pred2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link FalsePred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exists1Pred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pred }{@code >}
     *     {@link JAXBElement }{@code <}{@link IffPred }{@code >}
     *     
     */
    public void setPred(JAXBElement<? extends Pred> value) {
        this.pred = value;
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
