package pe.edu.upc.qalikay.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.DetailSale;
import pe.edu.upc.qalikay.entities.OptionPay;
import pe.edu.upc.qalikay.repositories.IDetailSaleRepository;
import pe.edu.upc.qalikay.servicesinterfaces.IDetailSaleService;

import java.util.List;

@Service
public class DetailSaleServiceImplement implements IDetailSaleService {
    @Autowired
    private IDetailSaleRepository dR;

    @Override
    public void insert(DetailSale detailSale) {
        dR.save(detailSale);
        dR.actualizacionTotal();
    }

    @Override
    public List<DetailSale> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int id) {
        dR.deleteById(id);

    }

    @Override
    public DetailSale listId(int id) {
        return dR.findById(id).orElse(new DetailSale());
    }
}
