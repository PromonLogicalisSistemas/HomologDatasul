/**
 * CustoProfissional_ttCustoColabRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ColaboradoresService.logicalis.ws1.totvs;

public class CustoProfissional_ttCustoColabRow  implements java.io.Serializable {
    private java.lang.Integer cdn_funcionario;

    private java.math.BigDecimal val_custo_hora;

    public CustoProfissional_ttCustoColabRow() {
    }

    public CustoProfissional_ttCustoColabRow(
           java.lang.Integer cdn_funcionario,
           java.math.BigDecimal val_custo_hora) {
           this.cdn_funcionario = cdn_funcionario;
           this.val_custo_hora = val_custo_hora;
    }


    /**
     * Gets the cdn_funcionario value for this CustoProfissional_ttCustoColabRow.
     * 
     * @return cdn_funcionario
     */
    public java.lang.Integer getCdn_funcionario() {
        return cdn_funcionario;
    }


    /**
     * Sets the cdn_funcionario value for this CustoProfissional_ttCustoColabRow.
     * 
     * @param cdn_funcionario
     */
    public void setCdn_funcionario(java.lang.Integer cdn_funcionario) {
        this.cdn_funcionario = cdn_funcionario;
    }


    /**
     * Gets the val_custo_hora value for this CustoProfissional_ttCustoColabRow.
     * 
     * @return val_custo_hora
     */
    public java.math.BigDecimal getVal_custo_hora() {
        return val_custo_hora;
    }


    /**
     * Sets the val_custo_hora value for this CustoProfissional_ttCustoColabRow.
     * 
     * @param val_custo_hora
     */
    public void setVal_custo_hora(java.math.BigDecimal val_custo_hora) {
        this.val_custo_hora = val_custo_hora;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustoProfissional_ttCustoColabRow)) return false;
        CustoProfissional_ttCustoColabRow other = (CustoProfissional_ttCustoColabRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdn_funcionario==null && other.getCdn_funcionario()==null) || 
             (this.cdn_funcionario!=null &&
              this.cdn_funcionario.equals(other.getCdn_funcionario()))) &&
            ((this.val_custo_hora==null && other.getVal_custo_hora()==null) || 
             (this.val_custo_hora!=null &&
              this.val_custo_hora.equals(other.getVal_custo_hora())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCdn_funcionario() != null) {
            _hashCode += getCdn_funcionario().hashCode();
        }
        if (getVal_custo_hora() != null) {
            _hashCode += getVal_custo_hora().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustoProfissional_ttCustoColabRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "custoProfissional_ttCustoColabRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdn_funcionario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdn_funcionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("val_custo_hora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "val_custo_hora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
