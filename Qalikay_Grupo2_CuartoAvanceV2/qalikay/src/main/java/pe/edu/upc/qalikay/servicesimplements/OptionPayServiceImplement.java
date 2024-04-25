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
    private IOptionPayRepository oR;

    @Override
    public void insert(OptionPay optionpay) {
        oR.save(optionpay);
    }

    @Override
    public List<OptionPay> list() {
        return oR.findAll();
    }

    @Override
    public void delete(int id) {
        oR.deleteById(id);
    }

    @Override
    public OptionPay listId(int id) {
        return oR.findById(id).orElse(new OptionPay());
    }

    @Override
    public List<OptionPay> listaxtarjeta() {
        return oR.listaxtarjeta();
    }
}
