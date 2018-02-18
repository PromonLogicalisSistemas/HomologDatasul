/**
 * ColaboradoresServiceObj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package logicalis.ws1.totvs;

public interface ColaboradoresServiceObj extends java.rmi.Remote {
    public void apontamentoProfissional(java.util.Date dat_refer, ColaboradoresService.logicalis.ws1.totvs.holders.ApontamentoProfissional_ttBatidasFuncParamHolder ttBatidasFunc) throws java.rmi.RemoteException, details.soap_fault.FaultDetail;
    public void batidasTratadas(ColaboradoresService.logicalis.ws1.totvs.BatidasTratadas_ttBatidasFuncRow[] ttBatidasFunc) throws java.rmi.RemoteException, details.soap_fault.FaultDetail;
    public void buscaColaboradorPorId(int cdn_funcionario, ColaboradoresService.logicalis.ws1.totvs.holders.BuscaColaboradorPorId_ttColaboradorParamHolder ttColaborador) throws java.rmi.RemoteException, details.soap_fault.FaultDetail;
    public void buscaTodosColaboradores(java.util.Date dat_refer, boolean log_ativos, ColaboradoresService.logicalis.ws1.totvs.holders.BuscaTodosColaboradores_ttColaboradorParamHolder ttColaborador) throws java.rmi.RemoteException, details.soap_fault.FaultDetail;
    public void composicaoSaldoHoras(int cdn_funcionario, int num_mes_refer, int num_ano_refer, javax.xml.rpc.holders.StringHolder hra_trabalhavel, javax.xml.rpc.holders.StringHolder hra_trabalhada, javax.xml.rpc.holders.StringHolder hra_afastamento, javax.xml.rpc.holders.StringHolder hra_falta, javax.xml.rpc.holders.StringHolder hra_ausencia_remun, javax.xml.rpc.holders.StringHolder hra_dom_fer, javax.xml.rpc.holders.StringHolder hra_adc_noturn, javax.xml.rpc.holders.StringHolder hra_ferias, javax.xml.rpc.holders.StringHolder hra_saldo_ant, javax.xml.rpc.holders.StringHolder hra_saldo_mes, javax.xml.rpc.holders.StringHolder hra_saldo_extra, javax.xml.rpc.holders.StringHolder hra_extra_ant, javax.xml.rpc.holders.StringHolder hra_saldo_acum, javax.xml.rpc.holders.StringHolder des_indicador) throws java.rmi.RemoteException, details.soap_fault.FaultDetail;
    public void contabFolhaProfissionais(int num_mes_ref, int num_ano_ref, ColaboradoresService.logicalis.ws1.totvs.holders.ContabFolhaProfissionais_ttContabFolhaParamHolder ttContabFolha) throws java.rmi.RemoteException, details.soap_fault.FaultDetail;
    public void custoProfissional(java.util.Date dat_refer, ColaboradoresService.logicalis.ws1.totvs.holders.CustoProfissional_ttCustoColabParamHolder ttCustoColab) throws java.rmi.RemoteException, details.soap_fault.FaultDetail;
    public void listaEscalas(int num_mes_refer, int num_ano_refer, ColaboradoresService.logicalis.ws1.totvs.holders.ListaEscalas_ttEscalasParamHolder ttEscalas) throws java.rmi.RemoteException, details.soap_fault.FaultDetail;
    public void pagtoFolhaProfissionais(int num_mes_ref, int num_ano_ref, ColaboradoresService.logicalis.ws1.totvs.holders.PagtoFolhaProfissionais_ttPagtoFolhaParamHolder ttPagtoFolha) throws java.rmi.RemoteException, details.soap_fault.FaultDetail;
}
