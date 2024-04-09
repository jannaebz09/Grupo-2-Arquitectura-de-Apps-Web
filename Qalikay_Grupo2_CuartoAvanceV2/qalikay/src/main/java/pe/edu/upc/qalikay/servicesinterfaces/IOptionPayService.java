package pe.edu.upc.qalikay.servicesinterfaces;

import pe.edu.upc.qalikay.entities.OptionPay;


import java.util.List;

public interface IOptionPayService {

    public void insert(OptionPay optionpay);
    public List<OptionPay> list();

    public void delete(int id);
    public OptionPay listId(int id);
}
