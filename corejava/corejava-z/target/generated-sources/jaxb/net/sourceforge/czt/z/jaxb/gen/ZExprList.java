//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:37:58 AM UTC 
//


package net.sourceforge.czt.z.jaxb.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZExprList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZExprList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}ExprList">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Expr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZExprList", propOrder = {
    "expr"
})
public class ZExprList
    extends ExprList
{

    @XmlElementRef(name = "Expr", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected List<JAXBElement<? extends Expr>> expr;

    /**
     * Gets the value of the expr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link NumExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link DecorExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link ExistsExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link ForallExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link BindExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link SchExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link RefExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link SchExpr2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TupleSelExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link SetExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link Expr2N }{@code >}
     * {@link JAXBElement }{@code <}{@link Qnt1Expr }{@code >}
     * {@link JAXBElement }{@code <}{@link Expr2 }{@code >}
     * {@link JAXBElement }{@code <}{@link ProjExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link SetCompExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link RenameExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link NegExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link Expr1 }{@code >}
     * {@link JAXBElement }{@code <}{@link PreExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link ProdExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link ThetaExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link BindSelExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link ImpliesExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link TupleExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link Exists1Expr }{@code >}
     * {@link JAXBElement }{@code <}{@link CondExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link MuExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link PipeExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link QntExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link AndExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link CompExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link OrExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link LambdaExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link Expr }{@code >}
     * {@link JAXBElement }{@code <}{@link Expr0N }{@code >}
     * {@link JAXBElement }{@code <}{@link ApplExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link IffExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link LetExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link HideExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerExpr }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Expr>> getExpr() {
        if (expr == null) {
            expr = new ArrayList<JAXBElement<? extends Expr>>();
        }
        return this.expr;
    }

}