/**
 * ColaboradoresServiceObjStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package logicalis.ws1.totvs;

public class ColaboradoresServiceObjStub extends org.apache.axis.client.Stub implements logicalis.ws1.totvs.ColaboradoresServiceObj {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("apontamentoProfissional");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dat_refer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ttBatidasFunc"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "apontamentoProfissional_ttBatidasFuncParam"), ColaboradoresService.logicalis.ws1.totvs.ApontamentoProfissional_ttBatidasFuncRow[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ttBatidasFuncRow"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://br1nidbm994:8080/wsa/wsa1", "FaultDetail"),
                      "details.soap_fault.FaultDetail",
                      new javax.xml.namespace.QName("urn:soap-fault:details", "FaultDetail"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("batidasTratadas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ttBatidasFunc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "batidasTratadas_ttBatidasFuncParam"), ColaboradoresService.logicalis.ws1.totvs.BatidasTratadas_ttBatidasFuncRow[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ttBatidasFuncRow"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://br1nidbm994:8080/wsa/wsa1", "FaultDetail"),
                      "details.soap_fault.FaultDetail",
                      new javax.xml.namespace.QName("urn:soap-fault:details", "FaultDetail"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("buscaColaboradorPorId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cdn_funcionario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ttColaborador"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "buscaColaboradorPorId_ttColaboradorParam"), ColaboradoresService.logicalis.ws1.totvs.BuscaColaboradorPorId_ttColaboradorRow[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ttColaboradorRow"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://br1nidbm994:8080/wsa/wsa1", "FaultDetail"),
                      "details.soap_fault.FaultDetail",
                      new javax.xml.namespace.QName("urn:soap-fault:details", "FaultDetail"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("buscaTodosColaboradores");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dat_refer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "log_ativos"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ttColaborador"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "buscaTodosColaboradores_ttColaboradorParam"), ColaboradoresService.logicalis.ws1.totvs.BuscaTodosColaboradores_ttColaboradorRow[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ttColaboradorRow"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://br1nidbm994:8080/wsa/wsa1", "FaultDetail"),
                      "details.soap_fault.FaultDetail",
                      new javax.xml.namespace.QName("urn:soap-fault:details", "FaultDetail"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("composicaoSaldoHoras");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cdn_funcionario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "num_mes_refer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "num_ano_refer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_trabalhavel"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_trabalhada"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_afastamento"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_falta"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_ausencia_remun"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_dom_fer"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_adc_noturn"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_ferias"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_saldo_ant"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_saldo_mes"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_saldo_extra"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_extra_ant"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hra_saldo_acum"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "des_indicador"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://br1nidbm994:8080/wsa/wsa1", "FaultDetail"),
                      "details.soap_fault.FaultDetail",
                      new javax.xml.namespace.QName("urn:soap-fault:details", "FaultDetail"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("contabFolhaProfissionais");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "num_mes_ref"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "num_ano_ref"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ttContabFolha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "contabFolhaProfissionais_ttContabFolhaParam"), ColaboradoresService.logicalis.ws1.totvs.ContabFolhaProfissionais_ttContabFolhaRow[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ttContabFolhaRow"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://br1nidbm994:8080/wsa/wsa1", "FaultDetail"),
                      "details.soap_fault.FaultDetail",
                      new javax.xml.namespace.QName("urn:soap-fault:details", "FaultDetail"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("custoProfissional");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dat_refer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ttCustoColab"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "custoProfissional_ttCustoColabParam"), ColaboradoresService.logicalis.ws1.totvs.CustoProfissional_ttCustoColabRow[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ttCustoColabRow"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://br1nidbm994:8080/wsa/wsa1", "FaultDetail"),
                      "details.soap_fault.FaultDetail",
                      new javax.xml.namespace.QName("urn:soap-fault:details", "FaultDetail"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listaEscalas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "num_mes_refer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "num_ano_refer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ttEscalas"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "listaEscalas_ttEscalasParam"), ColaboradoresService.logicalis.ws1.totvs.ListaEscalas_ttEscalasRow[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ttEscalasRow"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://br1nidbm994:8080/wsa/wsa1", "FaultDetail"),
                      "details.soap_fault.FaultDetail",
                      new javax.xml.namespace.QName("urn:soap-fault:details", "FaultDetail"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pagtoFolhaProfissionais");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "num_mes_ref"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "num_ano_ref"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ttPagtoFolha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "pagtoFolhaProfissionais_ttPagtoFolhaParam"), ColaboradoresService.logicalis.ws1.totvs.PagtoFolhaProfissionais_ttPagtoFolhaRow[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ttPagtoFolhaRow"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://br1nidbm994:8080/wsa/wsa1", "FaultDetail"),
                      "details.soap_fault.FaultDetail",
                      new javax.xml.namespace.QName("urn:soap-fault:details", "FaultDetail"), 
                      true
                     ));
        _operations[8] = oper;

    }

    public ColaboradoresServiceObjStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ColaboradoresServiceObjStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ColaboradoresServiceObjStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:soap-fault:details", "FaultDetail");
            cachedSerQNames.add(qName);
            cls = details.soap_fault.FaultDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "apontamentoProfissional_ttBatidasFuncParam");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.ApontamentoProfissional_ttBatidasFuncRow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "apontamentoProfissional_ttBatidasFuncRow");
            qName2 = new javax.xml.namespace.QName("", "ttBatidasFuncRow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "apontamentoProfissional_ttBatidasFuncRow");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.ApontamentoProfissional_ttBatidasFuncRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "batidasTratadas_ttBatidasFuncParam");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.BatidasTratadas_ttBatidasFuncRow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "batidasTratadas_ttBatidasFuncRow");
            qName2 = new javax.xml.namespace.QName("", "ttBatidasFuncRow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "batidasTratadas_ttBatidasFuncRow");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.BatidasTratadas_ttBatidasFuncRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "buscaColaboradorPorId_ttColaboradorParam");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.BuscaColaboradorPorId_ttColaboradorRow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "buscaColaboradorPorId_ttColaboradorRow");
            qName2 = new javax.xml.namespace.QName("", "ttColaboradorRow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "buscaColaboradorPorId_ttColaboradorRow");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.BuscaColaboradorPorId_ttColaboradorRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "buscaTodosColaboradores_ttColaboradorParam");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.BuscaTodosColaboradores_ttColaboradorRow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "buscaTodosColaboradores_ttColaboradorRow");
            qName2 = new javax.xml.namespace.QName("", "ttColaboradorRow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "buscaTodosColaboradores_ttColaboradorRow");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.BuscaTodosColaboradores_ttColaboradorRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "contabFolhaProfissionais_ttContabFolhaParam");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.ContabFolhaProfissionais_ttContabFolhaRow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "contabFolhaProfissionais_ttContabFolhaRow");
            qName2 = new javax.xml.namespace.QName("", "ttContabFolhaRow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "contabFolhaProfissionais_ttContabFolhaRow");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.ContabFolhaProfissionais_ttContabFolhaRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "custoProfissional_ttCustoColabParam");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.CustoProfissional_ttCustoColabRow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "custoProfissional_ttCustoColabRow");
            qName2 = new javax.xml.namespace.QName("", "ttCustoColabRow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "custoProfissional_ttCustoColabRow");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.CustoProfissional_ttCustoColabRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "listaEscalas_ttEscalasParam");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.ListaEscalas_ttEscalasRow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "listaEscalas_ttEscalasRow");
            qName2 = new javax.xml.namespace.QName("", "ttEscalasRow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "listaEscalas_ttEscalasRow");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.ListaEscalas_ttEscalasRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "pagtoFolhaProfissionais_ttPagtoFolhaParam");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.PagtoFolhaProfissionais_ttPagtoFolhaRow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "pagtoFolhaProfissionais_ttPagtoFolhaRow");
            qName2 = new javax.xml.namespace.QName("", "ttPagtoFolhaRow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "pagtoFolhaProfissionais_ttPagtoFolhaRow");
            cachedSerQNames.add(qName);
            cls = ColaboradoresService.logicalis.ws1.totvs.PagtoFolhaProfissionais_ttPagtoFolhaRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void apontamentoProfissional(java.util.Date dat_refer, ColaboradoresService.logicalis.ws1.totvs.holders.ApontamentoProfissional_ttBatidasFuncParamHolder ttBatidasFunc) throws java.rmi.RemoteException, details.soap_fault.FaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "apontamentoProfissional"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dat_refer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                ttBatidasFunc.value = (ColaboradoresService.logicalis.ws1.totvs.ApontamentoProfissional_ttBatidasFuncRow[]) _output.get(new javax.xml.namespace.QName("", "ttBatidasFunc"));
            } catch (java.lang.Exception _exception) {
                ttBatidasFunc.value = (ColaboradoresService.logicalis.ws1.totvs.ApontamentoProfissional_ttBatidasFuncRow[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ttBatidasFunc")), ColaboradoresService.logicalis.ws1.totvs.ApontamentoProfissional_ttBatidasFuncRow[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof details.soap_fault.FaultDetail) {
              throw (details.soap_fault.FaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void batidasTratadas(ColaboradoresService.logicalis.ws1.totvs.BatidasTratadas_ttBatidasFuncRow[] ttBatidasFunc) throws java.rmi.RemoteException, details.soap_fault.FaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "batidasTratadas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ttBatidasFunc});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
        
        
        /*String requestXML = _call.getMessageContext().getRequestMessage().getSOAPPartAsString();
        String responseXML = _call.getMessageContext().getResponseMessage().getSOAPPartAsString();
        
        System.out.println("====================================================");
        System.out.println("REQUEST");
        System.out.println(requestXML);
        System.out.println("====================================================");
        */
        
        _call.setTimeout(1000*60*60);
        
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof details.soap_fault.FaultDetail) {
              throw (details.soap_fault.FaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void buscaColaboradorPorId(int cdn_funcionario, ColaboradoresService.logicalis.ws1.totvs.holders.BuscaColaboradorPorId_ttColaboradorParamHolder ttColaborador) throws java.rmi.RemoteException, details.soap_fault.FaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "buscaColaboradorPorId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(cdn_funcionario)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                ttColaborador.value = (ColaboradoresService.logicalis.ws1.totvs.BuscaColaboradorPorId_ttColaboradorRow[]) _output.get(new javax.xml.namespace.QName("", "ttColaborador"));
            } catch (java.lang.Exception _exception) {
                ttColaborador.value = (ColaboradoresService.logicalis.ws1.totvs.BuscaColaboradorPorId_ttColaboradorRow[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ttColaborador")), ColaboradoresService.logicalis.ws1.totvs.BuscaColaboradorPorId_ttColaboradorRow[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof details.soap_fault.FaultDetail) {
              throw (details.soap_fault.FaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void buscaTodosColaboradores(java.util.Date dat_refer, boolean log_ativos, ColaboradoresService.logicalis.ws1.totvs.holders.BuscaTodosColaboradores_ttColaboradorParamHolder ttColaborador) throws java.rmi.RemoteException, details.soap_fault.FaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "buscaTodosColaboradores"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dat_refer, new java.lang.Boolean(log_ativos)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                ttColaborador.value = (ColaboradoresService.logicalis.ws1.totvs.BuscaTodosColaboradores_ttColaboradorRow[]) _output.get(new javax.xml.namespace.QName("", "ttColaborador"));
            } catch (java.lang.Exception _exception) {
                ttColaborador.value = (ColaboradoresService.logicalis.ws1.totvs.BuscaTodosColaboradores_ttColaboradorRow[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ttColaborador")), ColaboradoresService.logicalis.ws1.totvs.BuscaTodosColaboradores_ttColaboradorRow[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof details.soap_fault.FaultDetail) {
              throw (details.soap_fault.FaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void composicaoSaldoHoras(int cdn_funcionario, int num_mes_refer, int num_ano_refer, javax.xml.rpc.holders.StringHolder hra_trabalhavel, javax.xml.rpc.holders.StringHolder hra_trabalhada, javax.xml.rpc.holders.StringHolder hra_afastamento, javax.xml.rpc.holders.StringHolder hra_falta, javax.xml.rpc.holders.StringHolder hra_ausencia_remun, javax.xml.rpc.holders.StringHolder hra_dom_fer, javax.xml.rpc.holders.StringHolder hra_adc_noturn, javax.xml.rpc.holders.StringHolder hra_ferias, javax.xml.rpc.holders.StringHolder hra_saldo_ant, javax.xml.rpc.holders.StringHolder hra_saldo_mes, javax.xml.rpc.holders.StringHolder hra_saldo_extra, javax.xml.rpc.holders.StringHolder hra_extra_ant, javax.xml.rpc.holders.StringHolder hra_saldo_acum, javax.xml.rpc.holders.StringHolder des_indicador) throws java.rmi.RemoteException, details.soap_fault.FaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "composicaoSaldoHoras"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(cdn_funcionario), new java.lang.Integer(num_mes_refer), new java.lang.Integer(num_ano_refer)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                hra_trabalhavel.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_trabalhavel"));
            } catch (java.lang.Exception _exception) {
                hra_trabalhavel.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_trabalhavel")), java.lang.String.class);
            }
            try {
                hra_trabalhada.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_trabalhada"));
            } catch (java.lang.Exception _exception) {
                hra_trabalhada.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_trabalhada")), java.lang.String.class);
            }
            try {
                hra_afastamento.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_afastamento"));
            } catch (java.lang.Exception _exception) {
                hra_afastamento.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_afastamento")), java.lang.String.class);
            }
            try {
                hra_falta.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_falta"));
            } catch (java.lang.Exception _exception) {
                hra_falta.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_falta")), java.lang.String.class);
            }
            try {
                hra_ausencia_remun.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_ausencia_remun"));
            } catch (java.lang.Exception _exception) {
                hra_ausencia_remun.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_ausencia_remun")), java.lang.String.class);
            }
            try {
                hra_dom_fer.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_dom_fer"));
            } catch (java.lang.Exception _exception) {
                hra_dom_fer.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_dom_fer")), java.lang.String.class);
            }
            try {
                hra_adc_noturn.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_adc_noturn"));
            } catch (java.lang.Exception _exception) {
                hra_adc_noturn.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_adc_noturn")), java.lang.String.class);
            }
            try {
                hra_ferias.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_ferias"));
            } catch (java.lang.Exception _exception) {
                hra_ferias.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_ferias")), java.lang.String.class);
            }
            try {
                hra_saldo_ant.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_saldo_ant"));
            } catch (java.lang.Exception _exception) {
                hra_saldo_ant.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_saldo_ant")), java.lang.String.class);
            }
            try {
                hra_saldo_mes.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_saldo_mes"));
            } catch (java.lang.Exception _exception) {
                hra_saldo_mes.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_saldo_mes")), java.lang.String.class);
            }
            try {
                hra_saldo_extra.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_saldo_extra"));
            } catch (java.lang.Exception _exception) {
                hra_saldo_extra.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_saldo_extra")), java.lang.String.class);
            }
            try {
                hra_extra_ant.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_extra_ant"));
            } catch (java.lang.Exception _exception) {
                hra_extra_ant.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_extra_ant")), java.lang.String.class);
            }
            try {
                hra_saldo_acum.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "hra_saldo_acum"));
            } catch (java.lang.Exception _exception) {
                hra_saldo_acum.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hra_saldo_acum")), java.lang.String.class);
            }
            try {
                des_indicador.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "des_indicador"));
            } catch (java.lang.Exception _exception) {
                des_indicador.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "des_indicador")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof details.soap_fault.FaultDetail) {
              throw (details.soap_fault.FaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void contabFolhaProfissionais(int num_mes_ref, int num_ano_ref, ColaboradoresService.logicalis.ws1.totvs.holders.ContabFolhaProfissionais_ttContabFolhaParamHolder ttContabFolha) throws java.rmi.RemoteException, details.soap_fault.FaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "contabFolhaProfissionais"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(num_mes_ref), new java.lang.Integer(num_ano_ref)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                ttContabFolha.value = (ColaboradoresService.logicalis.ws1.totvs.ContabFolhaProfissionais_ttContabFolhaRow[]) _output.get(new javax.xml.namespace.QName("", "ttContabFolha"));
            } catch (java.lang.Exception _exception) {
                ttContabFolha.value = (ColaboradoresService.logicalis.ws1.totvs.ContabFolhaProfissionais_ttContabFolhaRow[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ttContabFolha")), ColaboradoresService.logicalis.ws1.totvs.ContabFolhaProfissionais_ttContabFolhaRow[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof details.soap_fault.FaultDetail) {
              throw (details.soap_fault.FaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void custoProfissional(java.util.Date dat_refer, ColaboradoresService.logicalis.ws1.totvs.holders.CustoProfissional_ttCustoColabParamHolder ttCustoColab) throws java.rmi.RemoteException, details.soap_fault.FaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "custoProfissional"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dat_refer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                ttCustoColab.value = (ColaboradoresService.logicalis.ws1.totvs.CustoProfissional_ttCustoColabRow[]) _output.get(new javax.xml.namespace.QName("", "ttCustoColab"));
            } catch (java.lang.Exception _exception) {
                ttCustoColab.value = (ColaboradoresService.logicalis.ws1.totvs.CustoProfissional_ttCustoColabRow[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ttCustoColab")), ColaboradoresService.logicalis.ws1.totvs.CustoProfissional_ttCustoColabRow[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof details.soap_fault.FaultDetail) {
              throw (details.soap_fault.FaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void listaEscalas(int num_mes_refer, int num_ano_refer, ColaboradoresService.logicalis.ws1.totvs.holders.ListaEscalas_ttEscalasParamHolder ttEscalas) throws java.rmi.RemoteException, details.soap_fault.FaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "listaEscalas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(num_mes_refer), new java.lang.Integer(num_ano_refer)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                ttEscalas.value = (ColaboradoresService.logicalis.ws1.totvs.ListaEscalas_ttEscalasRow[]) _output.get(new javax.xml.namespace.QName("", "ttEscalas"));
            } catch (java.lang.Exception _exception) {
                ttEscalas.value = (ColaboradoresService.logicalis.ws1.totvs.ListaEscalas_ttEscalasRow[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ttEscalas")), ColaboradoresService.logicalis.ws1.totvs.ListaEscalas_ttEscalasRow[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof details.soap_fault.FaultDetail) {
              throw (details.soap_fault.FaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void pagtoFolhaProfissionais(int num_mes_ref, int num_ano_ref, ColaboradoresService.logicalis.ws1.totvs.holders.PagtoFolhaProfissionais_ttPagtoFolhaParamHolder ttPagtoFolha) throws java.rmi.RemoteException, details.soap_fault.FaultDetail {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis:ColaboradoresService", "pagtoFolhaProfissionais"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(num_mes_ref), new java.lang.Integer(num_ano_ref)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                ttPagtoFolha.value = (ColaboradoresService.logicalis.ws1.totvs.PagtoFolhaProfissionais_ttPagtoFolhaRow[]) _output.get(new javax.xml.namespace.QName("", "ttPagtoFolha"));
            } catch (java.lang.Exception _exception) {
                ttPagtoFolha.value = (ColaboradoresService.logicalis.ws1.totvs.PagtoFolhaProfissionais_ttPagtoFolhaRow[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ttPagtoFolha")), ColaboradoresService.logicalis.ws1.totvs.PagtoFolhaProfissionais_ttPagtoFolhaRow[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof details.soap_fault.FaultDetail) {
              throw (details.soap_fault.FaultDetail) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
