/**
 * ListaEscalas_ttEscalasRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ColaboradoresService.logicalis.ws1.totvs;

public class ListaEscalas_ttEscalasRow  implements java.io.Serializable {
    private java.lang.Integer cdn_funcionario;

    private java.lang.Integer num_dia;

    private java.lang.String cod_tipo_dia;

    private java.lang.String hra_ini_jornada;

    private java.lang.String hra_fim_jornada;

    public ListaEscalas_ttEscalasRow() {
    }

    public ListaEscalas_ttEscalasRow(
           java.lang.Integer cdn_funcionario,
           java.lang.Integer num_dia,
           java.lang.String cod_tipo_dia,
           java.lang.String hra_ini_jornada,
           java.lang.String hra_fim_jornada) {
           this.cdn_funcionario = cdn_funcionario;
           this.num_dia = num_dia;
           this.cod_tipo_dia = cod_tipo_dia;
           this.hra_ini_jornada = hra_ini_jornada;
           this.hra_fim_jornada = hra_fim_jornada;
    }


    /**
     * Gets the cdn_funcionario value for this ListaEscalas_ttEscalasRow.
     * 
     * @return cdn_funcionario
     */
    public java.lang.Integer getCdn_funcionario() {
        return cdn_funcionario;
    }


    /**
     * Sets the cdn_funcionario value for this ListaEscalas_ttEscalasRow.
     * 
     * @param cdn_funcionario
     */
    public void setCdn_funcionario(java.lang.Integer cdn_funcionario) {
        this.cdn_funcionario = cdn_funcionario;
    }


    /**
     * Gets the num_dia value for this ListaEscalas_ttEscalasRow.
     * 
     * @return num_dia
     */
    public java.lang.Integer getNum_dia() {
        return num_dia;
    }


    /**
     * Sets the num_dia value for this ListaEscalas_ttEscalasRow.
     * 
     * @param num_dia
     */
    public void setNum_dia(java.lang.Integer num_dia) {
        this.num_dia = num_dia;
    }


    /**
     * Gets the cod_tipo_dia value for this ListaEscalas_ttEscalasRow.
     * 
     * @return cod_tipo_dia
     */
    public java.lang.String getCod_tipo_dia() {
        return cod_tipo_dia;
    }


    /**
     * Sets the cod_tipo_dia value for this ListaEscalas_ttEscalasRow.
     * 
     * @param cod_tipo_dia
     */
    public void setCod_tipo_dia(java.lang.String cod_tipo_dia) {
        this.cod_tipo_dia = cod_tipo_dia;
    }


    /**
     * Gets the hra_ini_jornada value for this ListaEscalas_ttEscalasRow.
     * 
     * @return hra_ini_jornada
     */
    public java.lang.String getHra_ini_jornada() {
        return hra_ini_jornada;
    }


    /**
     * Sets the hra_ini_jornada value for this ListaEscalas_ttEscalasRow.
     * 
     * @param hra_ini_jornada
     */
    public void setHra_ini_jornada(java.lang.String hra_ini_jornada) {
        this.hra_ini_jornada = hra_ini_jornada;
    }


    /**
     * Gets the hra_fim_jornada value for this ListaEscalas_ttEscalasRow.
     * 
     * @return hra_fim_jornada
     */
    public java.lang.String getHra_fim_jornada() {
        return hra_fim_jornada;
    }


    /**
     * Sets the hra_fim_jornada value for this ListaEscalas_ttEscalasRow.
     * 
     * @param hra_fim_jornada
     */
    public void setHra_fim_jornada(java.lang.String hra_fim_jornada) {
        this.hra_fim_jornada = hra_fim_jornada;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaEscalas_ttEscalasRow)) return false;
        ListaEscalas_ttEscalasRow other = (ListaEscalas_ttEscalasRow) obj;
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
            ((this.num_dia==null && other.getNum_dia()==null) || 
             (this.num_dia!=null &&
              this.num_dia.equals(other.getNum_dia()))) &&
            ((this.cod_tipo_dia==null && other.getCod_tipo_dia()==null) || 
             (this.cod_tipo_dia!=null &&
              this.cod_tipo_dia.equals(other.getCod_tipo_dia()))) &&
            ((this.hra_ini_jornada==null && other.getHra_ini_jornada()==null) || 
             (this.hra_ini_jornada!=null &&
              this.hra_ini_jornada.equals(other.getHra_ini_jornada()))) &&
            ((this.hra_fim_jornada==null && other.getHra_fim_jornada()==null) || 
             (this.hra_fim_jornada!=null &&
              this.hra_fim_jornada.equals(other.getHra_fim_jornada())));
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
        if (getNum_dia() != null) {
            _hashCode += getNum_dia().hashCode();
        }
        if (getCod_tipo_dia() != null) {
            _hashCode += getCod_tipo_dia().hashCode();
        }
        if (getHra_ini_jornada() != null) {
            _hashCode += getHra_ini_jornada().hashCode();
        }
        if (getHra_fim_jornada() != null) {
            _hashCode += getHra_fim_jornada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaEscalas_ttEscalasRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "listaEscalas_ttEscalasRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdn_funcionario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdn_funcionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_dia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "num_dia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod_tipo_dia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cod_tipo_dia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hra_ini_jornada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hra_ini_jornada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hra_fim_jornada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hra_fim_jornada"));
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
