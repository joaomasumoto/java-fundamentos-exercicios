package exercicio7;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 * Objetivo Geral:
 * Este programa exibe a data e hora atual em diferentes fusos horários (UTC, São Paulo, Londres e Nova Iorque).
 *
 * Conceitos Aplicados:
 * - Fusos Horários: Uso das classes `ZoneId` e `ZonedDateTime` para manipular horários em diferentes regiões.
 * - Localização Global: Exibição de horários para diversos fusos simultaneamente.
 */
public class application {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now(ZoneId.of("UTC"));
        System.out.println("Data e hora local: " + today);

        ZonedDateTime saoPauloTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("SAO PAULO: " + saoPauloTime);

        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("LONDRES: " + londonTime);

        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("NOVA IORQUE: " + newYorkTime);
    }
}