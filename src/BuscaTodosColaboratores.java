import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import ColaboradoresService.logicalis.ws1.totvs.BuscaTodosColaboradores_ttColaboradorRow;
import ColaboradoresService.logicalis.ws1.totvs.holders.BuscaTodosColaboradores_ttColaboradorParamHolder;
import details.soap_fault.FaultDetail;
import logicalis.ws1.totvs.ColaboradoresServiceObj;
import logicalis.ws1.totvs.ColaboradoresServiceServiceLocator;

public class BuscaTodosColaboratores {

	
	
	public static String imprimeColaborador(BuscaTodosColaboradores_ttColaboradorRow colab){
		return ReflectionToStringBuilder.toString(colab);
	}
	
	public static void main(String[] args) throws ServiceException, FaultDetail, RemoteException {
		ColaboradoresServiceServiceLocator locator = new ColaboradoresServiceServiceLocator();
		ColaboradoresServiceObj service = locator.getColaboradoresServiceObj();
		
		Calendar last_year = Calendar.getInstance();
		last_year.set(2014, 1, 1);
		Date dat_refer = last_year.getTime();
		BuscaTodosColaboradores_ttColaboradorParamHolder ttColaborador = new BuscaTodosColaboradores_ttColaboradorParamHolder();
		service.buscaTodosColaboradores(dat_refer, false, ttColaborador );
		System.out.println(ttColaborador.value.length);
		while(ttColaborador.value.length > 0){
			//System.out.println(ttColaborador.value[0].getNom_conhecido());
			System.out.println(imprimeColaborador(ttColaborador.value[0]));
		}
		

	}

}
