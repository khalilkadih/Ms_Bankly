package com.youcode.operation;


import com.youcode.operation.Repository.OperationRep;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;


@SpringBootApplication
@EnableFeignClients("com.youcode")
@EnableDiscoveryClient
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class OperationApplication  implements CommandLineRunner {
    private final OperationRep operationRep;

    public OperationApplication(OperationRep operationRep) {
        this.operationRep = operationRep;
    }

    public static void main(String[] args) {
        SpringApplication.run(OperationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
     /*   System.out.println("Your OS name -> " + System.getProperty("os.name"));
        System.out.println("Your OS version -> " + System.getProperty("os.version"));
        System.out.println("Your OS Architecture -> " + System.getProperty("os.arch"));*/


    /*    Operation operation= new Operation();
        operation.setOperationType(Mettre);
        operation.setSolde(1111d);
        operation.setCompteId(1234);
        operation.setReferenceOPeration(12345);
        operationRep.save(operation);*/
    }
}
