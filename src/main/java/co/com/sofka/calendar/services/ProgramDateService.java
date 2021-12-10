package co.com.sofka.calendar.services;

import co.com.sofka.calendar.model.ProgramDate;
import co.com.sofka.calendar.repositories.ProgramDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ProgramDateService {


    @Autowired
    ProgramDateRepository programDateRepository;

    public void save(Flux<ProgramDate> program) {
        program.subscribe(System.out::print);
        program.subscribe(programa -> programDateRepository.save(programa));

    }
}
