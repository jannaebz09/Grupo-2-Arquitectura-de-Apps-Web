package pe.edu.upc.qalikay.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.OptionPay;
import pe.edu.upc.qalikay.repositories.IOptionPayRepository;

import pe.edu.upc.qalikay.servicesinterfaces.IOptionPayService;

import java.util.List;

@Service
public class OptionPayServiceImplement implements IOptionPayService {
    @Autowired
    private IOptionPayRepository sR;

    @Override
    public void insert(OptionPay optionpay) {
        sR.save(optionpay);
    }

    @Override
    public List<OptionPay> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public OptionPay listId(int id) {
        return sR.findById(id).orElse(new OptionPay());
    }

    @Override
    public List<OptionPay> listaxtarjeta() {
        return sR.listaxtarjeta();
    }
}
