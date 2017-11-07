package com.choucair.lab.com.choucair.lab.datadriven;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    		try {
    			List<TransaccionModel> DatosTransaccionList= new ArrayList<TransaccionModel>();
    			CSVReader dtdTransaccion = new CSVReader(new FileReader("src/test/resources/datadriven/datadriventransaccion.csv"), ';');
    			String[] record = null;
    			
    			while((record = dtdTransaccion.readNext()) != null) {
    				TransaccionModel transaccionModel = new TransaccionModel();
    				transaccionModel.setStrCuentaOrigen(record[0]);
    				transaccionModel.setStrCuentaDestino(record[1]);
    				transaccionModel.setStrImporte(record[2]);
    				DatosTransaccionList.add(transaccionModel);				
    			}
    			//Agregue este comentario para demostrar la fusión
    			for(int i = 0; i < DatosTransaccionList.size();i++) {
    				System.out.println(DatosTransaccionList.get(i).getStrCuentaOrigen() + DatosTransaccionList.get(i).getStrCuentaDestino() + DatosTransaccionList.get(i).getStrImporte());
    			}
    			
    		}catch(Exception ex) {
    			
    		}
    		
    		
    	
    }
}
