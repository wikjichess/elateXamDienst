//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.10.25 at 09:48:26 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb.impl;

public class ClozeSubTaskDefImpl
    extends de.thorstenberger.taskmodel.complex.jaxb.impl.ClozeSubTaskDefTypeImpl
    implements de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDef, java.io.Serializable, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallableObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializable, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.ValidatableObject
{

    private final static long serialVersionUID = 1L;
    public final static java.lang.Class version = (de.thorstenberger.taskmodel.complex.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDef.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://complex.taskmodel.thorstenberger.de/complexTaskDef";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "clozeSubTaskDef";
    }

    public de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingEventHandler createUnmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
        return new de.thorstenberger.taskmodel.complex.jaxb.impl.ClozeSubTaskDefImpl.Unmarshaller(context);
    }

    public void serializeBody(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://complex.taskmodel.thorstenberger.de/complexTaskDef", "clozeSubTaskDef");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDef.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0013\u00d1\u00ba\u0018p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0013\u00d1\u00ba\rppsq\u0000~\u0000\u0007\u0010\u00ea\u0095&ppsq\u0000~\u0000\u0007\u000e\u00f2\b\u009appsq\u0000~\u0000\u0007\rT\u00a85ppsq\u0000~\u0000\u0007\f\u00b3>\u001appsq\u0000~"
+"\u0000\u0007\t\u0016\u00d9\u0004ppsq\u0000~\u0000\u0007\u0005\u00a0@Tppsq\u0000~\u0000\u0000\u0002\u0086\u00bb,pp\u0000sq\u0000~\u0000\u0007\u0002\u0086\u00bb!ppsr\u0000\u001bcom.sun.msv"
+".grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dat"
+"atype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;x"
+"q\u0000~\u0000\u0004\u0000\u008eH\u0015sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000#com"
+".sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidx"
+"r\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%"
+"com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun."
+"msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012"
+"Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u001cL\u0000\nwhiteSpacet\u0000.Lcom/sun/m"
+"sv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2"
+"001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpac"
+"eProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.W"
+"hiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expr"
+"ession$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0017psr\u0000\u001bcom.s"
+"un.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001cL\u0000\fnamespa"
+"ceURIq\u0000~\u0000\u001cxpq\u0000~\u0000 q\u0000~\u0000\u001fsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0001\u00f8s\u0007ppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001\u00f8r\u00fcq\u0000~\u0000\u0017psq\u0000~\u0000\u0012\u0001\u008a\u008c\u00f2p"
+"psr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0019q\u0000~\u0000"
+"\u001ft\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Co"
+"llapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\"q\u0000~\u0000%sq\u0000~\u0000&q\u0000~\u0000/q\u0000~\u0000\u001fsr\u0000#com.sun.msv."
+"grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001cL\u0000\fnamesp"
+"aceURIq\u0000~\u0000\u001cxr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004"
+"typet\u0000)http://www.w3.org/2001/XMLSchema-instancesr\u00000com.sun."
+"msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000"
+"\tsq\u0000~\u0000\u0016\u0001psq\u0000~\u00003t\u0000\u0007problemt\u00009http://complex.taskmodel.thorste"
+"nberger.de/complexTaskDefsq\u0000~\u0000(\u0003\u0019\u0085#ppsq\u0000~\u0000\u0000\u0003\u0019\u0085\u0018q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0007"
+"\u0003\u0019\u0085\rppq\u0000~\u0000\u0015sq\u0000~\u0000(\u0002\u008b<\u00f3ppsq\u0000~\u0000*\u0002\u008b<\u00e8q\u0000~\u0000\u0017pq\u0000~\u0000,sq\u0000~\u00003q\u0000~\u00006q\u0000~\u00007"
+"q\u0000~\u00009sq\u0000~\u00003t\u0000\u0004hintq\u0000~\u0000=q\u0000~\u00009sq\u0000~\u0000(\u0003v\u0098\u00abppsq\u0000~\u0000\u0000\u0003v\u0098\u00a0q\u0000~\u0000\u0017p\u0000sq\u0000"
+"~\u0000\u0007\u0003v\u0098\u0095ppq\u0000~\u0000\u0015sq\u0000~\u0000(\u0002\u00e8P{ppsq\u0000~\u0000*\u0002\u00e8Ppq\u0000~\u0000\u0017pq\u0000~\u0000,sq\u0000~\u00003q\u0000~\u00006q\u0000"
+"~\u00007q\u0000~\u00009sq\u0000~\u00003t\u0000\u000ecorrectionHintq\u0000~\u0000=q\u0000~\u00009sq\u0000~\u0000\u0000\u0003\u009ce\u0011pp\u0000sq\u0000~\u0000\u0007"
+"\u0003\u009ce\u0006ppsq\u0000~\u0000\u0000\u0001\u0086\u00f2ipp\u0000sq\u0000~\u0000(\u0001\u0086\u00f2^ppsr\u0000 com.sun.msv.grammar.OneOr"
+"MoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001\u0086\u00f2Sq\u0000~\u0000\u0017psq\u0000~\u0000*\u0001\u0086\u00f2Pq\u0000~\u0000\u0017psr\u00002com.sun.msv."
+"grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bq"
+"\u0000~\u0000:q\u0000~\u0000Wsr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
+"\u00004q\u0000~\u00009sq\u0000~\u00003t\u0000Fde.thorstenberger.taskmodel.complex.jaxb.Clo"
+"zeSubTaskDefType.ClozeTypet\u0000+http://java.sun.com/jaxb/xjc/du"
+"mmy-elementssq\u0000~\u0000(\u0002\u0015r\u0098ppsq\u0000~\u0000*\u0002\u0015r\u008dq\u0000~\u0000\u0017pq\u0000~\u0000,sq\u0000~\u00003q\u0000~\u00006q\u0000~\u0000"
+"7q\u0000~\u00009sq\u0000~\u00003t\u0000\u0005clozeq\u0000~\u0000=sq\u0000~\u0000(\u0000\u00a1j\u0016ppsq\u0000~\u0000*\u0000\u00a1j\u000bq\u0000~\u0000\u0017pq\u0000~\u0000\u0015sq"
+"\u0000~\u00003t\u0000\u0002idt\u0000\u0000q\u0000~\u00009sq\u0000~\u0000(\u0001\u009d``ppsq\u0000~\u0000*\u0001\u009d`Uq\u0000~\u0000\u0017psq\u0000~\u0000\u0012\u0000\u00baB!ppsr\u0000"
+"$com.sun.msv.datatype.xsd.BooleanType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0019q\u0000~\u0000\u001ft"
+"\u0000\u0007booleanq\u0000~\u00001q\u0000~\u0000%sq\u0000~\u0000&q\u0000~\u0000lq\u0000~\u0000\u001fsq\u0000~\u00003t\u0000\u0005trashq\u0000~\u0000fq\u0000~\u00009s"
+"q\u0000~\u0000(\u0001\u00f8\u008c\u0087ppsq\u0000~\u0000*\u0001\u00f8\u008c|q\u0000~\u0000\u0017pq\u0000~\u0000isq\u0000~\u00003t\u0000\u0013interactiveFeedback"
+"q\u0000~\u0000fq\u0000~\u00009sq\u0000~\u0000(\u0002\u00e7$\u00e2ppsq\u0000~\u0000*\u0002\u00e7$\u00d7q\u0000~\u0000\u0017pq\u0000~\u0000,sq\u0000~\u00003q\u0000~\u00006q\u0000~\u00007q"
+"\u0000~\u00009sq\u0000~\u00003t\u0000\u000fclozeSubTaskDefq\u0000~\u0000=sr\u0000\"com.sun.msv.grammar.Exp"
+"ressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Exp"
+"ressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionP"
+"ool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000z["
+"\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0017\u0000\u0000\u00009pur\u0000![L"
+"com.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppq\u0000~\u0000"
+"ppppppppq\u0000~\u0000Apppppppppppppppppppppq\u0000~\u0000Hpppppppppq\u0000~\u0000\u000bq\u0000~\u0000\tpp"
+"ppppppppq\u0000~\u0000Fq\u0000~\u0000\fq\u0000~\u0000\npppppppppppppppppppppppppq\u0000~\u0000Ippppppp"
+"ppppppppppppppq\u0000~\u0000bppppq\u0000~\u0000\u0011pppq\u0000~\u0000\u000fppppppppq\u0000~\u0000Oppppppppq\u0000~"
+"\u0000\rppppppq\u0000~\u0000Tpppq\u0000~\u0000]ppppppq\u0000~\u0000Qpq\u0000~\u0000@pppppppq\u0000~\u0000)pppppppq\u0000~"
+"\u0000gq\u0000~\u0000tppppq\u0000~\u0000>ppppq\u0000~\u0000\u000epppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return de.thorstenberger.taskmodel.complex.jaxb.impl.ClozeSubTaskDefImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "trash");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "interactiveFeedback");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("problem" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            spawnHandlerFromEnterElement((((de.thorstenberger.taskmodel.complex.jaxb.impl.ClozeSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.ClozeSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("clozeSubTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("clozeSubTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "trash");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "interactiveFeedback");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((de.thorstenberger.taskmodel.complex.jaxb.impl.ClozeSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.ClozeSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("trash" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((de.thorstenberger.taskmodel.complex.jaxb.impl.ClozeSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.ClozeSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("interactiveFeedback" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((de.thorstenberger.taskmodel.complex.jaxb.impl.ClozeSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.ClozeSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "trash");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "interactiveFeedback");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "trash");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "interactiveFeedback");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
