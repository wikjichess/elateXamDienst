//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.10.25 at 09:48:26 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb;


/**
 * Java content class for mcSubTaskDef element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/G:/elateWorkspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 386)
 * <p>
 * <pre>
 * &lt;element name="mcSubTaskDef">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;extension base="{http://complex.taskmodel.thorstenberger.de/complexTaskDef}SubTaskDefType">
 *         &lt;sequence>
 *           &lt;element name="displayedAnswers">
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/element>
 *           &lt;element name="correct" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                   &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="incorrect" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                   &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;attribute name="preserveOrderOfAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *         &lt;attribute name="category" use="required">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="singleSelect"/>
 *               &lt;enumeration value="multipleSelect"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/attribute>
 *         &lt;attribute name="maxCorrectAnswers" type="{http://www.w3.org/2001/XMLSchema}int" />
 *         &lt;attribute name="minCorrectAnswers">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/attribute>
 *       &lt;/extension>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface McSubTaskDef
    extends javax.xml.bind.Element, de.thorstenberger.taskmodel.complex.jaxb.McSubTaskDefType
{


}
