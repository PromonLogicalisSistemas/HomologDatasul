/**
 * ContabFolhaProfissionais_ttContabFolhaRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ColaboradoresService.logicalis.ws1.totvs;

public class ContabFolhaProfissionais_ttContabFolhaRow  implements java.io.Serializable {
    private java.lang.Integer cdn_funcionario;

    private java.lang.String cdn_evento;

    private java.lang.String nom_evento;

    private java.math.BigDecimal val_evento;

    private java.lang.String cod_cta_contabil;

    public ContabFolhaProfissionais_ttContabFolhaRow() {
    }

    public ContabFolhaProfissionais_ttContabFolhaRow(
           java.lang.Integer cdn_funcionario,
           java.lang.String cdn_evento,
           java.lang.String nom_evento,
           java.math.BigDecimal val_evento,
           java.lang.String cod_cta_contabil) {
           this.cdn_funcionario = cdn_funcionario;
           this.cdn_evento = cdn_evento;
           this.nom_evento = nom_evento;
           this.val_evento = val_evento;
           this.cod_cta_contabil = cod_cta_contabil;
    }


    /**
     * Gets the cdn_funcionario value for this ContabFolhaProfissionais_ttContabFolhaRow.
     * 
     * @return cdn_funcionario
     */
    public java.lang.Integer getCdn_funcionario() {
        return cdn_funcionario;
    }


    /**
     * Sets the cdn_funcionario value for this ContabFolhaProfissionais_ttContabFolhaRow.
     * 
     * @param cdn_funcionario
     */
    public void setCdn_funcionario(java.lang.Integer cdn_funcionario) {
        this.cdn_funcionario = cdn_funcionario;
    }


    /**
     * Gets the cdn_evento value for this ContabFolhaProfissionais_ttContabFolhaRow.
     * 
     * @return cdn_evento
     */
    public java.lang.String getCdn_evento() {
        return cdn_evento;
    }


    /**
     * Sets the cdn_evento value for this ContabFolhaProfissionais_ttContabFolhaRow.
     * 
     * @param cdn_evento
     */
    public void setCdn_evento(java.lang.String cdn_evento) {
        this.cdn_evento = cdn_evento;
    }


    /**
     * Gets the nom_evento value for this ContabFolhaProfissionais_ttContabFolhaRow.
     * 
     * @return nom_evento
     */
    public java.lang.String getNom_evento() {
        return nom_evento;
    }


    /**
     * Sets the nom_evento value for this ContabFolhaProfissionais_ttContabFolhaRow.
     * 
     * @param nom_evento
     */
    public void setNom_evento(java.lang.String nom_evento) {
        this.nom_evento = nom_evento;
    }


    /**
     * Gets the val_evento value for this ContabFolhaProfissionais_ttContabFolhaRow.
     * 
     * @return val_evento
     */
    public java.math.BigDecimal getVal_evento() {
        return val_evento;
    }


    /**
     * Sets the val_evento value for this ContabFolhaProfissionais_ttContabFolhaRow.
     * 
     * @param val_evento
     */
    public void setVal_evento(java.math.BigDecimal val_evento) {
        this.val_evento = val_evento;
    }


    /**
     * Gets the cod_cta_contabil value for this ContabFolhaProfissionais_ttContabFolhaRow.
     * 
     * @return cod_cta_contabil
     */
    public java.lang.String getCod_cta_contabil() {
        return cod_cta_contabil;
    }


    /**
     * Sets the cod_cta_contabil value for this ContabFolhaProfissionais_ttContabFolhaRow.
     * 
     * @param cod_cta_contabil
     */
    public void setCod_cta_contabil(java.lang.String cod_cta_contabil) {
        this.cod_cta_contabil = cod_cta_contabil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContabFolhaProfissionais_ttContabFolhaRow)) return false;
        ContabFolhaProfissionais_ttContabFolhaRow other = (ContabFolhaProfissionais_ttContabFolhaRow) obj;
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
            ((this.cdn_evento==null && other.getCdn_evento()==null) || 
             (this.cdn_evento!=null &&
              this.cdn_evento.equals(other.getCdn_evento()))) &&
            ((this.nom_evento==null && other.getNom_evento()==null) || 
             (this.nom_evento!=null &&
              this.nom_evento.equals(other.getNom_evento()))) &&
            ((this.val_evento==null && other.getVal_evento()==null) || 
             (this.val_evento!=null &&
              this.val_evento.equals(other.getVal_evento()))) &&
            ((this.cod_cta_contabil==null && other.getCod_cta_contabil()==null) || 
             (this.cod_cta_contabil!=null &&
              this.cod_cta_contabil.equals(other.getCod_cta_contabil())));
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
        if (getCdn_evento() != null) {
            _hashCode += getCdn_evento().hashCode();
        }
        if (getNom_evento() != null) {
            _hashCode += getNom_evento().hashCode();
        }
        if (getVal_evento() != null) {
            _hashCode += getVal_evento().hashCode();
        }
        if (getCod_cta_contabil() != null) {
            _hashCode += getCod_cta_contabil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContabFolhaProfissionais_ttContabFolhaRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "contabFolhaProfissionais_ttContabFolhaRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdn_funcionario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdn_funcionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdn_evento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdn_evento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom_evento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom_evento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("val_evento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "val_evento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod_cta_contabil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cod_cta_contabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
