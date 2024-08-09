package br.com.anderson.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Payroll {

    private String workername;
    private String description;
    private Double hourlyPrice;
    private Double workedHours;
    private Double workedPayment;
}
