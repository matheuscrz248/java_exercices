package localdatetime.local_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // ── LocalDate — só data, sem hora ──────────────────────
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate birthday = LocalDate.of(2000, 3, 15);
        System.out.println("Birthday: " + birthday);

        // operações com data
        LocalDate nextWeek = today.plusDays(7);
        LocalDate lastMonth = today.minusMonths(1);
        System.out.println("Next week: " + nextWeek);
        System.out.println("Last month: " + lastMonth);

        // comparações
        System.out.println("Is after birthday: " + today.isAfter(birthday));
        System.out.println("Is before birthday: " + today.isBefore(birthday));

        // diferença entre datas
        Period period = Period.between(birthday, today);
        System.out.println("Age: " + period.getYears() + " years, "
                + period.getMonths() + " months, "
                + period.getDays() + " days");

        // dia da semana e mês
        System.out.println("Day of week: " + today.getDayOfWeek());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day of year: " + today.getDayOfYear());

        // ── LocalDateTime — data + hora ────────────────────────
        LocalDateTime now = LocalDateTime.now();
        System.out.println("\nNow: " + now);

        LocalDateTime meeting = LocalDateTime.of(2026, 6, 20, 14, 30);
        System.out.println("Meeting: " + meeting);

        // operações com data e hora
        LocalDateTime inTwoHours = now.plusHours(2);
        LocalDateTime yesterday = now.minusDays(1);
        System.out.println("In two hours: " + inTwoHours);
        System.out.println("Yesterday: " + yesterday);

        // diferença entre data e hora
        Duration duration = Duration.between(now, meeting);
        System.out.println("Hours until meeting: " + duration.toHours());
        System.out.println("Minutes until meeting: " + duration.toMinutes());

        // ── Parse — String para LocalDateTime ──────────────────
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime parsed = LocalDateTime.parse("20/06/2026 14:30", fmt);
        System.out.println("\nParsed: " + parsed);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd, M, yyyy, HH, mm");
        LocalDateTime parsed2 = LocalDateTime.parse("20, 6, 2026, 14, 30", fmt2);
        System.out.println("Parsed 2: " + parsed2);

        // ── Formatação ─────────────────────────────────────────
        System.out.println("\nFormatted: " + now.format(fmt));

        // extraindo partes
        System.out.println("Year: " + now.getYear());
        System.out.println("Month: " + now.getMonthValue());
        System.out.println("Day: " + now.getDayOfMonth());
        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());
        System.out.println("Second: " + now.getSecond());
    }
}
