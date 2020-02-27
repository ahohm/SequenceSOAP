//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.02.27 à 09:30:28 PM GMT+01:00 
//


package com.aho.exam1.sequence;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seq1" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="seq2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seq1",
    "seq2"
})
@XmlRootElement(name = "SequenceRequest")
public class SequenceRequest {

    @XmlElement(required = true)
    protected BigInteger seq1;
    @XmlElement(required = true)
    protected BigInteger seq2;

    /**
     * Obtient la valeur de la propriété seq1.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeq1() {
        return seq1;
    }

    /**
     * Définit la valeur de la propriété seq1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeq1(BigInteger value) {
        this.seq1 = value;
    }

    /**
     * Obtient la valeur de la propriété seq2.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeq2() {
        return seq2;
    }

    /**
     * Définit la valeur de la propriété seq2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeq2(BigInteger value) {
        this.seq2 = value;
    }

}
