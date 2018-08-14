/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author Windows
 */
public class Global {
    
     public static String retornaDataHoraAtual(int pTipo) {
        String dataRetorno = "";
        Calendar agora = Calendar.getInstance();
        String am_Pm = String.valueOf(agora.get((Calendar.AM_PM)));
        // horas, minutos e segundos
        int dia = agora.get(Calendar.DAY_OF_MONTH);
        int mes = agora.get(Calendar.MONTH);
        mes += 1;
        int ano = agora.get(Calendar.YEAR);
        int horas = agora.get(Calendar.HOUR);
        int minutos = agora.get(Calendar.MINUTE);
        //int segundos = agora.get(Calendar.SECOND);
        if (am_Pm.equals("0")) {
            //;
        } else {
            horas += 12;
        }

        if (pTipo == 1) { //Retorna Data e Hora
            dataRetorno = String.valueOf(String.format("%02d", dia))
                    + "/"
                    + String.valueOf(String.format("%02d", mes))
                    + "/"
                    + String.valueOf(ano + " - " + String.format("%02d", horas) + ":" + String.format("%02d", minutos));
        } else if (pTipo == 2) { //Retorna somente Data
            dataRetorno = String.valueOf(String.format("%02d", dia))
                    + "/"
                    + String.valueOf(String.format("%02d", mes))
                    + "/"
                    + String.valueOf(ano);
        } else if (pTipo == 3) { //Retorna somente Hora
            dataRetorno = String.valueOf(String.format("%02d", horas) + ":" + String.format("%02d", minutos));
        } else if (pTipo == 4) { //Retorna somente Hora
            dataRetorno = ano + "-" + String.valueOf(String.format("%02d", mes)) + "-" + String.valueOf(String.format("%02d", dia)) + " " + String.format("%02d", horas) + ":" + String.format("%02d", minutos);
        }

        return dataRetorno;
    }
     
      public static String lerArquivo(String caminho,int linhaNumero){
        try{
            BufferedReader ler = new BufferedReader(new FileReader (caminho));
            String line = "";
            int counter=0;
            while((line=ler.readLine())!=null){
                if(counter==linhaNumero){
                   break;
                }
                counter++;
            }
           return line;

        }catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
         return null;
    }
      
        public static boolean validarEmail (String email) {
                boolean isValid = false;

                String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
                CharSequence inputStr = email;

                Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(inputStr);
                if (matcher.matches()) {
                    isValid = true;
                }
                return isValid;
            }
        
         public static boolean validarNome(String name){
                boolean isValid = false;
                Pattern p = Pattern.compile("^(([a-zA-Z ]|[é])*)$");
                Matcher m = p.matcher(name);
                if(m.find()) {
                    return isValid = true;
                }
                return isValid;

            }
}
