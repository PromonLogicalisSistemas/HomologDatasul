import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import ColaboradoresService.logicalis.ws1.totvs.holders.ApontamentoProfissional_ttBatidasFuncParamHolder;
import details.soap_fault.FaultDetail;
import logicalis.ws1.totvs.ColaboradoresServiceObj;
import logicalis.ws1.totvs.ColaboradoresServiceServiceLocator;

public class BuscaApontamentoProfissional {

	public static void main(String[] args) throws ServiceException, FaultDetail, RemoteException {
		ColaboradoresServiceServiceLocator locator = new ColaboradoresServiceServiceLocator();
		ColaboradoresServiceObj service = locator.getColaboradoresServiceObj();
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2016, Calendar.DECEMBER, 01);
		
		Date dat_refer = cal.getTime();
		System.out.println("Data ENVIADA: "+dat_refer);
		
		
		ApontamentoProfissional_ttBatidasFuncParamHolder ttCustoColab = new ApontamentoProfissional_ttBatidasFuncParamHolder();
		System.out.println(Calendar.getInstance().getTime());
		service.apontamentoProfissional(dat_refer, ttCustoColab);
		System.out.println(Calendar.getInstance().getTime());
		System.out.println(ttCustoColab.value.length);
		
		if(ttCustoColab.value.length > 0)
			for(int i=0; i < ttCustoColab.value.length; i++)
				System.out.println(ReflectionToStringBuilder.toString(ttCustoColab.value[i]));

	}

}
