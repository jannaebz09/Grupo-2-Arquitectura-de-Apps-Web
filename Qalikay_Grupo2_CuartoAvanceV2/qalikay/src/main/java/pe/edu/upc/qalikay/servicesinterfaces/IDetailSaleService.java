package pe.edu.upc.qalikay.servicesinterfaces;

import pe.edu.upc.qalikay.entities.DetailSale;

import java.util.List;

public interface IDetailSaleService {
    public void insert(DetailSale detailSale);
    public List<DetailSale> list();

    public void delete(int id);
    public DetailSale listId(int id);
}
