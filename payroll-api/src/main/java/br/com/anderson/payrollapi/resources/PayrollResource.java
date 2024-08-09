package br.com.anderson.payrollapi.resources;

import br.com.anderson.payrollapi.domain.Payroll;
import br.com.anderson.payrollapi.services.PayrollSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {


    private final PayrollSevice service;


    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){

        return ResponseEntity.ok().body(service.getPayment(workerId,payment));


    }

}

