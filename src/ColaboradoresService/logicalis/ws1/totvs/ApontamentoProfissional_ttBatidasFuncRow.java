/**
 * ApontamentoProfissional_ttBatidasFuncRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ColaboradoresService.logicalis.ws1.totvs;

public class ApontamentoProfissional_ttBatidasFuncRow  implements java.io.Serializable {
    private java.lang.Integer cdn_funcionario;

    private java.util.Date dat_batida;

    private java.lang.String id_batida;

    private java.lang.String hra_batida;

    private java.lang.Integer cdn_situacao;

    private java.lang.String des_situacao;

    private java.lang.String cod_observ;

    private java.lang.String des_observ;

    public ApontamentoProfissional_ttBatidasFuncRow() {
    }

    public ApontamentoProfissional_ttBatidasFuncRow(
           java.lang.Integer cdn_funcionario,
           java.util.Date dat_batida,
           java.lang.String id_batida,
           java.lang.String hra_batida,
           java.lang.Integer cdn_situacao,
           java.lang.String des_situacao,
           java.lang.String cod_observ,
           java.lang.String des_observ) {
           this.cdn_funcionario = cdn_funcionario;
           this.dat_batida = dat_batida;
           this.id_batida = id_batida;
           this.hra_batida = hra_batida;
           this.cdn_situacao = cdn_situacao;
           this.des_situacao = des_situacao;
           this.cod_observ = cod_observ;
           this.des_observ = des_observ;
    }


    /**
     * Gets the cdn_funcionario value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @return cdn_funcionario
     */
    public java.lang.Integer getCdn_funcionario() {
        return cdn_funcionario;
    }


    /**
     * Sets the cdn_funcionario value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @param cdn_funcionario
     */
    public void setCdn_funcionario(java.lang.Integer cdn_funcionario) {
        this.cdn_funcionario = cdn_funcionario;
    }


    /**
     * Gets the dat_batida value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @return dat_batida
     */
    public java.util.Date getDat_batida() {
        return dat_batida;
    }


    /**
     * Sets the dat_batida value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @param dat_batida
     */
    public void setDat_batida(java.util.Date dat_batida) {
        this.dat_batida = dat_batida;
    }


    /**
     * Gets the id_batida value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @return id_batida
     */
    public java.lang.String getId_batida() {
        return id_batida;
    }


    /**
     * Sets the id_batida value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @param id_batida
     */
    public void setId_batida(java.lang.String id_batida) {
        this.id_batida = id_batida;
    }


    /**
     * Gets the hra_batida value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @return hra_batida
     */
    public java.lang.String getHra_batida() {
        return hra_batida;
    }


    /**
     * Sets the hra_batida value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @param hra_batida
     */
    public void setHra_batida(java.lang.String hra_batida) {
        this.hra_batida = hra_batida;
    }


    /**
     * Gets the cdn_situacao value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @return cdn_situacao
     */
    public java.lang.Integer getCdn_situacao() {
        return cdn_situacao;
    }


    /**
     * Sets the cdn_situacao value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @param cdn_situacao
     */
    public void setCdn_situacao(java.lang.Integer cdn_situacao) {
        this.cdn_situacao = cdn_situacao;
    }


    /**
     * Gets the des_situacao value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @return des_situacao
     */
    public java.lang.String getDes_situacao() {
        return des_situacao;
    }


    /**
     * Sets the des_situacao value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @param des_situacao
     */
    public void setDes_situacao(java.lang.String des_situacao) {
        this.des_situacao = des_situacao;
    }


    /**
     * Gets the cod_observ value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @return cod_observ
     */
    public java.lang.String getCod_observ() {
        return cod_observ;
    }


    /**
     * Sets the cod_observ value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @param cod_observ
     */
    public void setCod_observ(java.lang.String cod_observ) {
        this.cod_observ = cod_observ;
    }


    /**
     * Gets the des_observ value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @return des_observ
     */
    public java.lang.String getDes_observ() {
        return des_observ;
    }


    /**
     * Sets the des_observ value for this ApontamentoProfissional_ttBatidasFuncRow.
     * 
     * @param des_observ
     */
    public void setDes_observ(java.lang.String des_observ) {
        this.des_observ = des_observ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApontamentoProfissional_ttBatidasFuncRow)) return false;
        ApontamentoProfissional_ttBatidasFuncRow other = (ApontamentoProfissional_ttBatidasFuncRow) obj;
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
            ((this.dat_batida==null && other.getDat_batida()==null) || 
             (this.dat_batida!=null &&
              this.dat_batida.equals(other.getDat_batida()))) &&
            ((this.id_batida==null && other.getId_batida()==null) || 
             (this.id_batida!=null &&
              this.id_batida.equals(other.getId_batida()))) &&
            ((this.hra_batida==null && other.getHra_batida()==null) || 
             (this.hra_batida!=null &&
              this.hra_batida.equals(other.getHra_batida()))) &&
            ((this.cdn_situacao==null && other.getCdn_situacao()==null) || 
             (this.cdn_situacao!=null &&
              this.cdn_situacao.equals(other.getCdn_situacao()))) &&
            ((this.des_situacao==null && other.getDes_situacao()==null) || 
             (this.des_situacao!=null &&
              this.des_situacao.equals(other.getDes_situacao()))) &&
            ((this.cod_observ==null && other.getCod_observ()==null) || 
             (this.cod_observ!=null &&
              this.cod_observ.equals(other.getCod_observ()))) &&
            ((this.des_observ==null && other.getDes_observ()==null) || 
             (this.des_observ!=null &&
              this.des_observ.equals(other.getDes_observ())));
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
        if (getDat_batida() != null) {
            _hashCode += getDat_batida().hashCode();
        }
        if (getId_batida() != null) {
            _hashCode += getId_batida().hashCode();
        }
        if (getHra_batida() != null) {
            _hashCode += getHra_batida().hashCode();
        }
        if (getCdn_situacao() != null) {
            _hashCode += getCdn_situacao().hashCode();
        }
        if (getDes_situacao() != null) {
            _hashCode += getDes_situacao().hashCode();
        }
        if (getCod_observ() != null) {
            _hashCode += getCod_observ().hashCode();
        }
        if (getDes_observ() != null) {
            _hashCode += getDes_observ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApontamentoProfissional_ttBatidasFuncRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "apontamentoProfissional_ttBatidasFuncRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdn_funcionario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdn_funcionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dat_batida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dat_batida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_batida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_batida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hra_batida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hra_batida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdn_situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdn_situacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("des_situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "des_situacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod_observ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cod_observ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("des_observ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "des_observ"));
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
