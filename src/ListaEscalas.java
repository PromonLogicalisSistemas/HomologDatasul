import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.rpc.ServiceException;

import ColaboradoresService.logicalis.ws1.totvs.holders.ListaEscalas_ttEscalasParamHolder;
import details.soap_fault.FaultDetail;
import logicalis.ws1.totvs.ColaboradoresServiceObj;
import logicalis.ws1.totvs.ColaboradoresServiceServiceLocator;

public class ListaEscalas {

	public static void main(String[] args) throws ServiceException, FaultDetail, RemoteException {
		ColaboradoresServiceServiceLocator locator = new ColaboradoresServiceServiceLocator();
		ColaboradoresServiceObj service = locator.getColaboradoresServiceObj();
		
		
		ListaEscalas_ttEscalasParamHolder ttEscalas = new ListaEscalas_ttEscalasParamHolder();
		
		System.out.println(Calendar.getInstance().getTime());
		service.listaEscalas(12, 2016, ttEscalas);
		System.out.println(Calendar.getInstance().getTime());
		
		
		System.out.println(ttEscalas.value.length);
		
		if(ttEscalas.value.length > 0)
			for(int i=0; i < ttEscalas.value.length; i++)
				System.out.println(ttEscalas.value[i].getCdn_funcionario()+" -> Dia:"+ttEscalas.value[i].getNum_dia() +"  "+ttEscalas.value[i].getHra_ini_jornada()+" até "+ttEscalas.value[i].getHra_fim_jornada() +" cód:"+ ttEscalas.value[i].getCod_tipo_dia());

	}

}
