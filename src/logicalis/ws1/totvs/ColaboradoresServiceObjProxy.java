package logicalis.ws1.totvs;

public class ColaboradoresServiceObjProxy implements logicalis.ws1.totvs.ColaboradoresServiceObj {
  private String _endpoint = null;
  private logicalis.ws1.totvs.ColaboradoresServiceObj colaboradoresServiceObj = null;
  
  public ColaboradoresServiceObjProxy() {
    _initColaboradoresServiceObjProxy();
  }
  
  public ColaboradoresServiceObjProxy(String endpoint) {
    _endpoint = endpoint;
    _initColaboradoresServiceObjProxy();
  }
  
  private void _initColaboradoresServiceObjProxy() {
    try {
      colaboradoresServiceObj = (new logicalis.ws1.totvs.ColaboradoresServiceServiceLocator()).getColaboradoresServiceObj();
      if (colaboradoresServiceObj != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)colaboradoresServiceObj)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)colaboradoresServiceObj)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (colaboradoresServiceObj != null)
      ((javax.xml.rpc.Stub)colaboradoresServiceObj)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public logicalis.ws1.totvs.ColaboradoresServiceObj getColaboradoresServiceObj() {
    if (colaboradoresServiceObj == null)
      _initColaboradoresServiceObjProxy();
    return colaboradoresServiceObj;
  }
  
  public void apontamentoProfissional(java.util.Date dat_refer, ColaboradoresService.logicalis.ws1.totvs.holders.ApontamentoProfissional_ttBatidasFuncParamHolder ttBatidasFunc) throws java.rmi.RemoteException, details.soap_fault.FaultDetail{
    if (colaboradoresServiceObj == null)
      _initColaboradoresServiceObjProxy();
    colaboradoresServiceObj.apontamentoProfissional(dat_refer, ttBatidasFunc);
  }
  
  public void batidasTratadas(ColaboradoresService.logicalis.ws1.totvs.BatidasTratadas_ttBatidasFuncRow[] ttBatidasFunc) throws java.rmi.RemoteException, details.soap_fault.FaultDetail{
    if (colaboradoresServiceObj == null)
      _initColaboradoresServiceObjProxy();
    colaboradoresServiceObj.batidasTratadas(ttBatidasFunc);
  }
  
  public void buscaColaboradorPorId(int cdn_funcionario, ColaboradoresService.logicalis.ws1.totvs.holders.BuscaColaboradorPorId_ttColaboradorParamHolder ttColaborador) throws java.rmi.RemoteException, details.soap_fault.FaultDetail{
    if (colaboradoresServiceObj == null)
      _initColaboradoresServiceObjProxy();
    colaboradoresServiceObj.buscaColaboradorPorId(cdn_funcionario, ttColaborador);
  }
  
  public void buscaTodosColaboradores(java.util.Date dat_refer, boolean log_ativos, ColaboradoresService.logicalis.ws1.totvs.holders.BuscaTodosColaboradores_ttColaboradorParamHolder ttColaborador) throws java.rmi.RemoteException, details.soap_fault.FaultDetail{
    if (colaboradoresServiceObj == null)
      _initColaboradoresServiceObjProxy();
    colaboradoresServiceObj.buscaTodosColaboradores(dat_refer, log_ativos, ttColaborador);
  }
  
  public void composicaoSaldoHoras(int cdn_funcionario, int num_mes_refer, int num_ano_refer, javax.xml.rpc.holders.StringHolder hra_trabalhavel, javax.xml.rpc.holders.StringHolder hra_trabalhada, javax.xml.rpc.holders.StringHolder hra_afastamento, javax.xml.rpc.holders.StringHolder hra_falta, javax.xml.rpc.holders.StringHolder hra_ausencia, javax.xml.rpc.holders.StringHolder hra_ausencia_remun, javax.xml.rpc.holders.StringHolder hra_dom_fer, javax.xml.rpc.holders.StringHolder hra_adc_noturn, javax.xml.rpc.holders.StringHolder hra_adc_noturn_reduz, javax.xml.rpc.holders.StringHolder hra_ferias, javax.xml.rpc.holders.StringHolder hra_saldo_ant, javax.xml.rpc.holders.StringHolder hra_saldo_mes, javax.xml.rpc.holders.StringHolder hra_saldo_extra, javax.xml.rpc.holders.StringHolder des_indicador) throws java.rmi.RemoteException, details.soap_fault.FaultDetail{
    if (colaboradoresServiceObj == null)
      _initColaboradoresServiceObjProxy();
    colaboradoresServiceObj.composicaoSaldoHoras(cdn_funcionario, num_mes_refer, num_ano_refer, hra_trabalhavel, hra_trabalhada, hra_afastamento, hra_falta, hra_ausencia, hra_ausencia_remun, hra_dom_fer, hra_adc_noturn, hra_adc_noturn_reduz, hra_ferias, hra_saldo_ant, hra_saldo_mes, hra_saldo_extra, des_indicador);
  }
  
  public void contabFolhaProfissionais(int num_mes_ref, int num_ano_ref, ColaboradoresService.logicalis.ws1.totvs.holders.ContabFolhaProfissionais_ttContabFolhaParamHolder ttContabFolha) throws java.rmi.RemoteException, details.soap_fault.FaultDetail{
    if (colaboradoresServiceObj == null)
      _initColaboradoresServiceObjProxy();
    colaboradoresServiceObj.contabFolhaProfissionais(num_mes_ref, num_ano_ref, ttContabFolha);
  }
  
  public void custoProfissional(java.util.Date dat_refer, ColaboradoresService.logicalis.ws1.totvs.holders.CustoProfissional_ttCustoColabParamHolder ttCustoColab) throws java.rmi.RemoteException, details.soap_fault.FaultDetail{
    if (colaboradoresServiceObj == null)
      _initColaboradoresServiceObjProxy();
    colaboradoresServiceObj.custoProfissional(dat_refer, ttCustoColab);
  }
  
  public void listaEscalas(int num_mes_refer, int num_ano_refer, ColaboradoresService.logicalis.ws1.totvs.holders.ListaEscalas_ttEscalasParamHolder ttEscalas) throws java.rmi.RemoteException, details.soap_fault.FaultDetail{
    if (colaboradoresServiceObj == null)
      _initColaboradoresServiceObjProxy();
    colaboradoresServiceObj.listaEscalas(num_mes_refer, num_ano_refer, ttEscalas);
  }
  
  public void pagtoFolhaProfissionais(int num_mes_ref, int num_ano_ref, ColaboradoresService.logicalis.ws1.totvs.holders.PagtoFolhaProfissionais_ttPagtoFolhaParamHolder ttPagtoFolha) throws java.rmi.RemoteException, details.soap_fault.FaultDetail{
    if (colaboradoresServiceObj == null)
      _initColaboradoresServiceObjProxy();
    colaboradoresServiceObj.pagtoFolhaProfissionais(num_mes_ref, num_ano_ref, ttPagtoFolha);
  }
  
  
}