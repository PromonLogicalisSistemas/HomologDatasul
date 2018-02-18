import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.StringHolder;

import details.soap_fault.FaultDetail;
import logicalis.ws1.totvs.ColaboradoresServiceObj;
import logicalis.ws1.totvs.ColaboradoresServiceServiceLocator;

public class BuscaComposicaoSaldoHora {

	public static void main(String[] args) throws ServiceException, Exception {
		ColaboradoresServiceServiceLocator locator = new ColaboradoresServiceServiceLocator();
		locator.setColaboradoresServiceObjEndpointAddress("https://br1nidbm002:8080/wsa/wsa1");
		ColaboradoresServiceObj service = locator.getColaboradoresServiceObj();

		StringHolder hra_trabalhavel = new StringHolder();
		StringHolder hra_trabalhada = new StringHolder();
		StringHolder hra_afastamento = new StringHolder();
		StringHolder hra_falta = new StringHolder();
		StringHolder hra_ausencia = new StringHolder();
		StringHolder hra_ausencia_remun = new StringHolder();
		StringHolder hra_dom_fer = new StringHolder();
		StringHolder hra_adc_noturn = new StringHolder();
		StringHolder hra_adc_noturn_reduz = new StringHolder();
		StringHolder hra_ferias = new StringHolder();
		StringHolder hra_saldo_ant = new StringHolder();
		StringHolder hra_saldo_mes = new StringHolder();
		StringHolder hra_saldo_extra = new StringHolder();
		StringHolder des_indicador = new StringHolder();

		//System.out.println(Calendar.getInstance().getTime());
		// Imprime o cabeçalho
		System.out.printf("registro,data_referencia,hra_trabalhavel,hra_trabalhada,hra_afastamento,hra_falta,hra_ausencia,hra_ausencia_remun,hra_dom_fer,hra_adc_noturn,hra_adc_noturn_reduz,hra_ferias,hra_saldo_ant,hra_saldo_mes,hra_saldo_extra,des_indicador\n");
		
		String rawContent = new String(Files.readAllBytes(Paths.get("REs.txt")));
		String lines[] = rawContent.split("\\r?\\n");
		for(String re : lines){
		service.composicaoSaldoHoras(Integer.parseInt(re), 2, 2017, hra_trabalhavel, hra_trabalhada, hra_afastamento, hra_falta,
				hra_ausencia, hra_ausencia_remun, hra_dom_fer, hra_adc_noturn, hra_adc_noturn_reduz, hra_ferias,
				hra_saldo_ant, hra_saldo_mes, hra_saldo_extra, des_indicador);
		

		System.out.printf("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
				re, "Fev/2017",
				hra_trabalhavel.value, hra_trabalhada.value, hra_afastamento.value, hra_falta.value, hra_ausencia.value,
				hra_ausencia_remun.value, hra_dom_fer.value, hra_adc_noturn.value, hra_adc_noturn_reduz.value,
				hra_ferias.value, hra_saldo_ant.value, hra_saldo_mes.value, hra_saldo_extra.value, des_indicador.value);
		}
	}
}


//System.out.printf(
//"hra_trabalhavel=%s, hra_trabalhada=%s, hra_afastamento=%s, hra_falta=%s, hra_ausencia=%s, hra_ausencia_remun=%s, hra_dom_fer=%s, hra_adc_noturn=%s, hra_adc_noturn_reduz=%s, hra_ferias=%s, hra_saldo_ant=%s, hra_saldo_mes=%s, hra_saldo_extra=%s, des_indicador=%s\n",
//hra_trabalhavel.value, hra_trabalhada.value, hra_afastamento.value, hra_falta.value, hra_ausencia.value,
//hra_ausencia_remun.value, hra_dom_fer.value, hra_adc_noturn.value, hra_adc_noturn_reduz.value,
//hra_ferias.value, hra_saldo_ant.value, hra_saldo_mes.value, hra_saldo_extra.value, des_indicador.value);
