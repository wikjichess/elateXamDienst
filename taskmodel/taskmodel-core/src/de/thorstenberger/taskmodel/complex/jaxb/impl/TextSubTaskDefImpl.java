//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.31 at 03:50:48 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb.impl;

public class TextSubTaskDefImpl
    extends de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefTypeImpl
    implements de.thorstenberger.taskmodel.complex.jaxb.TextSubTaskDef, java.io.Serializable, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallableObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializable, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.ValidatableObject
{

    private final static long serialVersionUID = 1L;
    public final static java.lang.Class version = (de.thorstenberger.taskmodel.complex.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (de.thorstenberger.taskmodel.complex.jaxb.TextSubTaskDef.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://complex.taskmodel.thorstenberger.de/complexTaskDef";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "textSubTaskDef";
    }

    public de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingEventHandler createUnmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
        return new de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefImpl.Unmarshaller(context);
    }

    public void serializeBody(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://complex.taskmodel.thorstenberger.de/complexTaskDef", "textSubTaskDef");
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
        return (de.thorstenberger.taskmodel.complex.jaxb.TextSubTaskDef.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u001b(|\u0082p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u001b(|wppsq\u0000~\u0000\u0007\u0019\u0087\u00c5\u008eppsq\u0000~\u0000\u0007\u0017\u00ccPOppsq\u0000~\u0000\u0007\u0014\u00da\u00d9\u0002ppsq\u0000~\u0000\u0007\u0012\u00bd\u001f\u009cppsq\u0000~"
+"\u0000\u0007\u0010s\u009b\nppsq\u0000~\u0000\u0007\u000b\u00b6E\u00c2ppsq\u0000~\u0000\u0007\u0007\u0092\u00e5\bppsq\u0000~\u0000\u0000\u0003\u00c0~Qpp\u0000sq\u0000~\u0000\u0007\u0003\u00c0~Fppsr\u0000"
+"\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/"
+"datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/"
+"StringPair;xq\u0000~\u0000\u0004\u0001\u00b3:\u001esr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valu"
+"exp\u0000psr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\ris"
+"AlwaysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnam"
+"espaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u001dL\u0000\nwhiteSpacet"
+"\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://"
+"www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv.datatype.x"
+"sd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.da"
+"tatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv."
+"grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~"
+"\u0000\u0018psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~"
+"\u0000\u001dL\u0000\fnamespaceURIq\u0000~\u0000\u001dxpq\u0000~\u0000!q\u0000~\u0000 sr\u0000\u001dcom.sun.msv.grammar.Ch"
+"oiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002\rD#ppsr\u0000 com.sun.msv.grammar.Attrib"
+"uteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0002\rD\u0018q\u0000~\u0000\u0018"
+"psq\u0000~\u0000\u0013\u0001JV\u0002ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u0000\u001aq\u0000~\u0000 t\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpace"
+"Processor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000#q\u0000~\u0000&sq\u0000~\u0000\'q\u0000~\u00000q\u0000~\u0000 sr\u0000#"
+"com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000"
+"~\u0000\u001dL\u0000\fnamespaceURIq\u0000~\u0000\u001dxr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instance"
+"sr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tsq\u0000~\u0000\u0017\u0001psq\u0000~\u00004t\u0000\u0007problemt\u00009http://complex.taskm"
+"odel.thorstenberger.de/complexTaskDefsq\u0000~\u0000)\u0003\u00d2f\u00b2ppsq\u0000~\u0000\u0000\u0003\u00d2f\u00a7q"
+"\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007\u0003\u00d2f\u009cppq\u0000~\u0000\u0016sq\u0000~\u0000)\u0002\u001f,yppsq\u0000~\u0000+\u0002\u001f,nq\u0000~\u0000\u0018pq\u0000~\u0000-sq\u0000~"
+"\u00004q\u0000~\u00007q\u0000~\u00008q\u0000~\u0000:sq\u0000~\u00004t\u0000\u0004hintq\u0000~\u0000>q\u0000~\u0000:sq\u0000~\u0000)\u0004#`\u00b5ppsq\u0000~\u0000\u0000\u0004#"
+"`\u00aaq\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007\u0004#`\u009fppq\u0000~\u0000\u0016sq\u0000~\u0000)\u0002p&|ppsq\u0000~\u0000+\u0002p&qq\u0000~\u0000\u0018pq\u0000~\u0000-s"
+"q\u0000~\u00004q\u0000~\u00007q\u0000~\u00008q\u0000~\u0000:sq\u0000~\u00004t\u0000\u0015initialTextFieldValueq\u0000~\u0000>q\u0000~\u0000:"
+"sq\u0000~\u0000)\u0004\u00bdUCppsq\u0000~\u0000\u0000\u0004\u00bdU8q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007\u0004\u00bdU-ppq\u0000~\u0000\u0016sq\u0000~\u0000)\u0003\n\u001b\nppsq"
+"\u0000~\u0000+\u0003\n\u001a\u00ffq\u0000~\u0000\u0018pq\u0000~\u0000-sq\u0000~\u00004q\u0000~\u00007q\u0000~\u00008q\u0000~\u0000:sq\u0000~\u00004t\u0000\u000ecorrectionH"
+"intq\u0000~\u0000>q\u0000~\u0000:sq\u0000~\u0000)\u0002I\u0084\u008dppsq\u0000~\u0000+\u0002I\u0084\u0082q\u0000~\u0000\u0018psq\u0000~\u0000\u0013\u0000\u0081\u00a1\u00a7ppsr\u0000*com"
+".sun.msv.datatype.xsd.MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.su"
+"n.msv.datatype.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljav"
+"a/lang/Object;xr\u00009com.sun.msv.datatype.xsd.DataTypeWithValue"
+"ConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataT"
+"ypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL"
+"\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fcon"
+"creteTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetN"
+"ameq\u0000~\u0000\u001dxq\u0000~\u0000\u001cq\u0000~\u0000>pq\u0000~\u00002\u0000\u0000sr\u0000 com.sun.msv.datatype.xsd.IntT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.IntegerDerivedTyp"
+"e\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetsq\u0000~\u0000_xq\u0000~\u0000\u001aq\u0000~\u0000 t\u0000\u0003intq\u0000~\u00002sr\u0000*com."
+"sun.msv.datatype.xsd.MaxInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000[ppq\u0000~"
+"\u00002\u0000\u0001sq\u0000~\u0000Zppq\u0000~\u00002\u0000\u0000sr\u0000!com.sun.msv.datatype.xsd.LongType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000cq\u0000~\u0000 t\u0000\u0004longq\u0000~\u00002sq\u0000~\u0000fppq\u0000~\u00002\u0000\u0001sq\u0000~\u0000Zppq\u0000~\u00002\u0000\u0000"
+"sr\u0000$com.sun.msv.datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000cq\u0000~"
+"\u0000 t\u0000\u0007integerq\u0000~\u00002sr\u0000,com.sun.msv.datatype.xsd.FractionDigits"
+"Facet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.datatype.xsd.DataTyp"
+"eWithLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000^ppq\u0000~\u00002\u0001\u0000sr\u0000#com"
+".sun.msv.datatype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001aq\u0000~\u0000 t\u0000\u0007dec"
+"imalq\u0000~\u00002q\u0000~\u0000ut\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000ot\u0000\fminInclusivesr\u0000\u000ej"
+"ava.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010java.lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b"
+"\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000ot\u0000\fmaxInclusivesq\u0000~\u0000y\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000jq\u0000~\u0000xsr\u0000"
+"\u0011java.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u0000z\u0080\u0000\u0000\u0000q\u0000~\u0000jq\u0000~\u0000|sq\u0000"
+"~\u0000~\u007f\u00ff\u00ff\u00ffq\u0000~\u0000dq\u0000~\u0000xsq\u0000~\u0000~\u0000\u0000\u0000\u0001q\u0000~\u0000&sq\u0000~\u0000\'t\u0000\u000bint-derivedq\u0000~\u0000>sq\u0000"
+"~\u00004t\u0000\u000ftextFieldHeightt\u0000\u0000q\u0000~\u0000:sq\u0000~\u0000)\u0002\u001d\u00b9appsq\u0000~\u0000+\u0002\u001d\u00b9Vq\u0000~\u0000\u0018psq\u0000"
+"~\u0000\u0013\u0000\u001fb6ppsr\u0000$com.sun.msv.datatype.xsd.BooleanType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000\u001aq\u0000~\u0000 t\u0000\u0007booleanq\u0000~\u00002q\u0000~\u0000&sq\u0000~\u0000\'q\u0000~\u0000\u008cq\u0000~\u0000 sq\u0000~\u00004t\u0000\u0005tras"
+"hq\u0000~\u0000\u0086q\u0000~\u0000:sq\u0000~\u0000)\u0002\u00f1wHppsq\u0000~\u0000+\u0002\u00f1w=q\u0000~\u0000\u0018psq\u0000~\u0000\u0013\u0001\u00e7\u008c\u00a6ppsq\u0000~\u0000Zq\u0000~"
+"\u0000>pq\u0000~\u00002\u0000\u0000q\u0000~\u0000dq\u0000~\u0000dq\u0000~\u0000xsq\u0000~\u0000~\u0000\u0000\u0000\u0001q\u0000~\u0000&sq\u0000~\u0000\'t\u0000\u000bint-derived"
+"q\u0000~\u0000>sq\u0000~\u00004t\u0000\u000etextFieldWidthq\u0000~\u0000\u0086q\u0000~\u0000:sq\u0000~\u0000+\u0001\u00bbu:ppq\u0000~\u0000\u0016sq\u0000~\u0000"
+"4t\u0000\u0002idq\u0000~\u0000\u0086sq\u0000~\u0000)\u0001\u00a0\u00b6\u00e4ppsq\u0000~\u0000+\u0001\u00a0\u00b6\u00d9q\u0000~\u0000\u0018pq\u0000~\u0000-sq\u0000~\u00004q\u0000~\u00007q\u0000~\u00008"
+"q\u0000~\u0000:sq\u0000~\u00004t\u0000\u000etextSubTaskDefq\u0000~\u0000>sr\u0000\"com.sun.msv.grammar.Exp"
+"ressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Exp"
+"ressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionP"
+"ool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u00a2["
+"\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0017\u0000\u0000\u00009pur\u0000![L"
+"com.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppq\u0000~\u0000\rpq\u0000~"
+"\u0000Ippppppppppppppq\u0000~\u0000Wppppppq\u0000~\u0000Gpppppppppppppppq\u0000~\u0000\u009cq\u0000~\u0000Qq\u0000~"
+"\u0000\u000bpppppppppppq\u0000~\u0000Appppppppq\u0000~\u0000\u0010q\u0000~\u0000Opppppppppppq\u0000~\u0000?pppppppp"
+"ppppppppppq\u0000~\u0000\u000fpppppq\u0000~\u0000*q\u0000~\u0000\u0090pppppppppppq\u0000~\u0000\u0087pppppppq\u0000~\u0000\fpp"
+"ppppppppppq\u0000~\u0000Jq\u0000~\u0000\nppppppppppppppppppppppq\u0000~\u0000\u0012ppppppq\u0000~\u0000\u000epp"
+"pppppq\u0000~\u0000Rppppppppq\u0000~\u0000\tpppq\u0000~\u0000B"));
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
            return de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefImpl.this;
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
                        attIdx = context.getAttribute("", "textFieldHeight");
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
                        attIdx = context.getAttribute("", "textFieldWidth");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("textSubTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
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
                    case  1 :
                        attIdx = context.getAttribute("", "textFieldHeight");
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
                        attIdx = context.getAttribute("", "textFieldWidth");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  2 :
                        if (("textSubTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.popAttributes();
                            state = 3;
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
                        if (("textFieldHeight" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("trash" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("textFieldWidth" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("id" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        attIdx = context.getAttribute("", "textFieldHeight");
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
                        attIdx = context.getAttribute("", "textFieldWidth");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "id");
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
                            attIdx = context.getAttribute("", "textFieldHeight");
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
                            attIdx = context.getAttribute("", "textFieldWidth");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "id");
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
