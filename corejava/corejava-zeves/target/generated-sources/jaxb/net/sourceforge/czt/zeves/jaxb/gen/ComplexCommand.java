//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:17 AM UTC 
//


package net.sourceforge.czt.zeves.jaxb.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.sourceforge.czt.z.jaxb.gen.AndExpr;
import net.sourceforge.czt.z.jaxb.gen.AndPred;
import net.sourceforge.czt.z.jaxb.gen.ApplExpr;
import net.sourceforge.czt.z.jaxb.gen.BindExpr;
import net.sourceforge.czt.z.jaxb.gen.BindSelExpr;
import net.sourceforge.czt.z.jaxb.gen.CompExpr;
import net.sourceforge.czt.z.jaxb.gen.CondExpr;
import net.sourceforge.czt.z.jaxb.gen.DecorExpr;
import net.sourceforge.czt.z.jaxb.gen.Exists1Expr;
import net.sourceforge.czt.z.jaxb.gen.Exists1Pred;
import net.sourceforge.czt.z.jaxb.gen.ExistsExpr;
import net.sourceforge.czt.z.jaxb.gen.ExistsPred;
import net.sourceforge.czt.z.jaxb.gen.Expr;
import net.sourceforge.czt.z.jaxb.gen.Expr0N;
import net.sourceforge.czt.z.jaxb.gen.Expr1;
import net.sourceforge.czt.z.jaxb.gen.Expr2;
import net.sourceforge.czt.z.jaxb.gen.Expr2N;
import net.sourceforge.czt.z.jaxb.gen.ExprPred;
import net.sourceforge.czt.z.jaxb.gen.Fact;
import net.sourceforge.czt.z.jaxb.gen.FalsePred;
import net.sourceforge.czt.z.jaxb.gen.ForallExpr;
import net.sourceforge.czt.z.jaxb.gen.ForallPred;
import net.sourceforge.czt.z.jaxb.gen.HideExpr;
import net.sourceforge.czt.z.jaxb.gen.IffExpr;
import net.sourceforge.czt.z.jaxb.gen.IffPred;
import net.sourceforge.czt.z.jaxb.gen.ImpliesExpr;
import net.sourceforge.czt.z.jaxb.gen.ImpliesPred;
import net.sourceforge.czt.z.jaxb.gen.LambdaExpr;
import net.sourceforge.czt.z.jaxb.gen.LetExpr;
import net.sourceforge.czt.z.jaxb.gen.MemPred;
import net.sourceforge.czt.z.jaxb.gen.MuExpr;
import net.sourceforge.czt.z.jaxb.gen.NameList;
import net.sourceforge.czt.z.jaxb.gen.NegExpr;
import net.sourceforge.czt.z.jaxb.gen.NegPred;
import net.sourceforge.czt.z.jaxb.gen.NumExpr;
import net.sourceforge.czt.z.jaxb.gen.OrExpr;
import net.sourceforge.czt.z.jaxb.gen.OrPred;
import net.sourceforge.czt.z.jaxb.gen.PipeExpr;
import net.sourceforge.czt.z.jaxb.gen.PowerExpr;
import net.sourceforge.czt.z.jaxb.gen.PreExpr;
import net.sourceforge.czt.z.jaxb.gen.Pred;
import net.sourceforge.czt.z.jaxb.gen.Pred2;
import net.sourceforge.czt.z.jaxb.gen.ProdExpr;
import net.sourceforge.czt.z.jaxb.gen.ProjExpr;
import net.sourceforge.czt.z.jaxb.gen.Qnt1Expr;
import net.sourceforge.czt.z.jaxb.gen.QntExpr;
import net.sourceforge.czt.z.jaxb.gen.QntPred;
import net.sourceforge.czt.z.jaxb.gen.RefExpr;
import net.sourceforge.czt.z.jaxb.gen.RenameExpr;
import net.sourceforge.czt.z.jaxb.gen.SchExpr;
import net.sourceforge.czt.z.jaxb.gen.SchExpr2;
import net.sourceforge.czt.z.jaxb.gen.SetCompExpr;
import net.sourceforge.czt.z.jaxb.gen.SetExpr;
import net.sourceforge.czt.z.jaxb.gen.ThetaExpr;
import net.sourceforge.czt.z.jaxb.gen.TruePred;
import net.sourceforge.czt.z.jaxb.gen.TupleExpr;
import net.sourceforge.czt.z.jaxb.gen.TupleSelExpr;
import net.sourceforge.czt.z.jaxb.gen.ZNameList;


/**
 * <p>Java class for ComplexCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexCommand">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zeves}WrappedCommand">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}NameList"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Expr" minOccurs="0"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Pred" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexCommand", propOrder = {
    "nameList",
    "expr",
    "pred"
})
@XmlSeeAlso({
    ApplyCommand.class,
    WithCommand.class,
    SubstitutionCommand.class
})
public class ComplexCommand
    extends WrappedCommand
{

    @XmlElementRef(name = "NameList", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends NameList> nameList;
    @XmlElementRef(name = "Expr", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends Expr> expr;
    @XmlElementRef(name = "Pred", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends Pred> pred;

    /**
     * Gets the value of the nameList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ZNameList }{@code >}
     *     {@link JAXBElement }{@code <}{@link NameList }{@code >}
     *     
     */
    public JAXBElement<? extends NameList> getNameList() {
        return nameList;
    }

    /**
     * Sets the value of the nameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ZNameList }{@code >}
     *     {@link JAXBElement }{@code <}{@link NameList }{@code >}
     *     
     */
    public void setNameList(JAXBElement<? extends NameList> value) {
        this.nameList = value;
    }

    /**
     * Gets the value of the expr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Qnt1Expr }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expr }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expr0N }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProdExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApplExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expr2N }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exists1Expr }{@code >}
     *     {@link JAXBElement }{@code <}{@link BindExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link SetExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link MuExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link BindSelExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link HideExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link PipeExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link SetCompExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImpliesExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExistsExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link CondExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link QntExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link RenameExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThetaExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link IffExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expr2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForallExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link TupleSelExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link TupleExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link DecorExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link LambdaExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expr1 }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchExpr2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link LetExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefExpr }{@code >}
     *     
     */
    public JAXBElement<? extends Expr> getExpr() {
        return expr;
    }

    /**
     * Sets the value of the expr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Qnt1Expr }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expr }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expr0N }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProdExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApplExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expr2N }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exists1Expr }{@code >}
     *     {@link JAXBElement }{@code <}{@link BindExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link SetExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link MuExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link BindSelExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link HideExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link PipeExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link SetCompExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImpliesExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExistsExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link CondExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link QntExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link RenameExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThetaExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link IffExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expr2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForallExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link TupleSelExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link TupleExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link DecorExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link LambdaExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expr1 }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchExpr2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link LetExpr }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefExpr }{@code >}
     *     
     */
    public void setExpr(JAXBElement<? extends Expr> value) {
        this.expr = value;
    }

    /**
     * Gets the value of the pred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImpliesPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForallPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link MemPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link IffPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pred2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link QntPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Fact }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExistsPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exists1Pred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExprPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link TruePred }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pred }{@code >}
     *     {@link JAXBElement }{@code <}{@link FalsePred }{@code >}
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
     *     {@link JAXBElement }{@code <}{@link ImpliesPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForallPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link MemPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link IffPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pred2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link QntPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Fact }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExistsPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exists1Pred }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExprPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link TruePred }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndPred }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pred }{@code >}
     *     {@link JAXBElement }{@code <}{@link FalsePred }{@code >}
     *     
     */
    public void setPred(JAXBElement<? extends Pred> value) {
        this.pred = value;
    }

}
