import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.rpc.ServiceException;

import ColaboradoresService.logicalis.ws1.totvs.BatidasTratadas_ttBatidasFuncRow;
import details.soap_fault.FaultDetail;
import logicalis.ws1.totvs.ColaboradoresServiceObj;
import logicalis.ws1.totvs.ColaboradoresServiceServiceLocator;

public class EnviaApontamentoProfissionalTratado {

	public static void main(String[] args) throws ServiceException, FaultDetail, RemoteException {
		ColaboradoresServiceServiceLocator locator = new ColaboradoresServiceServiceLocator();
		ColaboradoresServiceObj service = locator.getColaboradoresServiceObj();
		
		BatidasTratadas_ttBatidasFuncRow[] ttBatidasFuncRow = {
				new BatidasTratadas_ttBatidasFuncRow(90940, Calendar.getInstance().getTime(), "09:19","00:00","TB","TB"), 
				new BatidasTratadas_ttBatidasFuncRow(90940, Calendar.getInstance().getTime(), "13:13","00:00", "TB","TB")
				};
		
		System.out.println(Calendar.getInstance().getTime());
		service.batidasTratadas(ttBatidasFuncRow);
		System.out.println(Calendar.getInstance().getTime());
		
	}
}
