//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.10.15 at 06:48:35 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/G:/elateWorkspace/elatePortal_head/taskmodel-core/jaxb/complexTaskDef.xsd line 391)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://complex.taskmodel.thorstenberger.de/complexTaskDef}SubTaskDefType">
 *       &lt;sequence>
 *         &lt;element name="displayedAnswers">
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="1"/>
 *           &lt;/restriction>
 *         &lt;/element>
 *         &lt;element name="correct" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="incorrect" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="preserveOrderOfAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="minCorrectAnswers">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="category" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="singleSelect"/>
 *             &lt;enumeration value="multipleSelect"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="maxCorrectAnswers" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface McSubTaskDefType
    extends de.thorstenberger.taskmodel.complex.jaxb.SubTaskDefType
{


    /**
     * 
     */
    int getDisplayedAnswers();

    /**
     * 
     */
    void setDisplayedAnswers(int value);

    boolean isSetDisplayedAnswers();

    void unsetDisplayedAnswers();

    /**
     * 
     */
    boolean isPreserveOrderOfAnswers();

    /**
     * 
     */
    void setPreserveOrderOfAnswers(boolean value);

    boolean isSetPreserveOrderOfAnswers();

    void unsetPreserveOrderOfAnswers();

    /**
     * 
     */
    int getMinCorrectAnswers();

    /**
     * 
     */
    void setMinCorrectAnswers(int value);

    boolean isSetMinCorrectAnswers();

    void unsetMinCorrectAnswers();

    /**
     * 
     */
    int getMaxCorrectAnswers();

    /**
     * 
     */
    void setMaxCorrectAnswers(int value);

    boolean isSetMaxCorrectAnswers();

    void unsetMaxCorrectAnswers();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCategory();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCategory(java.lang.String value);

    boolean isSetCategory();

    void unsetCategory();

    /**
     * Gets the value of the Incorrect property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Incorrect property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncorrect().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link de.thorstenberger.taskmodel.complex.jaxb.McSubTaskDefType.IncorrectType}
     * 
     */
    java.util.List getIncorrect();

    boolean isSetIncorrect();

    void unsetIncorrect();

    /**
     * Gets the value of the Correct property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Correct property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrect().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link de.thorstenberger.taskmodel.complex.jaxb.McSubTaskDefType.CorrectType}
     * 
     */
    java.util.List getCorrect();

    boolean isSetCorrect();

    void unsetCorrect();


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/G:/elateWorkspace/elatePortal_head/taskmodel-core/jaxb/complexTaskDef.xsd line 403)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface CorrectType {


        /**
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getValue();

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setValue(java.lang.String value);

        boolean isSetValue();

        void unsetValue();

        /**
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getId();

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setId(java.lang.String value);

        boolean isSetId();

        void unsetId();

    }


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/G:/elateWorkspace/elatePortal_head/taskmodel-core/jaxb/complexTaskDef.xsd line 412)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface IncorrectType {


        /**
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getValue();

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setValue(java.lang.String value);

        boolean isSetValue();

        void unsetValue();

        /**
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getId();

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setId(java.lang.String value);

        boolean isSetId();

        void unsetId();

    }

}
