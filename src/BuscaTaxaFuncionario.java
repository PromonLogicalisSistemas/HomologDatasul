import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import ColaboradoresService.logicalis.ws1.totvs.holders.CustoProfissional_ttCustoColabParamHolder;
import details.soap_fault.FaultDetail;
import logicalis.ws1.totvs.ColaboradoresServiceObj;
import logicalis.ws1.totvs.ColaboradoresServiceServiceLocator;

public class BuscaTaxaFuncionario {

	public static void main(String[] args) throws ServiceException, FaultDetail, RemoteException {
		ColaboradoresServiceServiceLocator locator = new ColaboradoresServiceServiceLocator();
		ColaboradoresServiceObj service = locator.getColaboradoresServiceObj();
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2016, 1, 1);
		
		Date dat_refer = cal.getTime();
		
		CustoProfissional_ttCustoColabParamHolder ttCustoColab = new CustoProfissional_ttCustoColabParamHolder();
		System.out.println(Calendar.getInstance().getTime());
		service.custoProfissional(dat_refer, ttCustoColab);
		System.out.println(Calendar.getInstance().getTime());
		System.out.println(ttCustoColab.value.length);
		
		if(ttCustoColab.value.length > 0)
			for(int i=0; i < ttCustoColab.value.length; i++)
				System.out.println(ttCustoColab.value[i].getVal_custo_hora()+" -> "+ttCustoColab.value[i].getCdn_funcionario());

	}

}
