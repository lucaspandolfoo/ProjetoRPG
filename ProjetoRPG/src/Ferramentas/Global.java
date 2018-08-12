/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ferramentas;

import java.util.Calendar;

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
}
